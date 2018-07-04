package me.alfod.medium;

/**
 * Created by Arvin Alfod on 2018/7/4.
 */
public class SearchInRotatedSortedArray {
    public int search(int[] nums, int target) {
        if (nums.length == 0) {
            return -1;
        }
        if (nums.length == 1) {
            return nums[0] == target ? 0 : -1;
        }
        final int length = nums.length, first = nums[0], last = nums[length - 1];
        if (target < first && target > last) {
            return -1;
        }

        if (target == first) {
            return 0;
        }
        if (target == last) {
            return length - 1;
        }

        boolean isLeft;

        isLeft = target > first;
        int[] range = new int[]{0, length-1};
        int index, value;
        while (true) {
            index = (range[1] + range[0]) / 2;
            value = nums[index];
            if (target == value) {
                return index;
            }
            if (range[1] - range[0] <= 1) {
                if (nums[range[1]] == target) {
                    return range[1];
                }
                if (nums[range[0]] == target) {
                    return range[0];
                }
                return -1;
            }
            if (isLeft) {
                if (value > first) {
                    if (target > value) {
                        range[0] = index;
                    } else {
                        range[1] = index;
                    }
                } else {
                    range[1] = index;
                }

            } else {
                if (value > first) {
                    range[0] = index;
                } else {
                    if (target > value) {
                        range[0] = index;
                    } else {
                        range[1] = index;
                    }
                }

            }
        }
    }
}
