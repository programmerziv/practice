package com.ziv.easy;

/**
 * <p>title:旋转数组 指定k 数组移动k位</p>
 * <p>package: com.ziv.easy</p>
 * <p>description: </p>
 *
 * @author zhangzong
 * @version 1.0
 * @date 2020/8/6 16:37
 */
public class Code189 {

    /**
     * 每次挪动1次 挪动k次
     * @param nums
     * @param k
     */
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        if (len == 0) {
            return;
        }
        k = k % len;
        // 数组每次往右挪动一次  一共需要挪动k次
        for (int i = 0; i < k; i ++) {
            // 每次挪动一格
            int tmp = nums[len - 1];
            int count = len -1;
            while (count > 0) {
                nums[count] = nums[count -1];
                count--;
            }
            nums[0] = tmp;
        }
    }

    /**
     * 反转数组3次 第一次全反转 第二次 k之前的反转 第三次 k之后的反转
     * @param nums
     * @param k
     */
    public void rotate2(int[] nums, int k) {
        if (nums.length == 0) {
            return;
        }
        k = k % nums.length;
        reverse(nums,0,nums.length -1);
        reverse(nums,0,k - 1);
        reverse(nums,k,nums.length-1);
    }

    public void rotate3(int[] nums, int k) {

    }




        /**
         * 反转数组
         * @param nums
         * @param begin
         * @param end
         */
    public void reverse(int[] nums,int begin,int end) {
        for (;begin < end; begin++,end--) {
            int tmp = nums[begin];
            nums[begin] = nums[end];
            nums[end] = tmp;
        }
    }




}
