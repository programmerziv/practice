package com.ziv.easy;

/**
 * 整数翻转
 */
public class Code7 {



    public static int reverse(int x){
        int res = 0;
        while (x != 0){
            // 每次取末尾数字
            int tem = x%10;
            // 判断返回值 是否大于 最大32位整数
            if(res > 214748364  || (res == 214748364 && tem > 7)){
                return 0;
            }
            // 判断返回值 是否小于 最小32位整数负数
            if(res < -214748364 || (res == -214748364 && tem <-8)){
                return 0;
            }
            res = res * 10 + tem;
            // x取小十倍数据  因为返回的是int 所以不会有小数
            x /= 10;
        }
        return res;
    }


    public static void main(String[] args) {

       /* System.out.println(reverse(100));
        System.out.println(reverse(-100));
        System.out.println(reverse(-10086));*/
        System.out.println(reverse(2147483647));

    }

}
