package com.ziv.easy;

/**
 * <p>title:加 一 </p>
 * <p>package: com.ziv.easy</p>
 * <p>description: </p>
 *
 * @author zhangzong
 * @version 1.0
 * @date 2020/8/14 17:27
 */
public class Code66 {


    public int[] plusOne(int[] digits) {
        if(digits.length == 0) {
            return digits;
        }
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i] ++;
            digits[i] = digits[i] % 10;
            if (digits[i] != 0) {
                return digits;
            }
        }
        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;
        return newDigits;
    }
}