package me.alfod.medium;

import me.alfod.common.ListNode;

/**
 * @author Yang Dong
 * @createTime 2018/7/3  13:44
 * @lastUpdater Yang Dong
 * @lastUpdateTime 2018/7/3  13:44
 * @note
 */
public class SwapNodesInPairs {
    public ListNode swapPairs(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode first = head, second = head.next, last;
        if (second == null) {
            return first;
        }
        head = second;
        while (true) {
            first.next = second.next;
            second.next = first;
            last = first;
            first = first.next;
            if (first == null || first.next == null) {
                break;
            }
            second = first.next;
            last.next = second;
        }
        return head;
    }
}
