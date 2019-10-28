package com.ziv.builder.c;

import com.ziv.builder.a.ColdDrink;

/**
 * <p>title:Pepsi </p>
 * <p>package: com.ziv.builder</p>
 * <p>description:百世可乐 </p>
 *
 * @author zhangzong
 * @version 1.0
 * @date 2019/10/28 9:03
 */
public class Pepsi extends ColdDrink {

    public String name() {
        return "百世可乐！！";
    }

    public Float price() {
        return 15.0F;
    }
}
