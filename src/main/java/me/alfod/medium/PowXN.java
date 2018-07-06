package me.alfod.medium;

/**
 * Created by Arvin Alfod on 2018/7/6.
 */
public class PowXN {
    public double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return x;
        }
        if (n == -1) {
            return 1 / x;
        }
        if (x == 1) {
            return 1;
        }
        if (x == -1) {
            return n % 2 == 0 ? 1 : -1;
        }

        double result = 1;
        double limit = 1 / Double.MIN_NORMAL;
        int count = n < 0 ? n : -n;
        for (int i = 0; i > count; i--) {
            result = result * x;
            if ((result > 0 && result < Double.MIN_NORMAL) || (result < 0 && result > -Double.MIN_NORMAL)) {
                break;
            }
            if (n < 0 && (result > limit || result < -limit)) {
                break;
            }
            if (result < Double.MAX_EXPONENT || result > Double.POSITIVE_INFINITY){
                break;
            }
        }
        if (n < 0) {
            if (result > -Double.MIN_NORMAL && result < 0) {
                return Double.NEGATIVE_INFINITY;
            } else if (result < Double.MIN_NORMAL && result >= 0) {
                return Double.POSITIVE_INFINITY;
            } else {
                return 1 / result;
            }
        }
        return result;
    }
}
