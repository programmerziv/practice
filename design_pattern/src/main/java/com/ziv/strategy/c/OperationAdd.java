package com.ziv.strategy.c;

import com.ziv.strategy.i.Strategy;

/**
 * <p>title:OperationAdd </p>
 * <p>package: com.ziv.strategy</p>
 * <p>description:加法策略 </p>
 *
 * @author zhangzong
 * @version 1.0
 * @date 2019/10/23 8:52
 */
public class OperationAdd implements Strategy {

    public int doOperation(int m, int n) {
        return m + n;
    }
}
