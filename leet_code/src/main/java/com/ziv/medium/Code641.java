package com.ziv.medium;

/**
 * <p>title: 设计双端队列</p>
 * <p>package: com.ziv.medium</p>
 * <p>description: </p>
 *
 * @author zhangzong
 * @version 1.0
 * @date 2020/8/26 18:05
 */
public class Code641 {





    public static void main(String[] args) {
        MyCircularDeque deque = new MyCircularDeque(3);
        boolean b;
        int x;
        b = deque.insertLast(1);
        b = deque.insertLast(2);
        b = deque.insertFront(3);
        b = deque.insertFront(4);
        x = deque.getRear();
        b = deque.isFull();
        b = deque.deleteLast();
        b = deque.insertFront(4);
        x = deque.getFront();
        System.out.println("over");
    }


}
class MyCircularDeque {

    public int[] element;

    public int size;

    /** Initialize your data structure here. Set the size of the deque to be k. */
    public MyCircularDeque(int k) {
        element = new int[k];
    }

    /** Adds an item at the front of Deque. Return true if the operation is successful. */
    public boolean insertFront(int value) {
        if (isFull()) {
            return false;
        }
        for (int i = size - 1; i >= 0; i--) {
            element[i + 1] = element[i];
        }
        element[0] = value;
        size ++;
        return true;
    }

    /** Adds an item at the rear of Deque. Return true if the operation is successful. */
    public boolean insertLast(int value) {
        if (isFull()) {
            return false;
        }
        element[size] = value;
        size ++;
        return true;
    }

    /** Deletes an item from the front of Deque. Return true if the operation is successful. */
    public boolean deleteFront() {
        if (isEmpty()) {
            return false;
        }
        element[0] = 0;
        for (int i = 0; i < size - 1; i++) {
            element[i] = element[i + 1];
        }
        size --;
        return true;
    }

    /** Deletes an item from the rear of Deque. Return true if the operation is successful. */
    public boolean deleteLast() {
        if (isEmpty()) {
            return false;
        }
        element[size - 1] = 0;
        size --;
        return true;
    }

    /** Get the front item from the deque. */
    public int getFront() {
        return element[0] == 0? -1:element[0];
    }

    /** Get the last item from the deque. */
    public int getRear() {
        return size == 0? -1:element[size - 1];
    }

    /** Checks whether the circular deque is empty or not. */
    public boolean isEmpty() {
        return size == 0;
    }

    /** Checks whether the circular deque is full or not. */
    public boolean isFull() {
        return size == element.length;
    }

}