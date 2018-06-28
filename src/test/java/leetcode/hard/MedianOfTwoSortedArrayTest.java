package leetcode.hard;

import leetcode.BaseTest;
import me.alfod.hard.MedianOfTwoSortedArray;
import org.junit.Test;

/**
 * @author Yang Dong
 * @createTime 2018/6/25  18:20
 * @lastUpdater Yang Dong
 * @lastUpdateTime 2018/6/25  18:20
 * @note
 */
public class MedianOfTwoSortedArrayTest extends BaseTest {
    private final int[] array = new int[]{7, 8, 8, 10};
    private final int[] array1 = new int[]{5, 6, 8, 9, 11};
    private MedianOfTwoSortedArray medianOfTwoSortedArray = new MedianOfTwoSortedArray();

    @Test
    public void findRangeTest1() {
        int[] range = medianOfTwoSortedArray.findRange(array, 6, new int[]{-1, 10});
        print(range);
    }

    @Test
    public void findRangeTest2() {
        int[] range = medianOfTwoSortedArray.findRange(array, 7, new int[]{-1, 10});
        print(range);
    }

    @Test
    public void findRangeTest3() {
        int[] nums = new int[]{1, 4, 4, 4, 5, 7};
        int[] range = medianOfTwoSortedArray.findRange(array, 8, new int[]{-1, 10});
        print(range);
    }

    @Test
    public void findRangeTest4() {
        int[] nums = new int[]{1, 4, 4, 4, 5, 7};
        int[] range = medianOfTwoSortedArray.findRange(array, 9, new int[]{-1, 10});
        print(range);
    }

    @Test
    public void findRangeTest5() {
        int[] range = medianOfTwoSortedArray.findRange(array, 10, new int[]{-1, 10});
        print(range);
    }

    @Test
    public void findRangeTest6() {
        int[] range = medianOfTwoSortedArray.findRange(array, 11, new int[]{-1, 10});
        print(range);
    }

    @Test
    public void findRangeTest7() {
        int[] range = medianOfTwoSortedArray.findRange(array, 12, new int[]{-1, 10});
        print(range);
    }

    //
//    private final int[] array = new int[]{7, 8, 8, 10};
//    private final int[] array1 = new int[]{5, 6, 8, 9, 11};
    @Test
    public void findByIndex() {
        double x = medianOfTwoSortedArray.findByIndex(array, array1, 6);
        print(x);
    }

    @Test
    public void findMedianSortedArrays() {
        final int[] array = new int[]{7, 8, 10};
        final int[] array1 = new int[]{5, 9, 11};
        double x = medianOfTwoSortedArray.findMedianSortedArrays(array, array1);
        print(x);
    }


}
