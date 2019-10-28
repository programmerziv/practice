package com.ziv.builder.i;

/**
 * <p>title:Item </p>
 * <p>package: com.ziv.builder</p>
 * <p>description: 顶层的订单列表</p>
 *
 * @author zhangzong
 * @version 1.0
 * @date 2019/10/28 8:50
 */
public interface Item {
    /**
     * 名称
     * @return
     */
    String name();
    /**
     * 包装
     * @return
     */
    Packing packing();

    /**
     * 价格
     * @return
     */
    Float price();

}
