package me.alfod.medium;

/**
 * Created by Arvin Alfod on 2018/6/30.
 */
public class StringToInteger {
    public int myAtoi(String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }
        int decimal = 10;
        boolean isVerified = false;
        boolean isPlus = true;
        int value = 0, oldValue = 0;
        for (char sChar : str.toCharArray()) {
            if (!isVerified) {
                if (sChar == ' ') {
                    continue;
                }
                if (sChar == '+') {
                    isVerified = true;
                    isPlus = true;
                    continue;
                }
                if (sChar == '-') {
                    isVerified = true;
                    isPlus = false;
                    continue;
                }
                if (sChar < '0' || sChar > '9') {
                    return 0;
                }
            }
            isVerified = true;
            if (sChar < '0' || sChar > '9') {
                return value;
            }
            oldValue = value;

            if (isPlus) {
                if (value > Integer.MAX_VALUE / decimal) {
                    return Integer.MAX_VALUE;
                }
                value *= decimal;
                value += (sChar - '0');
                if (value < oldValue || value < (sChar - '0')) {
                    return Integer.MAX_VALUE;
                }
            } else {
                if (value < Integer.MIN_VALUE / decimal) {
                    return Integer.MIN_VALUE;
                }
                value *= decimal;
                value -= (sChar - '0');
                if (value > oldValue || value > -(sChar - '0')) {
                    return Integer.MIN_VALUE;
                }
            }
        }
        return value;
    }
}
