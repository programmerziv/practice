package com.ziv.easy;

import java.util.Stack;

/**
 * <p>title:最小栈 </p>
 * <p>package: com.ziv.easy</p>
 * <p>description: </p>
 *
 *
 * @author zhangzong
 * @version 1.0
 * @date 2020/8/18 14:35
 */
public class Code155 {


}

class MinStack {

    private Stack<Integer> data;

    private Stack<Integer> helper;

    /** initialize your data structure here. */
    public MinStack() {
        this.data = new Stack<Integer>();
        this.helper = new Stack<Integer>();
    }

    public void push(int x) {
        data.add(x);
        if (helper.isEmpty() || helper.peek() >= x) {
            helper.add(x);
        } else {
            helper.add(helper.peek());
        }
    }

    public void pop() {
        if (!data.isEmpty()) {
            data.pop();
            helper.pop();
        }
    }

    public int top() {
        if (!data.empty()) {
            return data.peek();
        } else {
            throw new RuntimeException("栈中没有元素");
        }
    }

    public int getMin() {
        if (!helper.isEmpty()) {
            return helper.peek();
        } else {
            throw new RuntimeException("栈中没有元素");
        }
    }
}

class MinStack2 {

    private Stack<Integer> data;

    private Stack<Integer> helper;

    /** initialize your data structure here. */
    public MinStack2() {
        this.data = new Stack<Integer>();
        this.helper = new Stack<Integer>();
    }

    public void push(int x) {
        data.add(x);
        if (helper.isEmpty() || helper.peek() >= x) {
            helper.add(x);
        }
    }

    public void pop() {
        if (!data.isEmpty()) {
            int pop = data.pop();
            if (!helper.isEmpty() && pop == helper.peek()) {
             helper.pop();
            }
        }
    }

    public int top() {
        if (!data.empty()) {
            return data.peek();
        } else {
            throw new RuntimeException("栈中没有元素");
        }
    }

    public int getMin() {
        if (!helper.isEmpty()) {
            return helper.peek();
        } else {
            throw new RuntimeException("栈中没有元素");
        }
    }
}


class MinStack3 {

    private Stack<Integer> data;

    private Integer min;

    /** initialize your data structure here. */
    public MinStack3() {
        this.data = new Stack<Integer>();
        this.min  = Integer.MAX_VALUE;
    }

    public void push(int x) {
       if (min >= x) {
           min = x;
       }
       data.add(x);
    }

    public void pop() {
        int pop = data.pop();
        if (pop == min) {
            min = data.peek();
        }
    }

    public int top() {
        return data.pop();
    }

    public int getMin() {
        return min;
    }
}