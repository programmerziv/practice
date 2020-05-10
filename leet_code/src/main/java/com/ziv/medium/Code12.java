package com.ziv.medium;

/**
 * 罗马数字转整数
 */
public class Code12 {
    /**
     * 贪心算法 解决数字转罗马字符
     * @param num
     * @return
     */
    public static String int2Roman(int num){
        long begin = System.currentTimeMillis();

        String[] romans = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int[] nums = {1000,900,500,400,100,90,50,40,10,9,5,4,1};

        StringBuilder result = new StringBuilder();
        for(int i = 0; i <  nums.length; i++){
            while (num >= nums[i]){
                result.append(romans[i]);
                num -= nums[i];
            }
            if(num == 0){
                break;
            }
        }

        long end = System.currentTimeMillis();
        System.out.println(end - begin);
        return result.toString();
    }


    public static void main(String[] args) {

        System.out.println(int2Roman(9));



    }

}
