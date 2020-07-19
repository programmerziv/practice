package com.ziv.easy;

/**
 * 移动0操作
 */
public class Code283 {


    public static void moveZeroes(int[] nums) {

        int j = 0;
        for (int i = 0; i < nums.length; i ++ ) {
            if (nums[i] != 0) {
                // 当不为0时，赋值
                nums[j] = nums[i];
                if (i != j ) {
                    // 赋值给当前的i为0   因为i肯定是大于j的
                    // 这样i前的j全部是有值的
                    nums[i] = 0;
                }
                j++;
            }
        }
    }

    public static void moveZeroes2(int[] nums) {
        if (nums == null) {
            return;
        }
        int j = 0;
        // 第一次将非0 的都给j  此时j为
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0){
                // 此句应该分解为nums[j] = nums[i] ; j++
                nums[j++] = nums[i];
            }
        }
        //遍历从j开始的 都为0
        for (int i = j; i < nums.length; i++) {
            nums[i] = 0;
        }

    }


    public static void main(String[] args) {
        int[] nums = {0,2,0,3,0,4};
        //moveZeroes(nums);
        moveZeroes2(nums);
    }


}
