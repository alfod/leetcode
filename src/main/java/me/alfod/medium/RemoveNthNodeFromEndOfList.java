package me.alfod.medium;

/**
 * Created by Arvin Alfod on 2018/7/2.
 */
public class RemoveNthNodeFromEndOfList {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode node = head, nodeEndN = head;
        for (int i = 0; i < n; i++) {
            nodeEndN = nodeEndN.next;
        }
        if (nodeEndN == null) {
            return head.next;
        }
        if (nodeEndN.next == null) {
            if (head.next != null) {
                head.next = head.next.next;
            } else {
                return null;
            }
            return head;
        }
        while (true) {
            node = node.next;
            nodeEndN = nodeEndN.next;
            if (nodeEndN.next == null) {
                node.next = node.next.next;
                return head;
            }
        }
    }

    public static class ListNode {
        public int val;
        public ListNode next;

        public ListNode(int x) {
            val = x;
        }
    }
}
