package me.alfod.medium;

/**
 * Created by Arvin Alfod on 2018/7/4.
 */
public class NextPermutation {
    public void nextPermutation(int[] nums) {
        if (nums.length == 0 || nums.length == 1) {
            return;
        }
        if (nums.length == 2) {
            swap(nums, 0, 1);
            return;
        }
        int lastIndex, lastValue, value;
        for (int index = nums.length - 1; index > 0; index--) {
            lastIndex = index - 1;
            lastValue = nums[lastIndex];
            value = nums[index];
            if (lastValue < value) {
                for (int rightIndex = nums.length - 1; rightIndex > index; rightIndex--) {
                    if (nums[rightIndex] > lastValue) {
                        swap(nums, rightIndex, lastIndex);
                        reverse(nums, index);
                        return;
                    }
                }
                swap(nums, index, lastIndex);
                reverse(nums, index);
                return;
            }
        }

        reverse(nums, 0);
    }

    public void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;

    }

    public void reverse(int[] array, int start) {
        final int end = array.length - 1;
        int gap = (end - start) / 2;
        for (int i = 0; i <= gap; i++) {
            swap(array, start + i, end - i);
        }
    }
}

