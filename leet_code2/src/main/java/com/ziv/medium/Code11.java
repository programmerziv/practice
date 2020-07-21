package com.ziv.medium;

/**
 * <p>title: 盛最多水容器，二次练习</p>
 * <p>package: com.ziv.medium</p>
 * <p>description: </p>
 *
 * @author zhangzong
 * @version 1.0
 * @date 2020/7/21 8:45
 */
public class Code11 {

    public int maxArea(int[] height) {
        int max = 0;
        for (int i = 0; i < height.length -1; i++) {
            for (int j = i +1 ; j < height.length; j++) {
                int area = (j - i) * Math.min(height[i],height[j]);
                max = Math.max(max,area);
            }
        }
        return max;
    }



    public int maxArea2(int[] height) {
        int max = 0;
        for (int i = 0,j = height.length - 1; i < j;) {
            int minHeight = height[i] < height[j]? height[i++]:height[j--];
            max = Math.max((j-i) * minHeight,max);
        }
        return max;
    }
}
