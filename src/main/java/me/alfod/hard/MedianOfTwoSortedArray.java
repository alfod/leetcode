package me.alfod.hard;

/**
 * Created by Arvin Alfod on 2018/4/25.
 */
public class MedianOfTwoSortedArray {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {


        final int sumLength = nums1.length + nums2.length;
        int halfSumLength = (sumLength + 1) / 2;
        final boolean isEven = sumLength % 2 == 0;
        if (nums1.length == 0 || nums2.length == 0) {
            if (nums2.length == 0 && nums1.length == 0) {
                return 0;
            }
            if (nums2.length == 0) {
                nums2 = nums1;
            }
            if (isEven) {
                return (double) (nums2[halfSumLength] + nums2[halfSumLength - 1]) / 2;
            } else {
                return (double) nums2[halfSumLength - 1];
            }
        }
        final int nums1Last = nums1[nums1.length - 1], nums2Last = nums2[nums2.length - 1];
        final int nums1First = nums1[0], nums2First = nums2[0];

        if (nums1Last < nums2First) {
            return getMiddle(nums1, nums2);
        }

        if (nums1First > nums2Last) {
            return getMiddle(nums2, nums1);
        }


        int[] notGreater1 = new int[]{nums1.length / 2 + 1, nums1.length / 2 + 1};
        int[] notGreater2;
        int num = nums1[notGreater1[1] - 1];

        int notGreaterSum, notGreaterSumMax, notGreaterSumMin, notGreater2Min, notGreater2Max;
        int[] range1 = new int[]{0, nums1.length - 1}, range2 = new int[]{0, nums2.length - 1};
        while (true) {
            notGreater2 = findNotGreaterNum(nums2, num, range2);
            //notGreaterSum = notGreater1 + notGreater2;
            notGreaterSumMin = notGreater1[0] + notGreater2[0];
            notGreaterSumMax = notGreater1[1] + notGreater2[1];
            if (notGreaterSumMax < halfSumLength) {
                range1[0] = notGreater1[1] - 1;
                range2[0] = notGreater2[1] - 1;
                notGreater1[1] = (range1[1] + notGreater1[0]) / 2;
            }
            if (notGreaterSumMin > halfSumLength) {
                range1[1] = notGreater1[0] - 1;
                range2[1] = notGreater2[0] - 1;
                notGreater1[0] = (range1[0] + notGreater1[1]) / 2;
            }

            if (notGreaterSumMax >= halfSumLength && notGreaterSumMin <= halfSumLength) {
                num = nums1[notGreater1[0] - 1];
                if (isEven) {
                    if (notGreater2[1] == 0) {
                        return (double) (num + nums1[notGreater1[1]]) / 2;
                    } else {
                        int s1 = nums1[notGreater1[0]];
                        int s2 = nums2[notGreater2[0]];
                        int value = s1 > s2 ? s2 : s1;
                        return (double) (num + value) / 2;
                    }
                } else {
                    return (double) num;
                }
            }

            if (range1[1] - range1[0] < 2) {
                num = nums2[(range2[0] + range2[1]) / 2];
                int[] range = range1;
                range1 = range2;
                range2 = range;

                int[] nums = nums1;
                nums1 = nums2;
                nums2 = nums;

                int[] notGreater = notGreater1;
                notGreater1 = findNotGreaterNum(nums1, num, range1);
                notGreater2 = notGreater;
            }
        }


    }

    public double getMiddle(int[] first, int[] last) {
        final int sumLength = first.length + last.length;
        final int halfSumLength = sumLength / 2;
        final boolean isEven = sumLength % 2 == 0;
        final int nums1Last = first[first.length - 1];
        final int nums2First = last[0];

        if (isEven) {
            if (halfSumLength < first.length) {
                return (first[halfSumLength] + first[halfSumLength - 1]) / 2;
            } else if (halfSumLength > first.length + 1) {
                int startIndex = halfSumLength - first.length;
                return (first[startIndex] + first[startIndex - 1]) / 2;
            } else {
                return (double) (nums1Last + nums2First) / 2;
            }
        } else {
            if (halfSumLength < first.length) {
                return first[halfSumLength];
            } else {
                return last[halfSumLength - first.length];
            }
        }
    }


    public int[] findNotGreaterNum(int[] nums, final int n, int[] range) {

        if (n < nums[0]) {
            return new int[]{0, 0};
        }
        if (n >= nums[nums.length - 1]) {
            return new int[]{nums.length, nums.length};
        }
        if (range[0] == 0 && range[1] == 0) {
            range[0] = 0;
            range[1] = nums.length - 1;
        }
        int small = nums[range[0]], big = nums[range[1]];
        if (range[1] - range[0] < 2) {
            if (n < small) {
                return new int[]{range[0], range[0]};
            }
            if (n < big) {
                return new int[]{range[1], range[1]};
            }
            return new int[]{range[1] + 1, range[1] + 1};
        }
        int index = (range[0] + range[1]) / 2;

        while (true) {
            small = nums[index];
            big = nums[index + 1];
            if (small <= n && big > n) {
                return findRange(nums, n, index, range);
            } else if (big == n) {
                return findRange(nums, n, index, range);
            } else if (small > n) {
                range[1] = index;
                index = (index + range[0]) / 2;
            } else {
                range[0] = index;
                index = (index + range[1]) / 2;
            }
        }
    }

    /**
     * @param numberArray 检测的数组
     * @param number      检测的数字
     * @param index       该数字的可能位置
     * @param range       该数字出现的位置的开区间
     * @return
     */
    public int[] findRange(final int[] numberArray, final int number, int index, final int[] range) {
        int[] leftRange = new int[]{Math.max(range[0], 0), Math.min(range[1], numberArray.length - 1)};
        int leftIndex, leftIndexValue, rightIndex, rightIndexValue;
        int[] resultRange = new int[]{-1, -1};
        Integer rightIndexMin = null, rightIndexMax = null;
        final int length = numberArray.length, firstValue = numberArray[0], lastValue = numberArray[length - 1];
        while (true) {
            leftIndex = (leftRange[0] + leftRange[1]) / 2;
            leftIndexValue = numberArray[leftIndex];
            if (number > leftIndexValue) {
                if (number < numberArray[leftIndex + 1]) {
                    resultRange[0] = leftIndex;
                    resultRange[1] = leftIndex + 1;
                    return resultRange;
                } else if (number == numberArray[leftIndex + 1]) {
                    resultRange[0] = leftIndex;
                    rightIndexMin = leftIndex + 1;
                    break;
                }
                if (leftIndex == length - 2) {
                    if (number > numberArray[length - 1]) {
                        resultRange[0] = length;
                        resultRange[1] = length;
                        return resultRange;
                    }
                    if (number == numberArray[length - 1]) {
                        resultRange[0] = leftIndex;
                        resultRange[1] = length;
                        return resultRange;
                    }
                    if (number <  numberArray[length - 1]) {
                        resultRange[0] = leftIndex;
                        resultRange[1] = length - 1;
                        return resultRange;
                    }
                }
                leftRange[0] = leftIndex;
            } else if (number == leftIndexValue) {
                if (leftIndex == 0) {
                    resultRange[0] = -1;
                    if (number < numberArray[1]) {
                        resultRange[1] = 1;
                        return resultRange;
                    }
                    rightIndexMin = leftIndex;
                    break;
                }
                if (number > numberArray[leftIndex - 1]) {
                    resultRange[0] = leftIndex - 1;
                    rightIndexMin = leftIndex;
                    break;
                }
                leftRange[1] = leftIndex;
            } else if (number < leftIndexValue) {
                if (leftIndex == 0) {
                    resultRange[0] = -1;
                    resultRange[1] = -1;
                    return resultRange;
                }
                if (number > numberArray[leftIndex - 1]) {
                    resultRange[0] = leftIndex - 1;
                    resultRange[1] = leftIndex;
                    return resultRange;
                }
                leftRange[1] = leftIndex;
            }
        }

        int[] rightRange = new int[]{rightIndexMin, Math.min(range[1], numberArray.length - 1)};
        while (true) {
            rightIndex = (rightRange[1] + rightRange[0]) / 2;
            rightIndexValue = numberArray[rightIndex];
            if (number > rightIndexValue) {
                if (rightIndex == length - 1) {
                    resultRange[1] = length;
                    return resultRange;
                }
                if (number < numberArray[rightIndex + 1]) {
                    resultRange[0] = rightIndex;
                    resultRange[1] = rightIndex + 1;
                    return resultRange;
                }
                rightRange[0] = rightIndex;
            } else if (number == rightIndexValue) {
                if (rightIndex == length - 1) {
                    resultRange[1] = length;
                    return resultRange;
                }
                if (number < numberArray[rightIndex + 1]) {
                    resultRange[1] = rightIndex + 1;
                    return resultRange;
                }
                rightRange[0] = rightIndex;
            } else if (number < rightIndexValue) {
                if (number > numberArray[rightIndex - 1]) {
                    resultRange[0] = rightIndex - 1;
                    resultRange[1] = rightIndex;
                    return resultRange;
                }
                if (number == numberArray[rightIndex - 1]) {
                    resultRange[1] = rightIndex;
                    return resultRange;
                }
            }
        }
    }
}
