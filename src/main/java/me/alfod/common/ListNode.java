package me.alfod.common;

/**
 * @author Yang Dong
 * @createTime 2018/7/3  13:43
 * @lastUpdater Yang Dong
 * @lastUpdateTime 2018/7/3  13:43
 * @note
 */
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
    }

    public static ListNode build(int... num) {
        ListNode listNode = null;
        ListNode first = null;
        for (int i : num) {
            if (listNode == null) {
                listNode = new ListNode(i);
                first = listNode;
            } else {
                listNode.next = new ListNode(i);
                listNode = listNode.next;
            }
        }
        return first;
    }

    public static void print(ListNode listNode) {
        StringBuilder stringBuilder = new StringBuilder();
        while (listNode != null) {
            stringBuilder.append(listNode.val);
            listNode = listNode.next;
            if (listNode != null) {
                stringBuilder.append(" -> ");
            }
        }
        System.out.println(stringBuilder.toString());
    }
}
