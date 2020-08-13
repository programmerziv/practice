package com.ziv.easy;

import java.util.Arrays;

/**
 * <p>title: </p>
 * <p>package: com.ziv.easy</p>
 * <p>description: </p>
 *
 * @author zhangzong
 * @version 1.0
 * @date 2020/8/6 18:20
 */
public class Code88 {


    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if (nums2 == null) {
            return;
        }
        for (int i = 0, j = m; i < n; i++,j++) {
            nums1[j] = nums2[i];
        }
        for (int k = 1; k < nums1.length; k++) {
            for (int l = 0; l < nums1.length - 1; l++) {
                int tmp  = nums1[l];
                if (nums1[l] > nums1[l + 1]) {
                    nums1[l] = nums1[l + 1];
                    nums1[l + 1] = tmp;
                }
            }

        }
    }

    public static void merge2(int[] nums1, int m, int[] nums2, int n) {
        System.arraycopy(nums2,0,nums1,m,n);
        Arrays.sort(nums1);
    }

    public static void merge3(int[] nums1, int m, int[] nums2, int n) {
        // nums1的尾部元素
        int index = nums1.length -1;
        // nums1的最后一个值的位置
        int tail1 = m - 1;
        // nums2的最后一个值的位置
        int tail2 = n - 1;
        // 当nums2一直有值时
        while (tail2 >= 0) {
            // 当tail1走到头时
            if (tail1 < 0) {
                nums1[index--] = nums2[tail2--];
                // nums1和nums2的最后一位比较  谁大谁放后面
            } else if (nums1[tail1] >= nums2[tail2]) {
                nums1[index--] = nums1[tail1--];
            } else {
                nums1[index--] = nums2[tail2--];
            }
        }


    }






    public static void main(String[] args) {
        int[] nums1 = new int[]{1,2,3,0,0,0};
        int[] nums2 = new int[]{1,5,6};
        merge3(nums1,3,nums2,3);
    }


}
