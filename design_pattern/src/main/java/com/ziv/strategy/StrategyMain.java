package com.ziv.strategy;

/**
 * <p>title:StrategyMain </p>
 * <p>package: com.ziv.strategy</p>
 * <p>description:执行用的main </p>
 *
 * @author zhangzong
 * @version 1.0
 * @date 2019/10/23 8:58
 */
public class StrategyMain {
    public static void main(String[] args) {

        int m = 100;
        int n = 50;

        Context context1 = new Context(new OperationAdd());
        System.out.println("加法策略的结果是:"+context1.executeStrate(m,n));

        Context context2 = new Context(new OperationSubstract());
        System.out.println("减法策略的结果是:"+context2.executeStrate(m,n));

        Context context3 = new Context(new OperationMultiply());
        System.out.println("乘法策略的结果是:"+context3.executeStrate(m,n));

    }
}
