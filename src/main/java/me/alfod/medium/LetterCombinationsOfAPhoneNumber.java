package me.alfod.medium;

import java.util.ArrayList;
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
        char[][] lettersArray = new char[][]{{}, {}, {'a', 'b', 'c'}, {'d', 'e', 'f'}, {'g', 'h', 'i'}, {'j', 'k', 'l'}
                , {'m', 'n', 'o'}, {'p', 'q', 'r', 's'}, {'t', 'u', 'v'}, {'w', 'x', 'y', 'z'}};
        int digit;
        char[] letters;
        List<char[]> stringCharList = new ArrayList<>((int) Math.pow(4, digits.length()));
        List<String> result = new ArrayList<>((int) Math.pow(4, digits.length()));
        char[] originStrings, tempStrings;
        int size;
        for (int i = 0; i < digits.length(); i++) {
            digit = digits.charAt(i) - '0';
            if (digit < 0 || digit > 9) {
                continue;
            }
            letters = lettersArray[digit];
            if (stringCharList.size() == 0) {
                for (char letter : letters) {
                    originStrings = new char[digits.length()];
                    originStrings[0] = letter;
                    stringCharList.add(originStrings);
                }
            } else {
                size = stringCharList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    char[] strings = stringCharList.get(i2);
                    for (int i1 = 0; i1 < letters.length - 1; i1++) {
                        tempStrings = new char[digits.length()];
                        System.arraycopy(strings, 0, tempStrings, 0, i + 1);
                        tempStrings[i] = letters[i1];
                        stringCharList.add(tempStrings);
                    }
                    strings[i] = letters[letters.length - 1];
                }
            }
        }
        for (char[] strings : stringCharList) {
            result.add(new String(strings));
        }
        return result;
    }
}
