package com.ziv.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>title:两数字之和 </p>
 * <p>package: com.ziv.easy</p>
 * <p>description: </p>
 *
 * @author zhangzong
 * @version 1.0
 * @date 2020/7/23 18:58
 */
public class Code1 {

    /**
     * 暴力破解
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (target == nums[i] + nums[j]) {
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }

    /**
     * 两遍hash法
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum2(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<Integer, Integer>(16);
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],i);
        }
        for (int i = 0; i < nums.length; i++) {
            int x = target - nums[i];
            if (map.containsKey(x) && map.get(x) != i) {
                return new int[]{i,map.get(x)};
            }
        }
        return null;
    }

    /**
     * 一遍hash法
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum3(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<Integer, Integer>(16);
        for (int i = 0; i < nums.length; i++) {
            int x = target - nums[i];
            if (map.containsKey(x)) {
                return new int[]{map.get(x),i};
            }
            map.put(nums[i],i);
        }
        return null;
    }


    /**
     * 排序，双向指针 (排序导致顺讯变了)
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum4(int[] nums, int target) {
        // 先排序
        Arrays.sort(nums);
        for (int i = 0,j = nums.length - 1; i < j;) {
            if (nums[i] + nums[j] > target) {
                j--;
            } else if (nums[i] + nums[j] < target) {
                i++;
            } else {
                return new int[]{i,j};
            }
        }
       return null;
    }

    /**
     * 看不懂方法
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum5(int[] nums, int target) {
        int v = 2 << 10;
        int bit = v - 1;
        int[] ints = new int[v];
        for (int i = 0; i < nums.length; i++) {
            int index = (target - nums[i]) & bit;
            if (ints[index] != 0) {
                return new int[]{ints[index] - 1, i};
            }
            ints[nums[i] & bit] = i + 1;
        }
        throw new IllegalArgumentException("no such num sum equals target");
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2,2,3,4,5};
        twoSum5(nums,8);
    }


}
