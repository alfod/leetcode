package me.alfod.medium;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Arvin Alfod on 2018/7/1.
 */
public class TripletsSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>(nums.length * 3);
        Integer count;
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for (int num : nums) {
            count = map.get(num);
            if (count == null) {
                map.put(num, 1);
            } else {
                map.put(num, count + 1);
            }
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        if (max == min) {
            return 3 * max;
        }

        int first, second, third;
        boolean noEqual, twoEqual, threeEqual;

        int closestNum = 0, absClosestNum = Integer.MAX_VALUE, tempNum;
        for (int i = 0; i < nums.length - 2; i++) {
            first = nums[i];
            for (int j = i + 1; j < nums.length - 1; j++) {
                second = nums[j];
                third = target - (first + second);
                count = map.get(third);

                if (count != null) {
                    noEqual = (first != third && second != third && count > 0);
                    twoEqual = ((first == third || second == third) && first != second && count > 1);
                    threeEqual = (first == second && first == third && count > 2);
                    if (noEqual || twoEqual || threeEqual) {
                        return target;
                    }
                }

                for (int k = j + 1; k < nums.length; k++) {
                    third = nums[k];
                    tempNum = target - (first + second + third);
                    if (Math.abs(tempNum) < absClosestNum) {
                        absClosestNum = Math.abs(tempNum);
                        closestNum = first + second + third;
                    }
                }

            }
        }
        return closestNum;
    }
}
