package com.ziv.strategy.c;

import com.ziv.strategy.i.Strategy;

/**
 * <p>title:乘法侧率 </p>
 * <p>package: com.ziv.strategy</p>
 * <p>description: </p>
 *
 * @author zhangzong
 * @version 1.0
 * @date 2019/10/23 8:53
 */
public class OperationMultiply implements Strategy {

    public int doOperation(int m, int n) {
        return m * n;
    }
}
