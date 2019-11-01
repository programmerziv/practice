package com.ziv.bridge.a;

import com.ziv.bridge.i.DrawAPI;

/**
 * <p>title: </p>
 * <p>package: com.ziv.bridge</p>
 * <p>description: </p>
 *
 * @author zhangzong
 * @version 1.0
 * @date 2019/10/31 8:43
 */
public abstract class Shape {

    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }

    /**
     * 画画
     */
    public abstract void draw();
}
