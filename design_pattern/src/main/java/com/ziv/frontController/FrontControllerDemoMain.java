package com.ziv.frontController;

public class FrontControllerDemoMain {

    public static void main(String[] args) {
        FrontController frontController = new FrontController();

        frontController.dispatcherRequest("HOME");

        frontController.dispatcherRequest("STUDENT");
    }

}
