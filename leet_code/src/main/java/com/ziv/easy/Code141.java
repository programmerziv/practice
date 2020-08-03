package com.ziv.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * <p>title: 链表是否是闭环</p>
 * <p>package: com.ziv.easy</p>
 * <p>description: </p>
 *
 * @author zhangzong
 * @version 1.0
 * @date 2020/8/3 10:13
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
     * 双指针法
     * @param head
     * @return
     */
    public boolean hasCycle2(ListNode head) {
        // 如果head或者head只有一个 那就不用判断
        if (head == null || head.next == null) {
            return false;
        }
        // 快慢起始节点
        ListNode slow = head.next;
        ListNode fast = head.next.next;
        // fast如果追上了slow 那么证明是闭环的
        while (slow != fast) {

            if (fast == null || fast.next == null) {
                return false;
            }
            // 慢的每次走一个  快的每次走两个
            slow = slow.next;
            fast = fast.next.next;

        }
        return true;
    }


}
