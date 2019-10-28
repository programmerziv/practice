package com.ziv.builder.c;

import com.ziv.builder.i.Packing;

/**
 * <p>title: Bottle</p>
 * <p>package: com.ziv.builder</p>
 * <p>description: 具体的包装类型</p>
 *
 * @author zhangzong
 * @version 1.0
 * @date 2019/10/28 8:54
 */
public class Bottle implements Packing {

    public String pack() {
        return "用瓶子装";
    }
}
