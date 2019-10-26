package com.ziv.singleton.c;

/**
 * <p>title:SingletonObject </p>
 * <p>package: com.ziv.singleton</p>
 * <p>description:单例类，普通懒汉式 </p>
 *
 * @author zhangzong
 * @version 1.0
 * @date 2019/10/26 9:53
 */
public class SingletonObject2 {


    private static SingletonObject2 singletonObject2;

    /**
     * 提供公共的访问路径
     * @return
     */
    public static SingletonObject2 getInstance() {
        if (singletonObject2 == null){
            singletonObject2 = new SingletonObject2();
        }
        return singletonObject2;
    }

    /**
     * 构造方法私有化
     * @return
     */
    private SingletonObject2() {
        // 防止反射
        if (singletonObject2 != null){
            throw new RuntimeException();
        }
    }


    public void getStyle(){
        System.out.println("普通懒汉式");
    }
}
