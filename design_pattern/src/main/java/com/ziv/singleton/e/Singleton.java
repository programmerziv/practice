package com.ziv.singleton.e;

/**
 * <p>title: Singleton</p>
 * <p>package: com.ziv.singleton</p>
 * <p>description:枚举式,防反序列化 </p>
 *
 * @author zhangzong
 * @version 1.0
 * @date 2019/10/26 10:28
 */
public enum Singleton {
    //对应类
    INSTANCE;

    public void getStyle(){
        System.out.println("枚举式");
    }
}
