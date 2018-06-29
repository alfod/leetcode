package leetcode.medium;

import leetcode.BaseTest;
import me.alfod.medium.LongestPalindromicSubstring;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author Yang Dong
 * @createTime 2018/6/29  10:06
 * @lastUpdater Yang Dong
 * @lastUpdateTime 2018/6/29  10:06
 * @note
 */
public class LongestPalindromicSubstringTest extends BaseTest {
    LongestPalindromicSubstring longestPalindromicSubstring = new LongestPalindromicSubstring();

    @Test
    public void test1() {
        String s = longestPalindromicSubstring.longestPalindrome("babad");
        Assert.assertEquals("aba", s);
    }
    @Test
    public void test2() {
        String s = longestPalindromicSubstring.longestPalindrome("cbbd");
        Assert.assertEquals("bb", s);
    }

    @Test
    public void test3() {
        String s = longestPalindromicSubstring.longestPalindrome( "bb");
        Assert.assertEquals("bb", s);
    }

    @Test
    public void test4() {
        String s = longestPalindromicSubstring.longestPalindrome( "aaaa");
        Assert.assertEquals("aaaa", s);
    }

    @Test
    public void test5() {
        String s = longestPalindromicSubstring.longestPalindrome( "ccc");
        Assert.assertEquals("ccc", s);
    }





}
