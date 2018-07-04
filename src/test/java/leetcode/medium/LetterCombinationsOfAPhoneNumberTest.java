package leetcode.medium;

import leetcode.BaseTest;
import me.alfod.medium.LetterCombinationsOfAPhoneNumber;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Yang Dong
 * @createTime 2018/7/2  17:54
 * @lastUpdater Yang Dong
 * @lastUpdateTime 2018/7/2  17:54
 * @note
 */
public class LetterCombinationsOfAPhoneNumberTest extends BaseTest {
    private LetterCombinationsOfAPhoneNumber letterCombinationsOfAPhoneNumber = new LetterCombinationsOfAPhoneNumber();

    @Test
    public void test1() {
       String para="23";
       List<String> result=letterCombinationsOfAPhoneNumber.letterCombinations(para);
       print(result);
    }
}
