package com.ziv.singleton.c;

/**
 * <p>title:SingletonObject </p>
 * <p>package: com.ziv.singleton</p>
 * <p>description:单例类，双重锁 double-checked locking DCL </p>
 *
 * @author zhangzong
 * @version 1.0
 * @date 2019/10/26 9:53
 */
public class SingletonObject4 {

    private static SingletonObject4 singletonObject4;

    /**
     * 构造方法私有化
     * @return
     */
    private SingletonObject4() {
    }

    /**
     * 提供公共的访问路径
     * @return
     */
    public static  SingletonObject4 getInstance() {
        // 判断对象有值
        if (singletonObject4 == null){
            synchronized (SingletonObject4.class){
                // 多线程情况下 判断对象有没值
                if (singletonObject4 == null){

                    singletonObject4 = new SingletonObject4();
                }
            }
        }
        return singletonObject4;
    }

    public void getStyle(){
        System.out.println("双重锁");
    }
}
