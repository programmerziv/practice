package com.ziv.builder.c;

import com.ziv.builder.i.Packing;

/**
 * <p>title:Wrapper </p>
 * <p>package: com.ziv.builder</p>
 * <p>description: 具体的包装类型-纸装</p>
 *
 * @author zhangzong
 * @version 1.0
 * @date 2019/10/28 8:53
 */
public class Wrapper implements Packing {

    public String pack() {
        return "用纸包装";
    }
}
