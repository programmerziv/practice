package com.ziv.builder.a;

import com.ziv.builder.i.Item;
import com.ziv.builder.i.Packing;
import com.ziv.builder.c.Wrapper;

/**
 * <p>title:Burger </p>
 * <p>package: com.ziv.builder</p>
 * <p>description:抽象的汉堡 </p>
 *
 * @author zhangzong
 * @version 1.0
 * @date 2019/10/28 8:56
 */
public abstract class Burger implements Item {

    /**
     * 只实现用纸包装
     * @return
     */
    public Packing packing() {
        return new Wrapper();
    }

}
