package com.ziv.singleton.c;

/**
 * <p>title:SingletonObject </p>
 * <p>package: com.ziv.singleton</p>
 * <p>description:单例类，登记式/内部静态类 </p>
 *
 * @author zhangzong
 * @version 1.0
 * @date 2019/10/26 9:53
 */
public class SingletonObject5 {

    /**
     * 静态内部类 开始时不会加载，只有调用getInstance才加载，因为是静态的，因此只会被加载一次
     * lazy safe
     */
    private static class SingleHolder{

        private static final SingletonObject5 INSTANCE = new SingletonObject5();
    }

    /**
     * 提供公共的访问路径
     * @return
     */
    public static SingletonObject5 getInstance() {
        return SingleHolder.INSTANCE;
    }

    /**
     * 构造方法私有化
     * @return
     */
    private SingletonObject5() {
    }

    public void getStyle(){
        System.out.println("登记式/内部静态类");
    }
}
