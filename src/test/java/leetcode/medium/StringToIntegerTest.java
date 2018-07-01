package leetcode.medium;

import me.alfod.medium.StringToInteger;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Arvin Alfod on 2018/6/30.
 */
public class StringToIntegerTest {
    private StringToInteger stringToInteger = new StringToInteger();

    @Test
    public void test1() {
        int value = stringToInteger.myAtoi("42");
        Assert.assertEquals(42, value);
    }

    @Test
    public void test2() {
        int value = stringToInteger.myAtoi("   -42");
        Assert.assertEquals(-42, value);
    }

    @Test
    public void test3() {
        int value = stringToInteger.myAtoi("4193 with words");
        Assert.assertEquals(4193, value);
    }

    @Test
    public void test4() {
        int value = stringToInteger.myAtoi("words and 987");
        Assert.assertEquals(0, value);
    }

    @Test
    public void test5() {
        int value = stringToInteger.myAtoi("-91283472332");
        Assert.assertEquals(-2147483648, value);
    }
    @Test
    public void test6() {
        int value = stringToInteger.myAtoi("91283472332");
        Assert.assertEquals(Integer.MAX_VALUE, value);
    }

    @Test
    public void test7() {
        int value = stringToInteger.myAtoi("-6147483648");
        Assert.assertEquals(Integer.MIN_VALUE, value);
    }

    @Test
    public void test8() {
        int value = stringToInteger.myAtoi( "2147483646");
        Assert.assertEquals(Integer.MAX_VALUE, value);
    }







}
