package com.ziv.bridge.c;

import com.ziv.bridge.i.DrawAPI;

/**
 * <p>title:RedCircle </p>
 * <p>package: com.ziv.bridge</p>
 * <p>description:红色的圆圈 </p>
 *
 * @author zhangzong
 * @version 1.0
 * @date 2019/10/31 8:39
 */
public class RedCircle implements DrawAPI {

    public void drawCircle(int radius, int x, int y) {

        System.out.println("画个Red圆圈，半径:" + radius + "cm,x:" + x + "cm:y:" + y + "cm");
    }
}
