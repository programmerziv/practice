package com.ziv.proxy;

import com.ziv.proxy.c.ProxyImage;
import com.ziv.proxy.i.Image;

public class ProxyDemoMain {

    public static void main(String[] args) {
        Image image = new ProxyImage("love.jpg");
        // 第一次并没有加载RealImage，所有realImage为null，会走realImage的构造
        image.display();
        System.out.println("");
        // 第二次已经有realImage对象了，不会加载了
        image.display();
    }

}
