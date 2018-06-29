package leetcode.medium;

import leetcode.BaseTest;
import me.alfod.medium.ZigZagConversion;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author Yang Dong
 * @createTime 2018/6/29  13:04
 * @lastUpdater Yang Dong
 * @lastUpdateTime 2018/6/29  13:04
 * @note
 */
public class ZigZagConversionTest extends BaseTest {

    private ZigZagConversion zigZagConversion = new ZigZagConversion();

    @Test
    public void test1() {
        String s = zigZagConversion.convert("PAYPALISHIRING", 3);
        Assert.assertEquals("PAHNAPLSIIGYIR", s);
    }

    @Test
    public void test2() {
        String s = zigZagConversion.convert("PAYPALISHIRING", 4);
        Assert.assertEquals("PINALSIGYAHRPI", s);
    }

    @Test
    public void test3() {
        String s = zigZagConversion.convert("A", 2);
        Assert.assertEquals("A", s);
    }

    @Test
    public void test4() {
        String s = zigZagConversion.convert( "AB", 1);
        Assert.assertEquals( "AB", s);
    }

    @Test
    public void test5() {
        String s = zigZagConversion.convert( "ABC", 2);
        Assert.assertEquals( "ACB", s);
    }




}
