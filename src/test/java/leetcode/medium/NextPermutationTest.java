package leetcode.medium;

import leetcode.BaseTest;
import me.alfod.medium.NextPermutation;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Arvin Alfod on 2018/7/4.
 */
public class NextPermutationTest extends BaseTest {
    private NextPermutation nextPermutation = new NextPermutation();

    @Test
    public void test1() {
        int[] para = new int[]{1, 2, 3}, temp;
        int count = factorial(para.length);

        List<int[]> list = new ArrayList<>(count);
        for (int i = 0; i < count; i++) {
            nextPermutation.nextPermutation(para);
            if (!contains(list, para)) {
                temp = para.clone();
                list.add(temp);
            }
        }
        print(list);
    }

    @Test
    public void test2() {
        int[] para = new int[]{
                1,2
        };
        nextPermutation.nextPermutation(para);
        print(para);
    }

    @Test
    public void reverseTest() {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        nextPermutation.reverse(nums, 6);
        print(nums);
    }

    private boolean contains(List<int[]> list, int[] para) {
        if (list.size() == 0) {
            return false;
        }
        boolean isEquals;
        for (int[] item : list) {
            if (item.length != para.length) {
                continue;
            }
            isEquals = true;
            for (int i = 0; i < item.length; i++) {
                if (item[i] != para[i]) {
                    isEquals = false;
                }
            }
            if (isEquals) {
                return true;
            }
        }
        return false;
    }

    private int factorial(int a) {
        if (a == 1) {
            return a;
        }
        return a * factorial(a - 1);
    }
}
