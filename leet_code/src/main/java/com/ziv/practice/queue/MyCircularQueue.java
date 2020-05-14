package com.ziv.practice.queue;

import java.util.ArrayList;
import java.util.List;

/**
 * 循环队列
 *
 * 两个重要的判断指标 1：什么时候队列为空  什么时候队列是满的
 */
public class MyCircularQueue {

    /** Initialize your data structure here. Set the size of the queue to be k. */

    int[] queueArray;
    int front;
    int tail;
    int length;

    public MyCircularQueue(int k) {
        length = k +1;
        queueArray =  new int[k + 1];
        front = 0;
        tail = 0;
    }

    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
        if(isFull()){
            return false;
        }
        queueArray[tail] = value;
        tail = (tail + 1) % length;
        return true;
    }

    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
        if(isEmpty()){
            return false;
        }
        front = (front + 1) % length;
        return true;
    }

    /** Get the front item from the queue. */
    public int Front() {
        return isEmpty()? -1:queueArray[front];
    }

    /** Get the last item from the queue. */
    public int Rear() {
        return isEmpty()?-1:queueArray[(tail -1 +length) %length];
    }

    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
      return front == tail;
    }

    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
        return (tail + 1)%length == front;
    }


    public static void main(String[] args) {
        MyCircularQueue obj = new MyCircularQueue(5);
        boolean param_1 = obj.enQueue(1);
        boolean param_x = obj.enQueue(2);
        boolean param_y = obj.enQueue(3);
        boolean param_a= obj.enQueue(4);
        boolean param_b = obj.enQueue(5);
        boolean param_c = obj.enQueue(6);

        //boolean param_2 = obj.deQueue();
        int param_3 = obj.Front();
        int param_4 = obj.Rear();
        boolean param_5 = obj.isEmpty();
        boolean param_6 = obj.isFull();
        System.out.println(param_1);
        System.out.println(param_c);
        System.out.println(param_3);
        System.out.println(param_4);
        System.out.println(param_5);
        System.out.println(param_6);
    }


}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */