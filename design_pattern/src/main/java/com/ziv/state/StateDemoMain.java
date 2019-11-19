package com.ziv.state;

import com.ziv.state.c.Context;
import com.ziv.state.c.StartState;
import com.ziv.state.c.StopState;

public class StateDemoMain {

    public static void main(String[] args) {
        // 现在状态是null
        Context context = new Context();

        StartState startState = new StartState();
        // 此时state 为start
        startState.doAction(context);
        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        // 此时state为stop
        stopState.doAction(context);
        System.out.println(context.getState().toString());
    }

}
