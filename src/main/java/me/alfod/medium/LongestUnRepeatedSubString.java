package me.alfod.medium;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @author Yang Dong
 * @createTime 2018/6/28  19:09
 * @lastUpdater Yang Dong
 * @lastUpdateTime 2018/6/28  19:09
 * @note
 */
public class LongestUnRepeatedSubString {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, List<Integer>> map = new HashMap<>();
        char[] chars = s.toCharArray();
        int[] charCount = new int[s.length()];
        Integer count;
        final int LENGTH = s.length();
        if (LENGTH == 0) {
            return 0;
        }
        char cChar;
        List<Integer> charIndexList;
        for (int i = 0; i < chars.length; i++) {
            charIndexList = map.get(chars[i]);
            cChar = chars[i];
            if (charIndexList == null) {
                charIndexList = new LinkedList<>();
            }
            charIndexList.add(i);
            map.put(cChar, charIndexList);
        }

        List<List<Integer>> counts = new LinkedList<>();
        for (List<Integer> integers : map.values()) {
            if (integers.size() > 1) {
                integers.add(0, -1);
                integers.add(integers.size(), LENGTH);
                counts.add(integers);
            }
        }

        if (counts.size() == 0) {
            return LENGTH;
        }
        List<Integer[]> subIndex = new LinkedList<>();
        Integer[] index = new Integer[2];
        for (List<Integer> integers : counts) {
            for (int i = 0; i < integers.size() - 1; i++) {
                index[0] = integers.get(i);
                index[1] = integers.get(i + 1);
                if (index[1] - index[0] < 2) {
                    continue;
                }
                if (isValid(index, counts)) {
                    subIndex.add(index);
                    index = new Integer[2];
                }
            }
        }

        int max = 1;
        int length;
        for (Integer[] integers : subIndex) {
            length = integers[1] - integers[0];
            if (length > max) {
                max = length;
            }
        }
        return max;
    }

    public boolean isValid(Integer[] subIndex, List<List<Integer>> indexs) {
        for (List<Integer> index : indexs) {
            for (int i = 0; i < index.size() - 1; i++) {
                if (index.get(i) > subIndex[0] && index.get(i + 1) < subIndex[1]) {
                    return false;
                }
            }
        }
        return true;
    }
}
