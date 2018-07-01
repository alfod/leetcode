package me.alfod.medium;

/**
 * Created by Arvin Alfod on 2018/7/1.
 */
public class IntegerToRoman {
    public String intToRoman(int num) {
        final String[] letters = new String[]{"M", "D", "C", "L", "X", "V", "I"};
        final int[] numbers = new int[]{1000, 500, 100, 50, 10, 5, 1};
        int value, nextValue = 0, count;
        String letter, nextLetter = "";
        StringBuilder result = new StringBuilder();
        for (int index = 0; index < numbers.length && num > 0; index++) {
            value = numbers[index];
            if (index < numbers.length - 1) {
                if (value > 100) {
                    nextValue = 100;
                    nextLetter = "C";
                } else if (value > 10) {
                    nextValue = 10;
                    nextLetter = "X";
                } else {
                    nextValue = 1;
                    nextLetter = "I";
                }
            }
            letter = letters[index];
            count = num / value;
            if (count > 0) {
                result.append(repeat(letter, count));
                num -= value * count;
                index--;
                continue;
            }

            if (num >= (value - nextValue)) {
                result.append(nextLetter).append(letter);
                num -= (value - nextValue);
                continue;
            }


        }
        return result.toString();
    }

    public String repeat(String s, int count) {
        StringBuilder result = new StringBuilder(s.length() * count);
        for (int i = 0; i < count; i++) {
            result.append(s);
        }
        return result.toString();
    }
}
