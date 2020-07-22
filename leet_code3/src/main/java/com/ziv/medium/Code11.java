package com.ziv.medium;

/**
 * <p>title: </p>
 * <p>package: com.ziv.medium</p>
 * <p>description: </p>
 *
 * @author zhangzong
 * @version 1.0
 * @date 2020/7/22 9:03
 */
public class Code11 {

    /**
     * 双重循环 时间复杂度O(n^2)
     * @param height
     * @return
     */
    public static int maxArea(int[] height) {
        int max = 0;
        for (int i = 0; i < height.length -1; i++) {
            for ( int j = i + 1; j < height.length; j++) {
                int area = (j - i) * Math.min(height[i],height[j]);
                max = Math.max(max,area);
            }
        }
        return max;
    }
    /**
     * 双重循环 时间复杂度O(n^2)
     * @param height
     * @return
     */
    public static int maxArea2(int[] height) {
        int max = 0;
        for (int i = 0,j = height.length -1;i < j;) {
            int midHeight = height[i] < height[j]? height[i++]:height[j--];
            int area = (j - i + 1) * midHeight;
            max = Math.max(max,area);
        }
        return max;
    }
    /**
     * 双重循环 时间复杂度O(n^2)
     * @param height
     * @return
     */
    public static int maxArea3(int[] height) {
        int max = 0,i = 0,j = height.length - 1;
        while (i < j) {
             max = height[i] < height[j]?
                    Math.max((j - i) * height[i++],max):
                    Math.max((j - i) * height[j--],max);
        }
        return max;
    }


    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
        System.out.println(maxArea2(height));
        System.out.println(maxArea3(height));
    }


}
