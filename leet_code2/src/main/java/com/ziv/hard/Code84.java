package com.ziv.hard;

import java.util.Stack;

/**
 * <p>柱状图最大矩形<p>
 *
 * @author: ziv
 * @date: 2020/8/23 4:42 下午
 * @version: 1.0.0
 */
public class Code84 {

    /**
     * 暴力破解  左右遍历
     *
     * @param heights
     * @return
     */
    public static int largestRectangleArea(int[] heights) {
        int maxArea = 0;
        for (int i = 0; i < heights.length; i++) {
            int left = i, right = i;
            int mid = heights[i];
            while (left > 0 && heights[left - 1] > mid) {
                left--;
            }
            while (right < heights.length - 1 && heights[right + 1] > mid) {
                right++;
            }
            maxArea = Math.max((right - left + 1) * mid, maxArea);
        }
        return maxArea;
    }

    public static int largestRectangleArea2(int[] heights) {
        if (heights.length == 0) {
            return 0;
        }
        if (heights.length == 1) {
            return heights[0];
        }
        int[] tmp = new int[heights.length + 2];
        System.arraycopy(heights,0,tmp,1,heights.length);
        int maxArea = 0;
        Stack<Integer> stack = new Stack<Integer>();
        for (int i = 0; i < tmp.length; i++) {
            if (!stack.isEmpty() && tmp[i] < stack.peek()) {
                // 高
                int h = stack.pop();
                // 宽
                int w = i - stack.peek() - 1;
                maxArea = Math.max(h * w,maxArea);
            }
            stack.push(i);
        }

        return maxArea;
    }
}