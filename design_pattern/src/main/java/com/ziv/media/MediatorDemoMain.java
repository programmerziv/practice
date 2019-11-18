package com.ziv.media;

import com.ziv.media.c.User;

public class MediatorDemoMain {

    public static void main(String[] args) {

        User ziv = new User("ziv");

        User fangzhou = new User("fangzhou");

        ziv.sendMessage("hi fangzhou");

        fangzhou.sendMessage("hi ziv");
    }
}
