package com.ziv.abstractFactory.c;

import com.ziv.abstractFactory.i.Colour;

/**
 * <p>title: BlueColour</p>
 * <p>package: com.ziv.abstractFactory</p>
 * <p>description: 蓝色</p>
 *
 * @author zhangzong
 * @version 1.0
 * @date 2019/10/25 9:13
 */
public class BlueColour implements Colour {

    public void fill() {
        System.out.println("fill blue colour !");
    }
}
