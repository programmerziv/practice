package com.ziv.medium;


/**
 * <p>title:两两交换链表中的节点 </p>
 * <p>package: com.ziv.medium</p>
 * <p>description: </p>
 *
 * @author zhangzong
 * @version 1.0
 * @date 2020/7/26 18:39
 */
public class Code24 {


    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }
    public static ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode next = head.next;
        head.next = swapPairs(next.next);
        next.next = head;
        return next;
    }


    public static void main(String[] args) {
        ListNode listNode1 =  new ListNode(1);
        ListNode listNode2 =  new ListNode(2);
        ListNode listNode3 =  new ListNode(3);
        ListNode listNode4 =  new ListNode(4);
        ListNode listNode5 =  new ListNode(5);
        ListNode listNode6 =  new ListNode(6);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        listNode5.next = listNode6;
        swapPairs(listNode1);
    }

}
