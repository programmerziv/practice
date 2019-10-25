package com.ziv.abstractFactory.c;

import com.ziv.abstractFactory.a.AbstractFactory;
import com.ziv.abstractFactory.i.Colour;
import com.ziv.abstractFactory.i.Shape;

/**
 * <p>title: ColourFactory</p>
 * <p>package: com.ziv.abstractFactory</p>
 * <p>description: 颜色类工厂，只实现颜色类</p>
 *
 * @author zhangzong
 * @version 1.0
 * @date 2019/10/25 9:21
 */
public class ColourFactory extends AbstractFactory {

    @Override
    public Colour getColour(String colour) {

        if(colour.equals("yellow")){
            return new YellowColour();
        }else if (colour.equals("blue")){
            return new BlueColour();
        }else if (colour.equals("red")){
            return new RedCollour();
        }
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
