package com.ziv.media.c;

import java.util.Date;

public class ChatRoom {
    /**
     * 利用了user
     * @param user
     * @param message
     */
    public static void showMessage(User user, String message) {
        System.out.println(new Date().toString() + "[" +user.getName() + "]:" + message);
    }

}
