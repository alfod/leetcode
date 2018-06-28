package leetcode.medium;

import leetcode.BaseTest;
import me.alfod.medium.LongestUnRepeatedSubString;
import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Yang Dong
 * @createTime 2018/6/28  19:10
 * @lastUpdater Yang Dong
 * @lastUpdateTime 2018/6/28  19:10
 * @note
 */
public class LongestUnRepeatedSubStringTest extends BaseTest {
    private LongestUnRepeatedSubString longestUnRepeatedSubString = new LongestUnRepeatedSubString();

    @Test
    public void test1() {
        int n = longestUnRepeatedSubString.lengthOfLongestSubstring("abcabcbb");
        Assert.assertEquals(3,n);
       // print(n);
    }

    @Test
    public void test2() {
        int n = longestUnRepeatedSubString.lengthOfLongestSubstring("bbbbb");
        Assert.assertEquals(1,n);
//        print(n);
    }

    @Test
    public void test3() {
        int n = longestUnRepeatedSubString.lengthOfLongestSubstring("pwwkew");
        Assert.assertEquals(3,n);
//        print(n);
    }

    @Test
    public void test4() {
        int n = longestUnRepeatedSubString.lengthOfLongestSubstring("cdd");
        Assert.assertEquals(2,n);
//        print(n);
    }

    @Test
    public void test5() {
        int n = longestUnRepeatedSubString.lengthOfLongestSubstring("abcb");
        Assert.assertEquals(3,n);
//        print(n);
    }

    @Test
    public void test6() {
        int n = longestUnRepeatedSubString.lengthOfLongestSubstring(  "ohomm");
        Assert.assertEquals(3,n);
//        print(n);
    }




}
