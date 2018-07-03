package leetcode.medium;

import leetcode.BaseTest;
import me.alfod.medium.GenerateParentheses;
import org.junit.Test;

import java.util.List;

/**
 * @author Yang Dong
 * @createTime 2018/7/3  13:08
 * @lastUpdater Yang Dong
 * @lastUpdateTime 2018/7/3  13:08
 * @note
 */
public class GenerateParenthesesTest extends BaseTest {
    private GenerateParentheses generateParentheses = new GenerateParentheses();

    @Test
    public void test1() {
        int para = 2;
        List<String> result = generateParentheses.generateParenthesis(para);
        print(result);
    }
    @Test
    public void test2() {
        int para = 1;
        List<String> result = generateParentheses.generateParenthesis(para);
        print(result);
    }

    @Test
    public void test3() {
        int para = 3;
        List<String> result = generateParentheses.generateParenthesis(para);
        print(result);
    }
}
