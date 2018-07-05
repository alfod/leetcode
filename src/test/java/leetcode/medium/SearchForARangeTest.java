package leetcode.medium;

import leetcode.BaseTest;
import me.alfod.medium.SearchForARange;
import org.junit.Test;

/**
 * @author Yang Dong
 * @createTime 2018/7/5  11:11
 * @lastUpdater Yang Dong
 * @lastUpdateTime 2018/7/5  11:11
 * @note
 */
public class SearchForARangeTest extends BaseTest {
    private SearchForARange searchForARange = new SearchForARange();

    @Test
    public void test1() {
        int[] para = new int[]{1, 4, 4, 8};
        int target = 5;
        int[] result = searchForARange.searchRange(para, target);
        print(result);

    }

}
