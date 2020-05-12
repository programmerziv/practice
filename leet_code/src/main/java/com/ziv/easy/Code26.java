package com.ziv.easy;

/**
 * 删除数组中重复的项  （原地删除）
 */
public class Code26 {

    /**
     * 前提条件  nums是已经排序的整数数组  只是有重复而已
     *
     * 时间复杂度 O（n） 空间复杂度O(1)
     * @param nums
     * @return
     */
    public static int removeDuplicates(int[] nums){
        int len = nums.length;
        if(len <= 2){
            return len;
        }
        // 定义一个指针 i   指向去重后的数组对应的索引
        int i = 0;
        // 然后从数组第二个元素开始遍历 判断是否和i指向元素重复
        for( int j = 1; j < len; j++){
            // 如果重复则继续遍历 否则 去重
            if(nums[j] != nums[i]){
                // 关键步骤  将遍历到的不重复元素对应到去重位置 （ 相当于是nums[j]的值给nums[i]，并且i自增1 ）
                nums[++i] = nums[j];
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {

        int[] nums = {1,1,2,2,3,3,4,5};

        int i = removeDuplicates(nums);

        System.out.println(i);

        for(int x = 0; x < i; x++){
            System.out.println(nums[x] + "`````````````");
        }


    }



}
