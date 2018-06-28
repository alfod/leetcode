package me.alfod.medium;

/**
 * @author Yang Dong
 * @createTime 2018/6/28  18:13
 * @lastUpdater Yang Dong
 * @lastUpdateTime 2018/6/28  18:13
 * @note
 */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = null;
        ListNode first = null;
        int sum = 0, carry = 0, singleDigit;
        while (l1 != null || l2 != null || carry != 0) {
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            sum += carry;
            carry = sum / 10;
            singleDigit = sum % 10;
            if (result == null) {
                result = new ListNode(singleDigit);
                first = result;
            } else {
                result.next = new ListNode(singleDigit);
                result = result.next;
            }
            sum = 0;
        }
        return first;
    }

    public static class ListNode {
        public int val;
        public ListNode next;

        public ListNode(int x) {
            val = x;
        }
    }
}



