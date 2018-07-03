package leetcode.medium;

import me.alfod.common.ListNode;
import me.alfod.medium.SwapNodesInPairs;
import org.junit.Test;

/**
 * @author Yang Dong
 * @createTime 2018/7/3  13:45
 * @lastUpdater Yang Dong
 * @lastUpdateTime 2018/7/3  13:45
 * @note
 */
public class SwapNodesInPairsTest {
    private SwapNodesInPairs swapNodesInPairs = new SwapNodesInPairs();

    @Test
    public void test1() {
        ListNode para = ListNode.build(1, 2, 3, 4, 5);
        ListNode result = swapNodesInPairs.swapPairs(para);
        ListNode.print(result);

    }

    @Test
    public void test2() {
        ListNode para = ListNode.build(1, 2, 3, 4, 5, 6, 7, 8, 9);
        ListNode result = swapNodesInPairs.swapPairs(para);
        ListNode.print(result);

    }
}
