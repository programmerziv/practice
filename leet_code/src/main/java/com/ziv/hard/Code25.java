package com.ziv.hard;


import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

/**
 * <p>title: </p>
 * <p>package: com.ziv.hard</p>
 * <p>description: </p>
 *
 * @author zhangzong
 * @version 1.0
 * @date 2020/8/5 19:05
 */
public class Code25 {

    /**
     * 利用栈实现反转
     *
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
            // 每次压够k个进stack
            while (tmp != null && count < k) {
                stack.add(tmp);
                tmp = tmp.next;
                count++;
            }
            // 如果不相等  说明最后不够k个了
            if (count != k) {
                p.next = head;
                break;
            }
            // 弹栈
            while (!stack.isEmpty()) {
                p.next = stack.pollLast();
                p = p.next;
            }
            // 弹栈做完之后 将新的p的下一个指定为tmp
            p.next = tmp;
            // 将head也缩短了
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
        for (int i = 0; i < k; i++) {
            if (tail == null) {
                return head;
            }
            // tail一直往下走  走了k个
            tail = tail.next;
        }
        // 反转前面的k个元素了
        ListNode newHead = reverse(head,tail);

        // 下一轮开始的地方就是tail
        // 第一轮的时候head的位置还没变 第二轮的head就是第一轮的tail了
        head.next = reverseKGroup2(tail,k);

        return newHead;
    }

    /**
     * 左闭右开 反转链表
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