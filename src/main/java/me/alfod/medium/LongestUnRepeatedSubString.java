package me.alfod.medium;

import java.util.HashMap;
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
        if (s.length() < 2) {
            return s.length();
        }
        Map<Character, Integer> charMap = new HashMap<>();
        int max = 0;
        char sChar;
        Integer count;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                sChar = s.charAt(j);
                count = charMap.get(sChar);

                if (count == null) {
                    if (max < j + 1 - i) {
                        max = j - i + 1;
                    }
                    charMap.put(sChar, 1);
                } else {
                    if (max < j - i) {
                        max = j - i;
                    }
                    charMap.clear();
                    break;
                }
            }
        }
        return max;
    }
}
