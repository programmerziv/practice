package com.ziv.frontController;

public class FrontController {
    private Dispatcher dispatcher;

    public FrontController(){
        // 同时也new了homeview和studentview
        dispatcher = new Dispatcher();
    }

    // 鉴权  其实可以拿到request进行一些鉴权操作
    private boolean isAuthenticUser(){
        System.out.println("User is authenticated successfully.");
        return true;
    }

    private void trackRequest(String request){
        System.out.println("Page requested: " +request);
    }
    // 精华部分 记录每个请求  然后权限符合再调度
    public void dispatcherRequest(String request){
        trackRequest(request);
        if(isAuthenticUser()){
            dispatcher.dispatch(request);
        }
    }
}
