package com.ziv.strategy;

/**
 * <p>title:OperationSubstract </p>
 * <p>package: com.ziv.strategy</p>
 * <p>description:减法策略 </p>
 *
 * @author zhangzong
 * @version 1.0
 * @date 2019/10/23 8:53
 */
public class OperationSubstract implements Strategy {

    public int doOperation(int m, int n) {
        return m - n;
    }
}
