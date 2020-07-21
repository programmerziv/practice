package com.ziv.medium;

/**
 * <p>title: Code11</p>
 * <p>package: com.ziv.medium</p>
 * <p>description: 盛最多水的容器 </p>
 *
 * @author zhangzong
 * @version 1.0
 * @date 2020/7/20 9:32
 */
public class Code11 {

    public int maxArea(int[] height) {
        int max = 0;
        for (int i=0; i<height.length-1; i++) {
            for (int j = i+1; j<height.length-1; j++) {
                int area = (j-i) * Math.min(height[i],height[j]);
                max = Math.max(area,max);
            }
        }
        return max;
    }


    public static int maxArea2(int[] height) {
        int max = 0;
        for (int i = 0, j = height.length-1; i < j;) {
            int minHeight = height[i] < height[j]? height[i++] : height[j--];
            int area = (j-i+1) * minHeight;
            max = Math.max(area,max);
        }
        return max;
    }


    public static void main(String[] args) {
        int[] heignt = {1,8,6,2,5,4,8,3,7};
        maxArea2(heignt);


    }
}
