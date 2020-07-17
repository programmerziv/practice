package com.ziv.easy;

/**
 * <p>title: Code125</p>
 * <p>package: com.ziv.easy</p>
 * <p>description: 判断字符串回文数 </p>
 *
 * @author zhangzong
 * @version 1.0
 * @date 2020/7/16 19:18
 */
public class Code125 {

    public boolean isPalindrome(String s) {
        // 去除非 数字字母大小写
        StringBuilder str = filterCharacter(s);
        // 利用双向指针移动判斷
        return  judgeStr(str);
    }

    public boolean isPalindrome2(String s) {
        StringBuilder sb = new StringBuilder(s);
        int left = 0;
        int right = sb.length() - 1;
        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(sb.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(sb.charAt(right))) {
                right++;
            }
            if (Character.toLowerCase(sb.charAt(left)) != Character.toLowerCase(sb.charAt(right))) {
                return false;
            }
            left++;
            right++;
        }

        return true;
    }


    /**
     * 双向指针判断
     * @param sb
     * @return
     */
    private boolean judgeStr(StringBuilder sb) {

        int i = sb.length();
        int left = 0, right = i -1;
        while (left < right) {
            if (sb.charAt(left) != sb.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    /**
     * 去除非 数字与字母
     * @param s
     * @return
     */
    private StringBuilder filterCharacter(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                sb.append(Character.toLowerCase(c));
            }
        }

        return sb;
    }

}
