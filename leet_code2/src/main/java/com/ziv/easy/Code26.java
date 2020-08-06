package com.ziv.easy;

/**
 * <p>title:删除数组重复的项并返回数组长度 </p>
 * <p>package: com.ziv.easy</p>
 * <p>description: </p>
 *
 * @author zhangzong
 * @version 1.0
 * @date 2020/8/6 16:15
 */
public class Code26 {

    /**
     * 利用一个指针i
     *
     * @param nums
     * @return
     */
    public static int removeDuplicates(int[] nums){
        int len = nums.length;
        if (len  <= 1) {
            return len;
        }
        int i = 0;
        for (int j = 0; j < len; j++) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

}
