package com.ziv.abstractFactory.a;

import com.ziv.abstractFactory.i.Colour;
import com.ziv.abstractFactory.i.Shape;

/**
 * <p>title:AbstractFactory </p>
 * <p>package: com.ziv.abstractFactory</p>
 * <p>description: 抽象工厂，用来获取工厂</p>
 *
 * @author zhangzong
 * @version 1.0
 * @date 2019/10/25 9:16
 */
public abstract class AbstractFactory {

    public abstract Colour getColour(String colour);

    public abstract Shape getShape(String shape);

}
