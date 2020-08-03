package com.ziv.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * <p>title: </p>
 * <p>package: com.ziv.easy</p>
 * <p>description: </p>
 *
 * @author zhangzong
 * @version 1.0
 * @date 2020/8/3 10:38
 */
public class Code141 {

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    /**
     * hash法
     * @param head
     * @return
     */
    public boolean hasCycle(ListNode head) {
        Set<ListNode> vals = new HashSet<ListNode>(16);
        while (head != null) {
            if (vals.contains(head)) {
                return true;
            } else {
                vals.add(head);
                head = head.next;
            }
        }
       return false;
    }


    /**
     * 快慢指针法
     * @param head
     * @return
     */
    public boolean hasCycle2(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head.next;
        ListNode fast = head.next.next;

        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }

        return true;
    }
}