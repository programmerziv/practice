package com.ziv.medium;


/**
 * <p>title: </p>
 * <p>package: com.ziv.medium</p>
 * <p>description: </p>
 *
 * @author zhangzong
 * @version 1.0
 * @date 2020/8/3 11:25
 */
public class Code142 {


    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }

        ListNode slow = head.next;
        ListNode fast = head.next.next;
        while (true) {
            if (fast == null || fast.next == null) {
                return null;
            }
            if (slow == fast) {
              break;
            } else {
                slow = slow.next;
                fast = fast.next.next;
            }
        }
        // 此时 fast重置为head  fast与slow 再相遇即入口位置
        fast = head;
        while (fast != slow) {
            fast = fast.next;
            slow = slow.next;
        }
        return fast;
    }



}
