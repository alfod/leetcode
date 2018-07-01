package leetcode.medium;

import leetcode.BaseTest;
import me.alfod.medium.IntegerToRoman;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Arvin Alfod on 2018/7/1.
 */
public class IntegerToRomanTest extends BaseTest {
    private IntegerToRoman integerToRoman = new IntegerToRoman();

    @Test
    public void test1() {
        String num = integerToRoman.intToRoman(5);
        Assert.assertEquals(num,"V");
    }
    @Test
    public void test2() {
        String num = integerToRoman.intToRoman(3);
        Assert.assertEquals(num,"III");
    }
    @Test
    public void test3() {
        String num = integerToRoman.intToRoman(9);
        Assert.assertEquals("IX",num);
    }

    @Test
    public void test4() {
        String num = integerToRoman.intToRoman(58);
        Assert.assertEquals("LVIII",num);
    }
    @Test
    public void test5() {
        String num = integerToRoman.intToRoman(1994);
        Assert.assertEquals("MCMXCIV",num);
    }
    @Test
    public void test6() {
        String num = integerToRoman.intToRoman(5229);
        Assert.assertEquals("CCXXIX",num);
    }


}
