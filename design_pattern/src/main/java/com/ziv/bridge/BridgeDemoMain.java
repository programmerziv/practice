package com.ziv.bridge;

import com.ziv.bridge.a.Shape;
import com.ziv.bridge.c.CircleShape;
import com.ziv.bridge.c.GreenCircle;
import com.ziv.bridge.c.RedCircle;

/**
 * <p>title:BridgeDemoMain </p>
 * <p>package: com.ziv.bridge</p>
 * <p>description: 桥接模式实现demo </p>
 *
 * @author zhangzong
 * @version 1.0
 * @date 2019/10/31 8:51
 */
public class BridgeDemoMain {

    public static void main(String[] args) {

        Shape redCircle = new CircleShape(10,100,100,new RedCircle());

        Shape greenCircle = new CircleShape(10,100,100,new GreenCircle());


        // shape的draw方法和redCircle的drawCircle(radius,x,y)有着区别
        redCircle.draw();

        greenCircle.draw();

    }
}
