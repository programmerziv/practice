package com.ziv.template;

import com.ziv.template.a.Game;
import com.ziv.template.c.Cricket;
import com.ziv.template.c.Football;

public class TemplateDemoMain {

    public static void main(String[] args) {
        Game game = new Cricket();
        game.play();
        System.out.println("=========================");
        game = new Football();
        game.play();

    }
}
