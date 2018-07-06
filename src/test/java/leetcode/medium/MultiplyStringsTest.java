package leetcode.medium;

import leetcode.BaseTest;
import me.alfod.medium.MultiplyStrings;
import org.junit.Test;

/**
 * Created by Arvin Alfod on 2018/7/5.
 */
public class MultiplyStringsTest extends BaseTest {
    private MultiplyStrings multiplyStrings = new MultiplyStrings();

    @Test
    public void test1() {
        String result = multiplyStrings.multiply("2", "63");
        print(result);
    }

    @Test
    public void test2() {
        int[] resultInt = new int[6];
        multiplyStrings.multiply('3', "23", resultInt, 2);
        print(resultInt);
    }
}
