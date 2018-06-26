package leetcode.hard;

import leetcode.BaseTest;
import me.alfod.hard.MedianOfTwoSortedArray;
import org.junit.Test;

import java.util.Arrays;

/**
 * @author Yang Dong
 * @createTime 2018/6/25  18:20
 * @lastUpdater Yang Dong
 * @lastUpdateTime 2018/6/25  18:20
 * @note
 */
public class MedianOfTwoSortedArrayTest   extends BaseTest {

    private MedianOfTwoSortedArray medianOfTwoSortedArray = new MedianOfTwoSortedArray();

    @Test
    public void findRangeTest() {
        int[] nums = new int[]{1, 2, 3, 3, 3, 3, 4, 4, 4, 5, 7};
        int[] range = medianOfTwoSortedArray.findRange(nums, 4, 6, new int[]{0, 10});
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
    public void findIndexTest1() {
        int[] nums1 = new int[]{1, 3};
        int[] index = medianOfTwoSortedArray.findNotGreaterNum(nums1, 2, new int[2]);
        System.out.println(Arrays.toString(index));
    }

    @Test
    public void test2() {
        int[] nums1 = new int[]{1, 3};
        int[] nums2 = new int[]{2};
        double x = medianOfTwoSortedArray.findMedianSortedArrays(nums1, nums2);
        System.out.println(x);
    }
}
