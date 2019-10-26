package com.ziv.singleton.c;

/**
 * <p>title:SingletonObject </p>
 * <p>package: com.ziv.singleton</p>
 * <p>description:单例类，加锁懒汉式 </p>
 *
 * @author zhangzong
 * @version 1.0
 * @date 2019/10/26 9:53
 */
public class SingletonObject3 {

    private static SingletonObject3 singletonObject3;

    /**
     * 构造方法私有化
     * @return
     */
    private SingletonObject3() {
    }

    /**
     * 提供公共的访问路径
     * @return
     */
    public static synchronized SingletonObject3 getInstance() {
        if (singletonObject3 == null){
            singletonObject3 = new SingletonObject3();
        }
        return singletonObject3;
    }

    public void getStyle(){
        System.out.println("加锁懒汉式");
    }
}
