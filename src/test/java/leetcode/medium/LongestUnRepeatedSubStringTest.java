package leetcode.medium;

import leetcode.BaseTest;
import me.alfod.medium.LongestUnRepeatedSubString;
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
    LongestUnRepeatedSubString longestUnRepeatedSubString = new LongestUnRepeatedSubString();

    @Test
    public void list() {
        List<Integer> list = new LinkedList<>();
        list.add(0, 0);
        list.add(list.size(), 1);

        print(list);
    }

    @Test
    public void test1() {
        int n = longestUnRepeatedSubString.lengthOfLongestSubstring("abcabcbb");
        print(n);
    }

    @Test
    public void test2() {
        int n = longestUnRepeatedSubString.lengthOfLongestSubstring("bbbbb");
        print(n);
    }

    @Test
    public void test3() {
        int n = longestUnRepeatedSubString.lengthOfLongestSubstring("pwwkew");
        print(n);
    }

    @Test
    public void test4() {
        int n = longestUnRepeatedSubString.lengthOfLongestSubstring("cdd");
        print(n);
    }

    @Test
    public void test5() {
        int n = longestUnRepeatedSubString.lengthOfLongestSubstring("abcb");
        print(n);
    }


}
