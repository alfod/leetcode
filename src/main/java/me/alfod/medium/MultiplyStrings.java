package me.alfod.medium;

/**
 * Created by Arvin Alfod on 2018/7/5.
 */
public class MultiplyStrings {
    public String multiply(String num1, String num2) {
        if (num1 == null || num1.length() == 0) {
            return "";
        }
        if (num2 == null || num2.length() == 0) {
            return "";
        }

        if (num1.equals("1")) {
            return num2;
        }
        if (num2.equals("1")) {
            return num1;
        }

        if (num2.equals("0") || num1.equals("0")) {
            return "0";
        }

        int length1 = num1.length(), length2 = num2.length(), length = length1 + length2;

        int[][] resultInts = new int[length1][length];
        char c1;

        int index = 0;
        for (int i = length1 - 1; i >= 0; i--) {
            c1 = num1.charAt(i);
            multiply(c1, num2, resultInts[index], index);
            index++;
        }
        char[] result = new char[length];
        int carry = 0, remainder, sum, base = 10, resultIndex = length - 1;
        for (int i = length - 1; i >= 0; i--) {
            sum = carry;
            for (int j = 0; j < length1; j++) {
                sum += resultInts[j][i];
            }
            remainder = sum % base;
            carry = sum / base;
            result[resultIndex] = (char) (remainder + '0');
            resultIndex--;
        }
        int offset = 0, count;
        for (int i = 0; i < result.length; i++) {
            if (result[i] - '0' > 0) {
                offset = i;
                break;
            }
        }


        return String.valueOf(result, offset, length - offset);
    }

    public void multiply(char c, String s, int[] result, int offset) {
        char sChar;
        int carry = 0, remainder, product, base = 10;
        int resultIndex = 1, cInt = (c - '0');
        for (int index = 0; index < s.length(); index++) {
            sChar = s.charAt(s.length() - 1 - index);
            product = (sChar - '0') * cInt + carry;
            remainder = product % base;
            carry = product / base;
            result[result.length - resultIndex - offset] = remainder;
            resultIndex++;
        }
        result[result.length - resultIndex - offset] = carry;
    }
}
