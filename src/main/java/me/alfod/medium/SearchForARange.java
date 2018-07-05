package me.alfod.medium;

/**
 * @author Yang Dong
 * @createTime 2018/7/5  11:11
 * @lastUpdater Yang Dong
 * @lastUpdateTime 2018/7/5  11:11
 * @note
 */
public class SearchForARange {
    public int[] searchRange(int[] nums, int target) {
        int[] resultRange = new int[]{0, 0};
        if(nums.length == 0 ){
            return setRange(resultRange, -1, -1);
        }
        if(nums.length == 1 ){
            if(nums[0] == target){
                return setRange(resultRange, 0, 0);
            }
            return setRange(resultRange, -1, -1);
        }

        int[] range = new int[]{0, nums.length - 1};
        int[] leftRange = new int[]{Math.max(range[0], 0), Math.min(range[1], nums.length - 1)};
        int leftIndex, leftIndexValue, rightIndex, rightIndexValue;

        Integer rightIndexMin ;
        final int length = nums.length, firstValue = nums[0], lastValue = nums[length - 1];
        if (target < firstValue || target > lastValue) {
            return setRange(resultRange, -1, -1);
        }

        while (true) {
            leftIndex = (leftRange[0] + leftRange[1]) / 2;
            leftIndexValue = nums[leftIndex];
            if (target > leftIndexValue) {
                if (target < nums[leftIndex + 1]) {
                    return setRange(resultRange, -1, -1);
                } else if (target == nums[leftIndex + 1]) {
                    resultRange[0] = leftIndex + 1;
                    rightIndexMin = leftIndex + 1;
                    break;
                }
                if (leftIndex == length - 2) {
                    if (target == nums[length - 1]) {
                        return setRange(resultRange, length - 1, length - 1);
                    }
                    if (target < nums[length - 1]) {
                        return setRange(resultRange, -1, -1);
                    }
                }
                leftRange[0] = leftIndex;
            } else if (target == leftIndexValue) {
                if (leftIndex == 0) {
                    resultRange[0] = 0;
                    if (target < nums[1]) {
                        resultRange[1] = 0;
                        return resultRange;
                    }
                    rightIndexMin = leftIndex;
                    break;
                }
                if (target > nums[leftIndex - 1]) {
                    resultRange[0] = leftIndex;
                    rightIndexMin = leftIndex;
                    break;
                }
                leftRange[1] = leftIndex - 1;
            } else if (target < leftIndexValue) {
                if (target > nums[leftIndex - 1]) {
                    return setRange(resultRange, -1, -1);
                }
                leftRange[1] = leftIndex;
            }
        }

        int[] rightRange = new int[]{rightIndexMin, Math.min(range[1], nums.length - 1)};
        while (true) {
            rightIndex = (rightRange[1] + rightRange[0]) / 2;
            rightIndexValue = nums[rightIndex];
            if (target > rightIndexValue) {
                if (target < nums[rightIndex + 1]) {
                    return setRange(resultRange, -1, -1);
                }
                rightRange[0] = rightIndex;
            } else if (target == rightIndexValue) {
                if (rightIndex == length - 1) {
                    resultRange[1] = length - 1;
                    return resultRange;
                }
                if (target < nums[rightIndex + 1]) {
                    resultRange[1] = rightIndex ;
                    return resultRange;
                }
                rightRange[0] = rightIndex + 1;
            } else if (target < rightIndexValue) {
                if (target > nums[rightIndex - 1]) {
                    return setRange(resultRange, -1, -1);
                }
                if (target == nums[rightIndex - 1]) {
                    resultRange[1] = rightIndex - 1;
                    return resultRange;
                }
                rightRange[1] = rightIndex - 1;
            }
        }
    }

    private int[] setRange(int[] range, int first, int second) {
        range[0] = first;
        range[1] = second;
        return range;
    }
}
