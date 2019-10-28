package com.ziv.builder.c;

import com.ziv.builder.a.ColdDrink;

/**
 * <p>title:Coke </p>
 * <p>package: com.ziv.builder</p>
 * <p>description:可口可乐 </p>
 *
 * @author zhangzong
 * @version 1.0
 * @date 2019/10/28 9:04
 */
public class Coke extends ColdDrink {

    public String name() {
        return "可口可乐！！";
    }

    public Float price() {
        return 14.0F;
    }
}
