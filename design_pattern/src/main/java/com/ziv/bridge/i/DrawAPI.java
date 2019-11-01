package com.ziv.bridge.i;

/**
 * <p>title:DrawAPI </p>
 * <p>package: com.ziv.bridge</p>
 * <p>description:桥接实现接口 </p>
 *
 * @author zhangzong
 * @version 1.0
 * @date 2019/10/31 8:37
 */
public interface DrawAPI {
    /**
     * 画个圆圈
     * @param radius
     * @param x
     * @param y
     */
    void drawCircle(int radius, int x, int y);
}
