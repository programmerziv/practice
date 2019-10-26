package com.ziv.strategy.c;

import com.ziv.strategy.i.Strategy;

/**
 * <p>title: Context</p>
 * <p>package: com.ziv.strategy</p>
 * <p>description:策略上下文 </p>
 *
 * @author zhangzong
 * @version 1.0
 * @date 2019/10/23 8:55
 */
public class Context {

    private Strategy strategy;

    public Context() {
    }

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }


    public int executeStrate(int m,int n){
        return strategy.doOperation(m,n);
    }


    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

}
