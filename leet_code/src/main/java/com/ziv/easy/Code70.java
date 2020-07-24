package com.ziv.easy;

/**
 * <p>title: 爬楼梯</p>
 * <p>package: com.ziv.easy</p>
 * <p>description: </p>
 *
 * @author zhangzong
 * @version 1.0
 * @date 2020/7/24 9:41
 */
public class Code70 {


    /**
     * 斐波那锲数列  动态规划
     * @param n
     * @return
     */
    public static int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }


    public static void main(String[] args) {
       int x =  climbStairs(5);
        System.out.println(x);
    }
}
