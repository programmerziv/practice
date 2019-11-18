package com.ziv.media.c;

import com.ziv.media.c.ChatRoom;

public class User {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;


    public User(String name) {
        this.name = name;
    }

    /**
     * 反过来利用了chatroom  只依赖于它 不依赖于其它用户
     * @param message
     */
    public void sendMessage(String message){
        ChatRoom.showMessage(this,message);
    }
}
