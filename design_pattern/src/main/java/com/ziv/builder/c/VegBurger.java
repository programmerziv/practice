package com.ziv.builder.c;

import com.ziv.builder.a.Burger;

/**
 * <p>title:VegBurger </p>
 * <p>package: com.ziv.builder</p>
 * <p>description: 蔬菜汉堡</p>
 *
 * @author zhangzong
 * @version 1.0
 * @date 2019/10/28 8:57
 */
public class VegBurger extends Burger {

    public String name() {
        return "蔬菜汉堡！";
    }

    public Float price() {
        return 35.0F;
    }
}
