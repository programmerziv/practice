package com.ziv.proxy.c;

import com.ziv.proxy.i.Image;

public class ProxyImage implements Image {

    private RealImage realImage;

    private String fileName;

    public ProxyImage (String fileName){
        this.fileName = fileName;
    }

    public void display() {
        // 空对象时候会加载一下 因此会多一步加载的步骤
        if(realImage == null){
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }


}
