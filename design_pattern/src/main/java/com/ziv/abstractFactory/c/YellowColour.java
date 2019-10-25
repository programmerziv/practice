package com.ziv.abstractFactory.c;

import com.ziv.abstractFactory.i.Colour;

/**
 * <p>title:YellowColour </p>
 * <p>package: com.ziv.abstractFactory</p>
 * <p>description:黄色 </p>
 *
 * @author zhangzong
 * @version 1.0
 * @date 2019/10/25 9:14
 */
public class YellowColour implements Colour {

    public void fill() {
        System.out.println("fill yellow colour !");
    }
}
