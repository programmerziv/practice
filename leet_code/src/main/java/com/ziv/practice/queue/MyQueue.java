package com.ziv.practice.queue;

import java.util.ArrayList;
import java.util.List;

/**
 * 自制一个队列  本质是个list  然后依靠指针来确定队列的开头
 * 其实list中的值没有变化
 */

public class MyQueue {

    /**
     * 要有盛放元素的容器
     */
    public List<Integer> queueList;
    /**
     * 起始点
     */
    public int startPoint;

    public MyQueue(){
        queueList = new ArrayList<Integer>(10);
        startPoint = 0;
    }

    /**
     * 入队列 list里自然最后一个
     * @param x
     * @return
     */
    public boolean enQueue(int x){
        queueList.add(x);
        return true;
    }

    /**
     * 出队列  只是把头往前移一位
     * @return
     */
    public boolean deQueue(){
        if(isEmpty(queueList)){
            return false;
        }
        startPoint++;
        return true;
    }


    /**
     * 获得头部
     * @return
     */
    public Integer getStartPoint(){

        if(startPoint >= queueList.size()){
            return -1;
        }
        return queueList.get(startPoint);
    }

    public boolean isEmpty(List<Integer> list){
        if(list == null || list.size() < startPoint){
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();

        myQueue.enQueue(5);
        myQueue.enQueue(6);
        myQueue.enQueue(7);
        myQueue.enQueue(8);
        myQueue.deQueue();
        myQueue.deQueue();
        myQueue.deQueue();
        myQueue.deQueue();
        System.out.println(myQueue.getStartPoint());



    }


}
