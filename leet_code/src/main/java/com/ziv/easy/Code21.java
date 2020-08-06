package com.ziv.easy;

import java.util.List;

/**
 * 合并俩有序链表
 * 递归方法
 */
public class Code21 {


    static class ListNode{
        int val;
        ListNode next;
        ListNode(int x){val = x;}
    }

    public static ListNode mergeTwoLists(ListNode l1,ListNode l2){
        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }
        // 判断l1和l2头结点哪个更小，然后较小结点的next指针指向 其余结点的合并结果
        if(l1.val < l2.val){
            l1.next = mergeTwoLists(l1.next,l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1,l2.next);
            return l2;
        }
    }


    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);

        ListNode l1 = new ListNode(1);
        l1.next = node2;
        node2.next = node3;
        node3.next =node4;
        node4.next = node5;
        node5.next = node6;

        ListNode l2 = new ListNode(1);

        l2.next = node3;
        ListNode node = mergeTwoLists(l1, l2);
        System.out.println(node);



    }

}
