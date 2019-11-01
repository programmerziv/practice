package com.ziv.responsibilityChain.c;

import com.ziv.responsibilityChain.a.AbstractLogger;

/**
 * <p>title:ErrorLogger </p>
 * <p>package: com.ziv.responsibilityChain</p>
 * <p>description:错误日志 </p>
 *
 * @author zhangzong
 * @version 1.0
 * @date 2019/11/1 9:12
 */
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("This is ErrorLog");
    }
}
