package leetcode.medium;

import leetcode.BaseTest;
import me.alfod.medium.SearchInRotatedSortedArray;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Arvin Alfod on 2018/7/4.
 */
public class SearchInRotatedSortedArrayTest extends BaseTest {
    private SearchInRotatedSortedArray searchInRotatedSortedArray = new SearchInRotatedSortedArray();

    @Test
    public void test1() {
        int[] para = new int[]{4, 5, 6, 7, 0, 1, 2};
        int n = searchInRotatedSortedArray.search(para, 0);
        Assert.assertEquals(4, n);
    }
    @Test
    public void test2() {
        int[] para = new int[]{1,2,3,4};
        int n = searchInRotatedSortedArray.search(para, 0);
        Assert.assertEquals(-1, n);
    }
}
