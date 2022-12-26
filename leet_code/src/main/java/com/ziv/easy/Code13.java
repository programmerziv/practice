package com.ziv.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * 罗马数字转整数
 */
public class Code13 {

    public static int romanToInt(String s) {

        long beginTime = System.currentTimeMillis();
        /**
         * 先映射
         */
        Map map = new HashMap<Character,Integer>(16);
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int result = 0;
        char cur, last = 0;

        // 倒序 从后往前一直加 如果是正常的就加 如果是不正常的就减  就三条规则
        for(int i = s.length() -1;i >= 0; i--){
            cur = s.charAt(i);
            // IV IX 或者 XL XC 或者 CD CM 都是特殊的
            if(((last == 'V' || last == 'X') && cur == 'I')
                    || ((last == 'L' || last == 'C' && cur == 'X'))
                    || ((last == 'D' || last == 'M' && cur == 'C'))){
                result -= Integer.parseInt(map.get(cur).toString());
            }else {
                result += Integer.parseInt(map.get(cur).toString());
            }
            last = cur;
        }
        long lastTime = System.currentTimeMillis();
        System.out.println("用时："+ (lastTime - beginTime) );
        return result;
    }


    public static void main(String[] args) {
        System.out.println(romanToInt("IX"));
    }

}
