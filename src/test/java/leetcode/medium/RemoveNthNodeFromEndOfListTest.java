package leetcode.medium;

import leetcode.BaseTest;
import me.alfod.medium.RemoveNthNodeFromEndOfList;
import org.junit.Test;

/**
 * Created by Arvin Alfod on 2018/7/2.
 */
public class RemoveNthNodeFromEndOfListTest extends BaseTest {
    private RemoveNthNodeFromEndOfList removeNthNodeFromEndOfList = new RemoveNthNodeFromEndOfList();

    @Test
    public void test1() {
        RemoveNthNodeFromEndOfList.ListNode node = build(1, 2, 3, 4, 5);
        removeNthNodeFromEndOfList.removeNthFromEnd(node, 2);
        print(node);
    }

    @Test
    public void test2() {
        RemoveNthNodeFromEndOfList.ListNode node = build(1, 2, 3);
        RemoveNthNodeFromEndOfList.ListNode result = removeNthNodeFromEndOfList.removeNthFromEnd(node, 1);
        print(result);
    }

    @Test
    public void test3() {
        RemoveNthNodeFromEndOfList.ListNode node = build(1, 2,1);
        RemoveNthNodeFromEndOfList.ListNode result = removeNthNodeFromEndOfList.removeNthFromEnd(node, 1);
        print(result);
    }

    private void print(RemoveNthNodeFromEndOfList.ListNode node) {
        while (node != null) {
            print(node.val);
            node = node.next;
        }
    }

    private RemoveNthNodeFromEndOfList.ListNode build(int... ints) {
        RemoveNthNodeFromEndOfList.ListNode head = null, node = null;
        for (int anInt : ints) {
            if (head == null) {
                head = new RemoveNthNodeFromEndOfList.ListNode(anInt);
                node = head;
            } else {
                node.next = new RemoveNthNodeFromEndOfList.ListNode(anInt);
                node = node.next;
            }
        }
        return head;
    }
}
