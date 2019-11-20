package com.ziv.template.c;

import com.ziv.template.a.Game;

public class Cricket extends Game {
   public void initialize() {
        System.out.println("Cricket Game Initialized! Start Playing.");
    }

   public void startPlay() {
        System.out.println("Cricket Game Started! Enjoying Playing.");
    }

   public void endPlay() {
        System.out.println("Cricket Game Finished! Good Game.");
    }
}
