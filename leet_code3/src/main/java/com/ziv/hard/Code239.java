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
 * @date 2020/8/25 14:56
 */
public class Code239 {

    /**
     * 暴力解法
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
                max = Math.max(max,nums[i + j]);
            }
            result[i] = max;
        }
        return result;
    }


    /**
     * 维护两个栈 一个里面有k个  一个里面的头元素是最大值
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
        int max = 0;
        result[max++] = getMax();
        for (int i = k; i < n; i++) {
            pop();
            push(nums[i]);
            result[max++] = getMax();
        }
        return result;
    }


    Deque<Integer> maxVal = new LinkedList<Integer>();
    Deque<Integer> nowVal = new LinkedList<Integer>();

    private int getMax() {
        return maxVal.peekFirst();
    }

    /**
     * 入栈
     * @param val
     */
    private void push(int val) {
        nowVal.addLast(val);
        while (maxVal.size() != 0 && val > maxVal.peekLast()) {
            maxVal.pollLast();
        }
        maxVal.addLast(val);
    }

    /**
     * 出栈
     */
    private void pop() {
        int val = nowVal.pollFirst();
        if (maxVal.size() != 0 && val == maxVal.peekFirst()) {
            maxVal.pollFirst();
        }
    }

}
