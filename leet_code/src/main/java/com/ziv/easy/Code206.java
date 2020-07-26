package com.ziv.easy;


import java.util.List;

/**
 * <p>title: 反转一个链表</p>
 * <p>package: com.ziv.easy</p>
 * <p>description: </p>
 *
 * @author zhangzong
 * @version 1.0
 * @date 2020/7/26 17:39
 */
public class Code206 {


    public static ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode tmp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = tmp;
        }
        return pre;
    }

    public static ListNode reverseList2(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode cur = reverseList2(head.next);
        head.next.next = head;
        head.next = null;
        return cur;
    }



        static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }


    }


    public static void main(String[] args) {
        ListNode listNode1 =  new ListNode(1);
        ListNode listNode2 =  new ListNode(2);
        ListNode listNode3 =  new ListNode(3);
        ListNode listNode4 =  new ListNode(4);
        ListNode listNode5 =  new ListNode(5);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        reverseList2(listNode1);
    }
}