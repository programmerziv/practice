package com.ziv.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>title:两数之和 </p>
 * <p>package: com.ziv.easy</p>
 * <p>description: </p>
 *
 * @author zhangzong
 * @version 1.0
 * @date 2020/7/24 8:48
 */
public class Code1 {

    /**
     * 一遍hash法
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum(int[] nums, int target) {
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


}
