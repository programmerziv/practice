package com.ziv.hard;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * <p>title: 每隔k个反转链表</p>
 * <p>package: com.ziv.hard</p>
 * <p>description: </p>
 *
 * @author zhangzong
 * @version 1.0
 * @date 2020/8/6 9:06
 */
public class Code25 {


    /**
     * 栈反转方法
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
                p.next = head;
                break;
            }
            while (!stack.isEmpty()) {
                p.next = stack.pollLast();
                p = p.next;
            }
            p.next = tmp;
            head = tmp;
        }
        return dummy.next;
    }


    /**
     * 递归
     * @param head
     * @param k
     * @return
     */
    public ListNode reverseKGroup2(ListNode head, int k) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode tail = head;
        for (int i = 0; i < k; i++){
            if (tail == null) {
                return head;
            }
            tail = tail.next;
        }
        // 反转k个
        ListNode newHead = reverse(head,tail);
        // 递归
        head.next = reverseKGroup2(newHead,k);
        return newHead;
    }

    public ListNode reverse(ListNode head,ListNode tail) {
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



    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
