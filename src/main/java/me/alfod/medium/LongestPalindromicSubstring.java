package me.alfod.medium;

/**
 * @author Yang Dong
 * @createTime 2018/6/29  10:06
 * @lastUpdater Yang Dong
 * @lastUpdateTime 2018/6/29  10:06
 * @note
 */
public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        int[] range = new int[2];
        char before, after, last, current, front;
        int length;
        for (int i = 0; i < s.length() - 1; i++) {
            for (int j = 1; i >= j && i + j < s.length(); j++) {
                before = s.charAt(i + j);
                after = s.charAt(i - j);
                length = range[1] - range[0];
                if (before == after) {
                    if (2 * j + 1 > length) {
                        range[0] = i - j;
                        range[1] = i + j;
                    }
                } else {
                    break;
                }
            }
        }

        for (int i = 0; i < s.length() - 1; i++) {
            for (int j = 1; i + 1 >= j && i + j < s.length(); j++) {
                before = s.charAt(i + j);
                after = s.charAt(i - j + 1);
                length = range[1] - range[0];
                if (before == after) {
                    if (2 * j > length) {
                        range[0] = i - j + 1;
                        range[1] = i + j;
                    }
                } else {
                    break;
                }
            }
        }
        return s.substring(range[0], range[1] + 1);
    }
}
