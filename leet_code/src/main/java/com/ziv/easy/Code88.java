package com.ziv.easy;

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

    public static void main(String[] args) {
        int[] nums1 = new int[]{1,2,3,0,0,0};
        int[] nums2 = new int[]{2,5,6};
        merge(nums1,3,nums2,3);
    }


}
