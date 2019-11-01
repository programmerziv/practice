package com.ziv.bridge.c;

import com.ziv.bridge.i.DrawAPI;

/**
 * <p>title:GreenCircle </p>
 * <p>package: com.ziv.bridge</p>
 * <p>description:绿色圆圈 </p>
 *
 * @author zhangzong
 * @version 1.0
 * @date 2019/10/31 8:41
 */
public class GreenCircle implements DrawAPI {

    public void drawCircle(int radius, int x, int y) {

        System.out.println("画个Green圆圈，半径:" + radius + "cm,x:"+ x + "cm:y:" + y + "cm");
    }
}
