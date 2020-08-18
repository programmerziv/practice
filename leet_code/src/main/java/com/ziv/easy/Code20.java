package com.ziv.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * 有效括号
 */
public class Code20 {

    public static boolean validBracket(String str){

        Map<Character,Character> map = new HashMap<Character, Character>(16);
        map.put(')','(');
        map.put('}','{');
        map.put(']','[');
        //  如果是空 直接FALSE
        if(str == null || str == ""){
            return false;
        }else{
            // 创建一个栈
            Stack<Character> stack = new Stack<Character>();
            char[] chars = str.toCharArray();
            // 遍历每一个字符
            for(int i = 0 ; i < chars.length; i++){
                //  如果不是右括号 入栈
                if(!map.containsKey(chars[i])){
                    stack.push(chars[i]);
                }else {
                    // 如果是右括号 则栈顶的第一个一定是与其相匹配的那个左括号
                    Character s = stack.empty() ? '#' : stack.pop();
                    // 记得是取map里对应的左括号   比较的都是左括号
                    if(!s.equals(map.get(chars[i]))){
                        return false;
                    }
                }
            }
            if(stack.isEmpty()){
                return true;
            }else {
                return false;
            }
        }

    }


    public static boolean validBracket2(String str){
        Stack<Character> stack = new Stack<Character>();
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(') {
                stack.push(')');
            } else if (chars[i] == '{') {
                stack.push('}');
            } else if (chars[i] == '[') {
                stack.push(']');
            } else if (stack.isEmpty() || stack.pop() != chars[i]) {
                return false;
            }
        }

        return stack.isEmpty();
    }


    public static boolean isValid3(String s) {
        if (  s == null || s.equals("")  ||s.length() % 2 != 0) {
            return false;
        }
        while (s.contains("()") || s.contains("[]") || s.contains("{}")) {
            s = s.replace("()","");
            s = s.replace("[]","");
            s = s.replace("{}","");
        }
        return s.length() == 0;
    }


    public static void main(String[] args) {
        String str1 = "{}{}[()]";
        String str2 = "{}{}[()]{";
        String str3 = "{}{}[()]1";

        System.out.println(isValid3(str1));
        System.out.println(isValid3(str2));
        System.out.println(isValid3(str3));


    }


}
