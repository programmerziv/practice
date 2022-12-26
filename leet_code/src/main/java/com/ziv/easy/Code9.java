package com.ziv.easy;

/**
 * 回文数判断
 */
public class Code9 {

    public static boolean isPalindrome(int x){
        if(x<0){
            return false;
        }
        int tmp = 0;
        int num = x;
        // 如果不为0  %10 是取最后一位  /=10 的操作是把最后一位给抹掉了 num /= 10 ==> mum = mum/10
        while (num != 0){
            tmp = tmp * 10 + num % 10;
            num /= 10;
        }
        return tmp == x;
    }


    public static void main(String[] args) {
        System.out.println(isPalindrome(123));
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(10));
        System.out.println(isPalindrome(11111111));
        System.out.println(isPalindrome(1234567890));
    }
}
