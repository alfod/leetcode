package me.alfod.hard;

/**
 * Created by Arvin Alfod on 2018/4/25.
 *
 * @author alfod
 */
public class MedianOfTwoSortedArray {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        final int length1 = nums1.length, length2 = nums2.length;
        final int sumLength = length1 + length2, halfSumLength = sumLength / 2;
        final boolean isEven = sumLength % 2 == 0;
        int[] tempArray;
        if (length1 == 0 || length2 == 0) {
            if (length1 == 0 && length2 == 0) {
                return 0.0;
            }
            if (length1 == 0) {
                tempArray = nums2;
            } else {
                tempArray = nums1;
            }
            if (isEven) {
                return (double) (tempArray[halfSumLength] + tempArray[halfSumLength - 1]) / 2;
            } else {
                return tempArray[halfSumLength];
            }
        }

        if (!isEven) {
            return findByIndex(nums1, nums2, halfSumLength);
        } else {
            int value1 = findByIndex(nums1, nums2, halfSumLength);
            int value2 = findByIndex(nums1, nums2, halfSumLength - 1);
            return (double) (value1 + value2) / 2;
        }
    }


    /**
     * @param nums1 array 1
     * @param nums2 array 2
     * @param index index from 0
     * @return the value rest with index
     */
    public int findByIndex(int[] nums1, int[] nums2, final int index) {
        final int length1 = nums1.length, length2 = nums2.length;
        final int sumLength = length1 + length2, halfSumLength = sumLength / 2;
        int[] tempArray, tempArray1, tempArray2, countedIndexRange, indexRange = new int[2];
        int tempValue, tempIndex, indexMin, indexMax;
        if (index < 0 || index >= sumLength) {
            throw new RuntimeException("index is not valid " + index);
        }

        tempArray1 = nums1;
        tempArray2 = nums2;
        indexRange[0] = 0;
        indexRange[1] = tempArray1.length;
        while (true) {
            tempIndex = (indexRange[0] + indexRange[1]) / 2;
            tempValue = tempArray1[tempIndex];
            countedIndexRange = findRange(tempArray2, tempValue);
            indexMin = tempIndex + countedIndexRange[0];
            indexMax = tempIndex + countedIndexRange[1];
            if (index >= indexMin && index <= indexMax) {
                return tempValue;
            }
            if (indexRange[1] - indexRange[0] <= 1) {
                tempArray = tempArray1;
                tempArray1 = tempArray2;
                tempArray2 = tempArray;
                indexRange[0] = 0;
                indexRange[1] = tempArray1.length;
                continue;
            }
            if (index > indexMax) {
                indexRange[0] = tempIndex;
            }
            if (index < indexMin) {
                indexRange[1] = tempIndex;
            }

        }


    }

    public int[] findRange(final int[] numberArray, final int number) {
        return findRange(numberArray, number, new int[]{0, numberArray.length - 1});
    }

    /**
     * @param numberArray 检测的数组
     * @param number      检测的数字
     * @param range       该数字出现的位置的开区间
     * @return
     */
    public int[] findRange(final int[] numberArray, final int number, final int[] range) {
        int[] leftRange = new int[]{Math.max(range[0], 0), Math.min(range[1], numberArray.length - 1)};
        int leftIndex, leftIndexValue, rightIndex, rightIndexValue;
        int[] resultRange = new int[]{0, 0};
        Integer rightIndexMin = null, rightIndexMax = null;
        final int length = numberArray.length, firstValue = numberArray[0], lastValue = numberArray[length - 1];
        if (number < firstValue) {
            resultRange[0] = 0;
            resultRange[1] = 0;
            return resultRange;
        }
        if (number > lastValue) {
            resultRange[0] = length;
            resultRange[1] = length;
            return resultRange;
        }
        if (length == 1) {
            if (number < firstValue) {
                resultRange[0] = 0;
                resultRange[1] = 0;
            }
            if (number == firstValue) {
                resultRange[0] = 0;
                resultRange[1] = 1;
            }
            if (number > firstValue) {
                resultRange[0] = 1;
                resultRange[1] = 1;
            }
            return resultRange;
        }

        while (true) {
            leftIndex = (leftRange[0] + leftRange[1]) / 2;
            leftIndexValue = numberArray[leftIndex];
            if (number > leftIndexValue) {
                if (number < numberArray[leftIndex + 1]) {
                    resultRange[0] = leftIndex + 1;
                    resultRange[1] = leftIndex + 1;
                    return resultRange;
                } else if (number == numberArray[leftIndex + 1]) {
                    resultRange[0] = leftIndex + 1;
                    rightIndexMin = leftIndex + 1;
                    break;
                }
                if (leftIndex == length - 2) {
                    if (number == numberArray[length - 1]) {
                        resultRange[0] = length - 1;
                        resultRange[1] = length;
                        return resultRange;
                    }
                    if (number < numberArray[length - 1]) {
                        resultRange[0] = length - 1;
                        resultRange[1] = length - 1;
                        return resultRange;
                    }
                }
                leftRange[0] = leftIndex;
            } else if (number == leftIndexValue) {
                if (leftIndex == 0) {
                    resultRange[0] = 0;
                    if (number < numberArray[1]) {
                        resultRange[1] = 1;
                        return resultRange;
                    }
                    rightIndexMin = leftIndex;
                    break;
                }
                if (number > numberArray[leftIndex - 1]) {
                    resultRange[0] = leftIndex;
                    rightIndexMin = leftIndex;
                    break;
                }
                leftRange[1] = leftIndex - 1;
            } else if (number < leftIndexValue) {
                if (number > numberArray[leftIndex - 1]) {
                    resultRange[0] = leftIndex;
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
                if (number < numberArray[rightIndex + 1]) {
                    resultRange[0] = rightIndex + 1;
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
                rightRange[0] = rightIndex + 1;
            } else if (number < rightIndexValue) {
                if (number > numberArray[rightIndex - 1]) {
                    resultRange[0] = rightIndex;
                    resultRange[1] = rightIndex;
                    return resultRange;
                }
                if (number == numberArray[rightIndex - 1]) {
                    resultRange[1] = rightIndex;
                    return resultRange;
                }
                rightRange[1] = rightIndex - 1;
            }
        }
    }
}
