package com.ziv.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * <p>title:有效的括号 </p>
 * <p>package: com.ziv.easy</p>
 * <p>description: </p>
 *
 * @author zhangzong
 * @version 1.0
 * @date 2020/8/17 11:44
 */
public class Code20 {


    /**
     * 先将括号放入map  然后用栈的思想  如果碰到右括号  若符合规则 则栈顶必然是与其对应的左括号
     * @param s
     * @return
     */
    public boolean isValid(String s) {
        if (s == null || s == "") {
            return false;
        }
        Map<Character,Character> map = new HashMap<Character, Character>(16);
        map.put('}','{');
        map.put(']','[');
        map.put(')','(');

        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < chars.length; i++) {
            if (!map.containsKey(chars[i])) {
                stack.push(chars[i]);
            } else {

                Character str = stack.empty() ? '#' : stack.pop();
                if (!str.equals(map.get(chars[i]))) {
                    return false;
                }
            }
        }
        if (stack.isEmpty()) {
            return true;
        }
        return false;
    }

    /**
     * 利用栈，将与左括号对用的存入栈，然后根据后入先出规则再比对 最后如果栈为空自然是对的
     * @param s
     * @return
     */
    public boolean isValid2(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }
        Stack<Character> stack = new Stack<Character>();
        for (char c :s.toCharArray()) {
            if (c == '(') {
                stack.push(')');
            } else if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            }else if (stack.isEmpty() || stack.pop() != c) {
                return false;
            }
        }
        return stack.isEmpty();
    }

    public boolean isValid3(String s) {
        if (  s == null || s.equals("")  ||s.length() % 2 != 0) {
            return false;
        }
        while (s.contains("()") || s.contains("[]") || s.contains("{}")) {
            s.replace("()","");
            s.replace("[]","");
            s.replace("{}","");
        }
        return s.length() == 0;
    }

}
