package com.ziv.hard;

import java.util.Deque;
import java.util.LinkedList;

/**
 * <p>title: 滑动窗口问题</p>
 * <p>package: com.ziv.hard</p>
 * <p>description: </p>
 *
 * @author zhangzong
 * @version 1.0
 * @date 2020/8/24 11:43
 */
public class Code239 {
    /**
     * 暴力法
     *
     * @param nums
     * @param k
     * @return
     */
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length == 0) {
            return nums;
        }
        int[] result = new int[nums.length - k + 1];
        for (int i = 0; i < result.length; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < k; j++) {
                max = Math.max(max, nums[i + j]);
            }
            result[i] = max;
        }
        return result;
    }

    /**
     * 双队列法  维护一个k大小的队列  还有一个队列的first始终是k队列中的最大值
     * @param nums
     * @param k
     * @return
     */
    public int[] maxSlidingWindow2(int[] nums, int k) {

        int n = nums.length;
        int[] result = new int[n - k + 1];
        for (int i = 0; i < k; i++) {
            push(nums[i]);
        }
        int now = 0;
        result[now++] = getMax();
        for (int i = k; i < n; i++) {
            pop();
            push(nums[i]);
            result[now++] = getMax();
        }
        return result;

    }
    // 先建俩队列
    Deque<Integer> nowVal = new LinkedList<Integer>();
    Deque<Integer> maxVal = new LinkedList<Integer>();

    /**
     * 获取最大值 max的第一个
     * @return
     */
    private int getMax(){
        return maxVal.peekFirst();
    }

    /**
     * 添加
     * now直接就添加到最后一个
     * max则是拿最后一个和新数比 x会一直往上顶
     * @param x
     */
    private void push(int x) {
        nowVal.addLast(x);
        while (maxVal.size() != 0 && maxVal.peekLast() < x) {
            maxVal.pollLast();
        }
        maxVal.addLast(x);
    }

    /**
     * 删除
     * now直接删除第一个
     * max拿最大的和删除的比较 如果相等  则将第一个给删了
     */
    private void pop() {
        int x = nowVal.pollFirst();
        if (maxVal.size() != 0 && maxVal.peekFirst() == x) {
            maxVal.pollFirst();
        }
    }

}