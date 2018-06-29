package me.alfod.medium;

/**
 * @author Yang Dong
 * @createTime 2018/6/29  13:04
 * @lastUpdater Yang Dong
 * @lastUpdateTime 2018/6/29  13:04
 * @note
 */
public class ZigZagConversion {
    public String convert(String s, int numRows) {
        final int LENGTH = s.length();
        if (LENGTH <= numRows || numRows == 1) {
            return s;
        }
        StringBuilder characters = new StringBuilder(LENGTH * 2);
        int tempIndex;
        for (int y = 0; y < numRows; y++) {
            for (int x = 0; x < LENGTH / numRows; x++) {
                tempIndex = (2 * numRows - 2) * x + y;
                if (tempIndex >= LENGTH) {
                    break;
                }
                characters.append(s.charAt(tempIndex));
                if (y != 0 && y != numRows - 1) {
                    tempIndex = (2 * numRows - 2) * x + 2 * (numRows - 1) - y;
                    if (tempIndex >= LENGTH) {
                        break;
                    }
                    characters.append(s.charAt(tempIndex));
                }
            }
        }
        return characters.toString();
    }
}
