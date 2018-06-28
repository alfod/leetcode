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


    @Test
    public void test1() {
        int[] nums1 = new int[]{1, 2, 5, 8, 11};
        int[] nums2 = new int[]{7, 9, 10};
        double x = medianOfTwoSortedArray.findMedianSortedArrays(nums1, nums2);
        System.out.println(x);
    }

    @Test
    public void test3() {
        int[] nums1 = new int[]{1, 2};
        int[] nums2 = new int[]{3, 4};
        double x = medianOfTwoSortedArray.findMedianSortedArrays(nums1, nums2);
        System.out.println(x);
    }

    @Test
    public void test4() {
        int[] nums1 = new int[]{};
        int[] nums2 = new int[]{2, 3};
        double x = medianOfTwoSortedArray.findMedianSortedArrays(nums1, nums2);
        System.out.println(x);
    }

    @Test
    public void test5() {
        int[] nums1 = new int[]{1};
        int[] nums2 = new int[]{1};
        double x = medianOfTwoSortedArray.findMedianSortedArrays(nums1, nums2);
        System.out.println(x);
    }


    @Test
    public void test2() {
        int[] nums1 = new int[]{1, 3};
        int[] nums2 = new int[]{2};
        double x = medianOfTwoSortedArray.findMedianSortedArrays(nums1, nums2);
        System.out.println(x);
    }
}
