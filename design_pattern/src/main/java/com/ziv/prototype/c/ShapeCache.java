package com.ziv.prototype.c;

import com.ziv.prototype.a.Shape;

import java.util.Hashtable;

/**
 * <p>title: ShapeCache</p>
 * <p>package: com.ziv.prototype</p>
 * <p>description:图形缓存类 </p>
 *
 * @author zhangzong
 * @version 1.0
 * @date 2019/10/29 8:53
 */
public class ShapeCache {

    /**
     * 先拿一个map装我们要克隆的东西，todo 维护一个注册表
     */
    private static Hashtable<String, Shape> shapeMap = new Hashtable<String, Shape>(16);

    /**
     * 通过shape的clone方法得到一个新的shape
     * 此shape为HashTable中的shape克隆出来的
     * todo 提供一个获取实例的方法
     * @param shapeId
     * @return
     */
    public static Shape getShape(String shapeId){
        // todo 提供一个找出正确实例的方法
        Shape cachedShape = shapeMap.get(shapeId);
        // todo 委托复制实例的方法生成新实例
        return (Shape) cachedShape.clone();
    }

    /**
     * 对每种形状都运行数据库查询，并创建该形状
     */
    public static void loadCache(){
        // 讲道理这不是new出来的而是查出来的
        CircleShape circle = new CircleShape();
        circle.setId("1");
        shapeMap.put(circle.getId(),circle);

        SquareShape square = new SquareShape();
        square.setId("2");
        shapeMap.put(square.getId(),square);

        RectangleShape rectangle = new RectangleShape();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(),rectangle);
    }
}
