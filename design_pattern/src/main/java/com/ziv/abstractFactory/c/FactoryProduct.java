package com.ziv.abstractFactory.c;

import com.ziv.abstractFactory.a.AbstractFactory;

/**
 * <p>title:FactoryProduct </p>
 * <p>package: com.ziv.abstractFactory</p>
 * <p>description: 工厂的实现类</p>
 *
 * @author zhangzong
 * @version 1.0
 * @date 2019/10/25 9:27
 */
public class FactoryProduct {
    public static AbstractFactory getFactory(String factory){
        if("colour".equals(factory)){
            return new ColourFactory();
        }else if("shape".equals(factory)){
            return new ShapeFactory();
        }
        return null;
    }

}
