package com.ziv.builder.c;

import com.ziv.builder.a.Burger;

/**
 * <p>title: ChickenBurger</p>
 * <p>package: com.ziv.builder</p>
 * <p>description:鸡肉汉堡 </p>
 *
 * @author zhangzong
 * @version 1.0
 * @date 2019/10/28 8:58
 */
public class ChickenBurger extends Burger {

    public String name() {
        return "鸡肉汉堡!";
    }

    public Float price() {
        return 40.0F;
    }
}
