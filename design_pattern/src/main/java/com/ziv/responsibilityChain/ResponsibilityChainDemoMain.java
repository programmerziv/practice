package com.ziv.responsibilityChain;

import com.ziv.responsibilityChain.a.AbstractLogger;
import com.ziv.responsibilityChain.c.ConsoleLogger;
import com.ziv.responsibilityChain.c.ErrorLogger;
import com.ziv.responsibilityChain.c.FileLogger;

/**
 * <p>title: ResponsibilityChainDemoMain</p>
 * <p>package: com.ziv.responsibilityChain</p>
 * <p>description:责任链模式main </p>
 *
 * @author zhangzong
 * @version 1.0
 * @date 2019/11/1 9:50
 */
public class ResponsibilityChainDemoMain {
    /**
     * 返回任务链
     * @return
     */
    public static AbstractLogger getChainOfLoggers(){
        // 各个日志对应的级别
        AbstractLogger error = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger file = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger console = new ConsoleLogger(AbstractLogger.INFO);
        // 先是error 再是file 最后是console
        error.setNextLogger(file);
        file.setNextLogger(console);

        return error;
    }

    public static void main(String[] args) {

        AbstractLogger loggerChain = getChainOfLoggers();
        // 这个只会记录在console
        loggerChain.logMessage(AbstractLogger.INFO,"this is an information");

        System.out.println("------------------");
        // 这个会记录在console和file里
        loggerChain.logMessage(AbstractLogger.DEBUG,"this is a debug");

        System.out.println("------------------");
        // 这个会记录在console，file和error里
        loggerChain.logMessage(AbstractLogger.ERROR,"this is a error");


    }



}
