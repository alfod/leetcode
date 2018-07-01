package leetcode.medium;

import leetcode.BaseTest;
import me.alfod.medium.TripletsSumZero;
import org.junit.Test;

import java.util.List;

/**
 * Created by Arvin Alfod on 2018/7/1.
 */
public class TripletsSumZeroTest extends BaseTest {
    private TripletsSumZero tripletsSumZero = new TripletsSumZero();

    @Test
    public void test1() {
        List<List<Integer>> result = tripletsSumZero.threeSum(new int[]{-1, 0, 1, 2, -1, -4});
        print(result);
    }

    @Test
    public void test2() {
        List<List<Integer>> result = tripletsSumZero.threeSum(new int[]{0});
        print(result);
    }

    @Test
    public void test3() {
        List<List<Integer>> result = tripletsSumZero.threeSum(new int[]{-1, 0, 0, 2, -1, -4});
        print(result);
    }

    @Test
    public void test4() {
        List<List<Integer>> result = tripletsSumZero.threeSum(new int[]{-1, 0, 1, 2, -1, -4});
        print(result);
    }

    @Test
    public void test5() {
        List<List<Integer>> result = tripletsSumZero.threeSum(new int[]{-4, -2, 1, -5, -4, -4, 4, -2, 0, 4, 0, -2, 3, 1, -5, 0});
        print(result);
    }

    @Test
    public void test6() {
        int[] points = new int[]{-4,-2,-2,-2,0,1,2,2,2,3,3,4,4,6,6};
        List<List<Integer>> result = tripletsSumZero.threeSum(points);
        print(result);
    }
}
