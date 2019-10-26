package com.ziv.singleton.c;

/**
 * <p>title:SingletonObject </p>
 * <p>package: com.ziv.singleton</p>
 * <p>description:单例类，普通饿汉式 </p>
 *
 * @author zhangzong
 * @version 1.0
 * @date 2019/10/26 9:53
 */
public class SingletonObject1 {


    private static SingletonObject1 singletonObject1 = new SingletonObject1();

    /**
     * 提供公共的访问路径
     * @return
     */
    public static  SingletonObject1 getInstance() {
        return singletonObject1;
    }

    /**
     * 构造方法私有化
     * @return
     */
    private SingletonObject1() {
    }

    public void getStyle(){
        System.out.println("普通饿汉式");
    }
}
