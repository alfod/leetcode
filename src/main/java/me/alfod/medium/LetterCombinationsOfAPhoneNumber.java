package me.alfod.medium;

import java.util.List;

/**
 * @author Yang Dong
 * @createTime 2018/7/2  17:53
 * @lastUpdater Yang Dong
 * @lastUpdateTime 2018/7/2  17:53
 * @note
 */
public class LetterCombinationsOfAPhoneNumber {

    public List<String> letterCombinations(String digits) {
        String[][] lettersArray = new String[][]{{}, {}, {"a", "b", "c"}, {"d", "e", "f"}, {"g", "h", "i"}, {"j", "k", "l"}
                , {"m", "n", "o"}, {"p", "q", "r", "s"}, {"t", "u", "v"}, {"w", "x", "y", "z"}};
        int digit;
        String[] letters;
        for (int i = 0; i < digits.length(); i++) {
            digit = digits.charAt(i) - '0';

        }

    }
}
