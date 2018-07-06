package leetcode.medium;

import leetcode.BaseTest;
import me.alfod.medium.PowXN;
import org.junit.Test;

/**
 * Created by Arvin Alfod on 2018/7/6.
 */
public class PowXNTest extends BaseTest {
    private PowXN powXN = new PowXN();

    @Test
    public void test1() {
        double result = powXN.myPow(2.00000,
                -2147483648);
        print(result);
    }
}
