package leetcode.medium;

import leetcode.BaseTest;
import me.alfod.medium.AddTwoNumbers;
import org.junit.Test;

/**
 * @author Yang Dong
 * @createTime 2018/6/28  18:27
 * @lastUpdater Yang Dong
 * @lastUpdateTime 2018/6/28  18:27
 * @note
 */
public class AddTwoNumbersTest extends BaseTest {

    private AddTwoNumbers addTwoNumbers = new AddTwoNumbers();

    @Test
    public void test() {
        me.alfod.medium.AddTwoNumbers.ListNode listNode = build(3, 4, 5, 8);
        me.alfod.medium.AddTwoNumbers.ListNode listNode1 = build(4, 9, 9);
        me.alfod.medium.AddTwoNumbers.ListNode result = addTwoNumbers.addTwoNumbers(listNode, listNode1);
        print(result);

    }

    private void print(me.alfod.medium.AddTwoNumbers.ListNode listNode) {
        while (listNode != null) {
            print(listNode.val);
            listNode = listNode.next;
        }
    }

    private me.alfod.medium.AddTwoNumbers.ListNode build(int... num) {
        me.alfod.medium.AddTwoNumbers.ListNode listNode = null;
        me.alfod.medium.AddTwoNumbers.ListNode first = null;
        for (int i : num) {
            if (listNode == null) {
                listNode = new me.alfod.medium.AddTwoNumbers.ListNode(i);
                first = listNode;
            } else {
                listNode.next = new me.alfod.medium.AddTwoNumbers.ListNode(i);
                listNode = listNode.next;
            }
        }
        return first;
    }
}
