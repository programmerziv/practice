package com.ziv.template.c;

import com.ziv.template.a.Game;

public class Football extends Game {
    public void initialize() {
        System.out.println("Football Game Initialized! Start Playing.");
    }

    public void startPlay() {
        System.out.println("Football Game Started! Enjoying Playing.");
    }

    public void endPlay() {
        System.out.println("Football Game Finished! Good Game.");
    }
}
