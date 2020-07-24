package com.ziv.medium;

import java.util.*;

/**
 * <p>title: 三数之和</p>
 * <p>package: com.ziv.medium</p>
 * <p>description: </p>
 *
 * @author zhangzong
 * @version 1.0
 * @date 2020/7/24 8:57
 */
public class Code15 {

    /**
     * 暴力破解  三重循环
     * @param nums
     * @return
     */
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> lists = new LinkedHashSet<List<Integer>>(10);
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length -1; j++) {
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
     * 左右夹逼法
     * @param nums
     * @return
     */
    public static List<List<Integer>> threeSum2(int[] nums) {
        List<List<Integer>> lists = new ArrayList<List<Integer>>(10);
        if (nums.length < 3) {
            return lists;
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                return lists;
            }
            if (i > 0 && nums[i] == nums[i -1]) {
                continue;
            }
            int left = i + 1, right = nums.length - 1;
            while (left < right) {
                // 要在循环里  否则不是一直没变化吗
                int x = nums[left] + nums[right] + nums[i];
                if (x < 0) {
                    left ++;
                } else if (x > 0) {
                    right --;
                } else {
                    List<Integer> list = Arrays.asList(nums[i],nums[left],nums[right]);
                    lists.add(list);
                    while (left < right && nums[left + 1] == nums[left]) {
                        left ++;
                    }
                    while (left < right && nums[right - 1] == nums[right]) {
                        right --;
                    }
                    left ++;
                    right --;
                }
            }
        }
        return lists;
    }




    }
