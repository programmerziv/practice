package com.ziv.hard;

import java.util.Stack;

/**
 * <p>柱状图最大矩形<p>
 *
 * @author: ziv
 * @date: 2020/8/23 3:05 下午
 * @version: 1.0.0
 */
public class Code84 {

    /**
     * 暴力法 遍历每一个柱子 然后寻找该柱子左右  只要有比此柱子小的，就停止寻找
     * @param heights
     * @return
     */
    public static int largestRectangleArea(int[] heights) {
        int maxArea = 0;
        for (int i = 0; i < heights.length; i++) {
            int left = i,right = i;
            int mid = heights[i];
            while (left > 0 && heights[left - 1] >= mid) {
                left --;
            }
            while (right < heights.length - 1 && heights[right + 1] >= mid) {
                right ++;
            }
            maxArea = Math.max((right - left + 1) * mid,maxArea);
        }
        return maxArea;
    }

    /**
     * 典型空间换时间  利用栈  然后左右两边加个哨兵
     * @param heights
     * @return
     */
    public static int largestRectangleArea2(int[] heights) {
        int[] tmp = new int[heights.length + 2];
        System.arraycopy(heights,0,tmp,1,heights.length);
        Stack<Integer> stack = new Stack<Integer>();
        int maxArea = 0;
        for (int i = 0; i < tmp.length; i++) {
            // 如果栈不为空并且数组元素小于栈顶元素
            while (!stack.empty() && tmp[i] < tmp[stack.peek()]) {
                // 栈顶元素就是高 并且将栈顶元素弹出 这个相当于向左右两边寻找左右边界的那个柱子
                int h = tmp[stack.pop()];
                // 此时 右边界是i 左边界为栈顶元素了
                int area = (i - 1 - stack.peek()) * h;
                maxArea = Math.max(maxArea,area);
            }
            // 遍历的元素大于栈顶元素 则入栈;
            stack.push(i);
        }
        return maxArea;
    }


    public static void main(String[] args) {
        int[] hegihts = new int[]{2,1,5,6,2,3};
        largestRectangleArea(hegihts);
    }

}
