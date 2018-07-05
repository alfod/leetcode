package leetcode.medium;

import leetcode.BaseTest;
import me.alfod.medium.ValidSudoku;
import org.junit.Test;

/**
 * Created by Arvin Alfod on 2018/7/5.
 */
public class ValidSudokuTest extends BaseTest {
    private ValidSudoku validSudoku = new ValidSudoku();

    @Test
    public void test1() {
        char[][] para = new char[][]{
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'.', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        boolean result = validSudoku.isValidSudoku(para);
        print(result);

    }
}
