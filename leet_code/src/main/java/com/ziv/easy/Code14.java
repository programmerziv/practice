package com.ziv.easy;

/**
 * 最长公共前缀
 */
public class Code14 {

    public static String longestCommonPrefix(String[] strs){
        // 如果没有数组  自然返回""
        if(strs.length == 0){
            return "";
        }
        // 取数组第一个
        String str = strs[0];
        // 然后和数组接下来的比较
        for(int i = 1; i < strs.length; i++){
            int j = 0;
            // 一一对比时  挨个比较每个字符的长度
            // 可能两个字符串的长度是不一样的 因此才会有&&
            for(;j < str.length() && j < strs[i].length();j++){
                // 如果比较时候不相等
                if(str.charAt(j) != strs[i].charAt(j) ){
                    break;
                }
            }
            // 截取到不相等时候的长度
            str = str.substring(0,j);
            // 最后如果是空  直接返回  省的报错
            if(str.equals("")){
                return str;
            }
        }
        return str;
    }


    public static void main(String[] args) {


        String[] strs = {"apple","apples","approve","application"};
        String[] strs1 = {"a","b","c","d"};


        System.out.println(longestCommonPrefix(strs));
        System.out.println(longestCommonPrefix(strs1));

    }
}
