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
        final int LENGTH = s.length();
        if (LENGTH == 0) {
            return 0;
        }
        char sChar;
        List<Integer> charIndexList;
        for (int i = 0; i < s.length(); i++) {
            sChar = s.charAt(i);
            charIndexList = map.get(sChar);
            if (charIndexList == null) {
                charIndexList = new LinkedList<>();
            }
            charIndexList.add(i);
            map.put(sChar, charIndexList);
        }

        List<List<Integer>> counts = new LinkedList<>();
        for (List<Integer> charIndex : map.values()) {
                if (charIndex.get(0) != 0) {
                    charIndex.add(0, -1);
                }
                if (charIndex.get(charIndex.size() - 1) != LENGTH - 1) {
                    charIndex.add(charIndex.size(), LENGTH);
                }
                counts.add(charIndex);
        }

        if (counts.size() == 0) {
            return LENGTH;
        }
        List<int[]> subIndexList = new LinkedList<>();
        int[] index = new int[2];
        for (List<Integer> count : counts) {
            for (int i = 0; i < count.size() - 1; i++) {
                index[0] = count.get(i);
                index[1] = count.get(i + 1);
                if (index[1] - index[0] < 2) {
                    continue;
                }
                if (isValid(index, counts)) {
                    subIndexList.add(index);
                    index = new int[2];
                }
            }
        }

        int max = 1;
        int length;
        for (int[] subIndex : subIndexList) {
            length = subIndex[1] - subIndex[0];
            if (length > max) {
                max = length;
            }
        }
        return max;
    }

    public boolean isValid(int[] subIndex, List<List<Integer>> indexList) {
        for (List<Integer> index : indexList) {
            for (int i = 0; i < index.size() - 1; i++) {
                if (index.get(i) > subIndex[0] && index.get(i + 1) < subIndex[1]) {
                    return false;
                }
            }
        }
        return true;
    }
}
