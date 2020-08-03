package com.ziv.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>title: </p>
 * <p>package: com.ziv.easy</p>
 * <p>description: </p>
 *
 * @author zhangzong
 * @version 1.0
 * @date 2020/8/3 9:47
 */
public class Code1 {

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