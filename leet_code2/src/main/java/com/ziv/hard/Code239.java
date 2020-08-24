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
 * @date 2020/8/24 19:27
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
                max = Math.max(max,nums[i + j]);
            }
            result[i] = max;
        }
        return result;
    }

    /**
     * 两个队列 空间换时间
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

    Deque<Integer> nowVal = new LinkedList<Integer>();
    Deque<Integer> maxVal = new LinkedList<Integer>();


    private int getMax() {
        return maxVal.peekFirst();
    }

    private void push(int x) {
        nowVal.addLast(x);
        while (maxVal.size() != 0 && x > maxVal.peekLast()) {
            maxVal.pollLast();
        }
        maxVal.addLast(x);
    }

    private void pop () {
        int x = nowVal.pollFirst();
        // 每次只会弹一个  因为每次最多增加一个
        if (maxVal.size() != 0 && maxVal.peekFirst() == x) {
            maxVal.pollFirst();
        }
    }

}
