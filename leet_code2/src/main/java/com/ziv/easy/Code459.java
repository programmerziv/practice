package com.ziv.easy;

/**
 * <p>title:重复的子字符串 </p>
 * <p>package: com.ziv.easy</p>
 * <p>description: </p>
 *
 * @author zhangzong
 * @version 1.0
 * @date 2020/8/24 19:25
 */
public class Code459 {


    public boolean repeatedSubstringPattern(String s) {
        return (s + s).substring(1,2 * s.length() - 1).contains(s);
    }
}
