package me.alfod.medium;

import java.util.*;

/**
 * Created by Arvin Alfod on 2018/7/1.
 */
public class TripletsSumZero {
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums.length < 3) {
            return new ArrayList<>();
        }
        Map<Integer, Integer> map = new HashMap<>(nums.length * 3);
        Integer count;
        List<Integer> triple;
        Set<List<Integer>> result = new HashSet<>();
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
        if (max == min && max == 0) {
            triple = new ArrayList<>(3);
            triple.add(0);
            triple.add(0);
            triple.add(0);
            result.add(triple);
            return new ArrayList<>(result);
        }

        if (max < 0 || min > 0) {
            return new ArrayList<>();
        }
        int first, second, third;
        boolean noEqual, twoEqual, threeEqual;
        Set<Long> codeSet = new HashSet<>();
        long code;
        for (int i = 0; i < nums.length - 2; i++) {
            first = nums[i];
            for (int j = i + 1; j < nums.length - 1; j++) {
                second = nums[j];
                third = 0 - (first + second);
                if (third > max || third < min) {
                    continue;
                }
                count = map.get(third);
                if (count == null) {
                    continue;
                }
                noEqual = ((first != third && second != third) && count > 0);
                twoEqual = (first == third || second == third) && first != second && count > 1;
                threeEqual = (first == third && second == third) && count > 2;
                if (twoEqual || threeEqual || noEqual) {
                    code = (first * first + second * second + third * third);
                    code *= ((first == 0 ? 1 : first) * (second == 0 ? 1 : second) * (third == 0 ? 1 : third));
                    if (!codeSet.contains(code)) {
                        codeSet.add(code);
                        triple = new ArrayList<>(3);
                        triple.add(first);
                        triple.add(second);
                        triple.add(third);
                        result.add(triple);
                    }
                }
            }
        }
        return new ArrayList<>(result);
    }
}
