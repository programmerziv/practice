package com.ziv.hard;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

/**
 * <p>title: 链表每k个反转</p>
 * <p>package: com.ziv.hard</p>
 * <p>description: </p>
 *
 * @author zhangzong
 * @version 1.0
 * @date 2020/8/5 19:31
 */
public class Code25 {

    /**
     * 利用栈反转
     * @param head
     * @param k
     * @return
     */
    public ListNode reverseKGroup(ListNode head, int k) {
        Deque<ListNode> stack = new ArrayDeque<ListNode>(10);
        ListNode dummy = new ListNode(0);
        ListNode p = dummy;
        while (true) {
            int count = 0;
            ListNode tmp = head;
            while (tmp != null && count < k) {
                stack.add(tmp);
                tmp = tmp.next;
                count ++;
            }

            if (count != k) {
                p.next = tmp;
                break;
            }
            // 弹栈
            while (!stack.isEmpty()) {
                p.next = stack.pollLast();
                //向下移动一位
                p = p.next;
            }
            // 新老相连
            p.next = tmp;
            // head变短
            head = tmp;
        }
        return dummy.next;
    }

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }


    /**
     * 递归 定一个tail  每次先反转tail之前的k个  然后head指向tail 然后计算tail
     * @param head
     * @param k
     * @return
     */
    public ListNode reverseKGroup2(ListNode head, int k) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode tail = head;
        for (int i = 0; i < k; i++) {
            if (tail == null) {
                return head;
            }
            tail = tail.next;
        }
        // 反转从head到tail 之间的k个
        ListNode newHead = reverse(head,tail);
        // 剩下的是从tail开始的 此时head == tail
        head.next = reverseKGroup2(tail,k);
        return newHead;
    }


    /**
     * 反转链表
     * @param head
     * @param tail
     * @return
     */
    private ListNode reverse(ListNode head,ListNode tail) {
        ListNode pre = null;
        ListNode next = null;
        while (head != tail) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }
}
