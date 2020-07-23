package com.ziv.medium;

import java.util.*;

/**
 * <p>title: 三数之和</p>
 * <p>package: com.ziv.medium</p>
 * <p>description: </p>
 *
 * @author zhangzong
 * @version 1.0
 * @date 2020/7/23 20:16
 */
public class Code15 {


    /**
     * 暴力破解  (不太理解为什么排序结束之后就不会出现重复问题)
     * @param nums
     * @return
     */
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> lists = new LinkedHashSet<List<Integer>>(10);
        for( int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> list = Arrays.asList(nums[i],nums[j],nums[k]);
                        lists.add(list);
                    }
                }
            }
        }
        return new ArrayList<List<Integer>>(lists);
    }

    /**
     * 先排序  再固定一个值 左右夹逼
     * @param nums
     * @return
     */
    public static List<List<Integer>> threeSum2(int[] nums) {
        // 先判断情况  再排序  再固定一个值 左右夹逼
        List<List<Integer>> lists = new ArrayList<List<Integer>>(10);
        if (nums.length < 3) {
            return null;
        }
        Arrays.sort(nums);
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if (nums[i] > 0) {
                return lists;
            }
            if (i > 0 && nums[i] == nums[i -1]){
                continue;
            }
            int curr = nums[i];
            int left = i + 1, right = len - 1;
            while (left < right) {
                int tmp = curr + nums[left] + nums[right];
                if( tmp > 0) {
                    right--;
                } else if (tmp < 0) {
                    left++;
                }else {
                    List<Integer> list = Arrays.asList(curr,nums[left],nums[right]);
                    lists.add(list);
                    while (left < right && nums[left + 1] == nums[left]) {
                        left++;
                    }
                    while (left < right && nums[right - 1] == nums[right]) {
                        right--;
                    }
                    left++;
                    right--;
                 }
            }
        }
        return lists;
    }


    public static void main(String[] args) {

        int[] nums = new int[]{1,2,-2,-1};
        threeSum2(nums);
    }
}
