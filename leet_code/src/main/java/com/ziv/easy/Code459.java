package com.ziv.easy;

/**
 * <p>title: 重复的子字符串</p>
 * <p>package: com.ziv.easy</p>
 * <p>description: </p>
 *
 * @author zhangzong
 * @version 1.0
 * @date 2020/8/24 11:32
 */
public class Code459 {

    /**
     * 将原字符串扩大两倍  然后去掉首尾  如果新字符串还包含原字符串 则证明原字符串有重复
     * @param s
     * @return
     */
    public boolean repeatedSubstringPattern(String s) {
        String str = s + s;
        return str.substring(1,str.length() - 1).contains(s);
    }
}
