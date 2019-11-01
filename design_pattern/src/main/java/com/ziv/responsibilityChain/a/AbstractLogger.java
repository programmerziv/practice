package com.ziv.responsibilityChain.a;

/**
 * <p>title: AbstractLogger</p>
 * <p>package: com.ziv.responsibilityChain</p>
 * <p>description: 日志抽象类</p>
 *
 * @author zhangzong
 * @version 1.0
 * @date 2019/11/1 9:00
 */
public abstract class AbstractLogger {

    public static int INFO = 1;

    public static int DEBUG = 2;

    public static int ERROR = 3;

    public int level;

    public AbstractLogger nextLogger;

    public void setNextLogger(AbstractLogger nextLogger){
        this.nextLogger = nextLogger;
    }

    public void logMessage(int level,String message){

        // 如果级别未到  不会打印
        if(this.level <= level){
            write(message);
        }

        // 如果有下一级 会传递到下一级
        if(nextLogger != null){
            nextLogger.logMessage(level,message);
        }

    }

    /**
     * 打印相关内容
     * @param message
     */
    abstract protected void write(String message);
}
