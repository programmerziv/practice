package com.ziv.medium;

import com.ziv.easy.Code141;

/**
 * <p>title: 判断链表是否有环并且返回环的位置</p>
 * <p>package: com.ziv.medium</p>
 * <p>description: </p>
 *
 * @author zhangzong
 * @version 1.0
 * @date 2020/8/4 14:15
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
        fast = head;
        while (fast != slow) {
            slow = slow.next;
            fast = fast.next;
        }
        return fast;

    }




}
