package me.alfod.medium;

/**
 * @author Yang Dong
 * @createTime 2018/7/3  16:21
 * @lastUpdater Yang Dong
 * @lastUpdateTime 2018/7/3  16:21
 * @note
 */
public class DivideTwoIntegers {
    public int divide(int dividend, int divisor) {
        if (dividend == 0) {
            return 0;
        }

        if (divisor == Integer.MIN_VALUE) {
            if (dividend == Integer.MIN_VALUE) {
                return 1;
            } else {
                return 0;
            }
        }
        if (dividend == Integer.MIN_VALUE) {
            if (divisor == -1) {
                return Integer.MAX_VALUE;
            }
        }
        if (divisor == 1) {
            return dividend;
        }

        if (divisor == -1) {
            return -dividend;
        }

        if (divisor == 2) {
            return dividend >> 1;
        }
        if (divisor == -2) {
            return -dividend >> 1;
        }


        boolean isPositive = (dividend < 0 && divisor < 0) || (dividend > 0 && divisor > 0);

        if(dividend > 0){
            dividend = -dividend;
        }

        if(divisor > 0){
            divisor = -divisor;
        }

        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            if (dividend > divisor) {
                if (isPositive) {
                    return i;
                } else {
                    return -i;
                }
            }
            dividend -= divisor;
        }
        return 0;

    }
}
