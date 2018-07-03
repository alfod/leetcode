package leetcode.medium;

import me.alfod.medium.DivideTwoIntegers;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author Yang Dong
 * @createTime 2018/7/3  16:21
 * @lastUpdater Yang Dong
 * @lastUpdateTime 2018/7/3  16:21
 * @note
 */
public class DivideTwoIntegersTest {
    private DivideTwoIntegers divideTwoIntegers = new DivideTwoIntegers();

    @Test
    public void test1() {
        int result = divideTwoIntegers.divide(-2147483648, -1);
        Assert.assertEquals(Integer.MAX_VALUE, result);
    }

    @Test
    public void test2() {
        int result = divideTwoIntegers.divide(10, 3);
        Assert.assertEquals(3, result);
    }

    @Test
    public void test3() {
        int result = divideTwoIntegers.divide(7, -3);
        Assert.assertEquals(-2, result);
    }

    @Test
    public void test4() {
        int result = divideTwoIntegers.divide(-1, 1);
        Assert.assertEquals(-1, result);
    }

    @Test
    public void test5() {
        int result = divideTwoIntegers.divide(-2147483648, -3);
        Assert.assertEquals(715827882, result);
    }
}
