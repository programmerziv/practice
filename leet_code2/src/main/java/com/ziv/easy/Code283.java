package com.ziv.easy;

/**
 * <p>title:移动0操作 </p>
 * <p>package: com.ziv.easy</p>
 * <p>description: </p>
 *
 * @author zhangzong
 * @version 1.0
 * @date 2020/7/22 18:11
 */
public class Code283 {

    /**
     * 先移动，然后再之后补零
     * @param nums
     */
    public static void moveZeroes(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++ ) {
            if (nums[i] != 0) {
               nums[j++] = nums[i];
            }
        }
        // 补零
        for (int i = j + 1; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    /**
     * 一边替换一边补零
     * @param nums
     */
    public static void moveZeroes1(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++ ) {
            if (nums[i] != 0) {
               nums[j] = nums[i];
               if (i != j) {
                 nums[i] = 0;
               }
               j++;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,0,2,0,3};
        int[] nums1 = {0,0,1,0,2,0,3};
        //moveZeroes(nums);
        //moveZeroes(nums1);
        moveZeroes1(nums);
        moveZeroes1(nums1);
        System.out.println("问题解决");
    }
}
