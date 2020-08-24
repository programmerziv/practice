package com.ziv.hard;

import java.util.Stack;

/**
 * <p>title: 柱状图最大矩形 </p>
 * <p>package: com.ziv.hard</p>
 * <p>description: </p>
 *
 * @author zhangzong
 * @version 1.0
 * @date 2020/8/24 10:40
 */
public class Code84 {

    /**
     * 暴力法
     *
     * @param heights
     * @return
     */
    public static int largestRectangleArea(int[] heights) {
        int maxArea = 0;
        for (int i = 0; i < heights.length; i++) {
            int left = i, right = i;
            int h = heights[i];
            while (left > 0 && heights[left - 1] > h) {
                left--;
            }
            while (right < heights.length - 1 && heights[right + 1] > h) {
                right++;
            }
            int w = right - left - 1;
            maxArea = Math.max(h * w, maxArea);
        }
        return maxArea;
    }


    /**
     * 栈方法
     * @param heights
     * @return
     */
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
            if (!stack.isEmpty() && stack.peek() > tmp[i]) {
                int h = stack.pop();
                int w = i - stack.peek() - 1;
                maxArea = Math.max(h * w,maxArea );
            }
            stack.push(i);
        }
        return maxArea;
    }
}
