package com.ziv.singleton;

import com.ziv.singleton.c.*;
import com.ziv.singleton.e.Singleton;

import java.lang.reflect.Constructor;


/**
 * <p>title: SingleDemoMain</p>
 * <p>package: com.ziv.singleton</p>
 * <p>description: 单例实验main</p>
 *
 * @author zhangzong
 * @version 1.0
 * @date 2019/10/26 10:32
 */
public class SingleDemoMain {

    public static void main(String[] args) throws Exception {

        // 普通饿汉式
        SingletonObject1 s1instance = SingletonObject1.getInstance();
        s1instance.getStyle();
        System.out.println("----------------------------\n\r");

        // 普通懒汉式
        SingletonObject2 s2instance = SingletonObject2.getInstance();
        s2instance.getStyle();
        System.out.println("----------------------------\n\r");

        // 加锁懒汉式
        SingletonObject3 s3instance = SingletonObject3.getInstance();
        s3instance.getStyle();
        System.out.println("----------------------------\n\r");

        // 双重锁
        SingletonObject4 s4instance = SingletonObject4.getInstance();
        s4instance.getStyle();
        System.out.println("----------------------------\n\r");

        // 登记式/内部静态类
        SingletonObject5 s5instance = SingletonObject5.getInstance();
        s5instance.getStyle();
        System.out.println("----------------------------\n\r");

        // 枚举式
        Singleton einstance = Singleton.INSTANCE;
        einstance.getStyle();
        System.out.println("----------------------------\n\r");


        // 针对普通饿汉式可能存在的反射破解  反射之后得到的是
        Class clazz = Class.forName("com.ziv.singleton.c.SingletonObject2");
        Constructor constructor = clazz.getDeclaredConstructor(null);
        constructor.setAccessible(true);
        SingletonObject2 o1 = (SingletonObject2) constructor.newInstance();
        SingletonObject2 o2 = (SingletonObject2) constructor.newInstance();
        // 返回值是false  解决方法，在无参构造里加入判断
        System.out.println(o1 == o2);


    }
}
