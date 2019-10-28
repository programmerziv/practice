package com.ziv.builder.a;

import com.ziv.builder.c.Bottle;
import com.ziv.builder.i.Item;
import com.ziv.builder.i.Packing;

/**
 * <p>title:ColdDrink </p>
 * <p>package: com.ziv.builder</p>
 * <p>description:冷饮 </p>
 *
 * @author zhangzong
 * @version 1.0
 * @date 2019/10/28 9:00
 */
public  abstract class ColdDrink implements Item {

    /**
     * 只实现了瓶子包装
     * @return
     */
    public Packing packing() {
        return new Bottle();
    }


}
