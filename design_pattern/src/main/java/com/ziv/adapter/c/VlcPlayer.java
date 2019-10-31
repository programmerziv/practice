package com.ziv.adapter.c;

import com.ziv.adapter.i.AdvanceMediaPlayer;

/**
 * <p>title:VlcPlayer </p>
 * <p>package: com.ziv.adapter</p>
 * <p>description:具体的先进播放器 </p>
 *
 * @author zhangzong
 * @version 1.0
 * @date 2019/10/30 8:45
 */
public class VlcPlayer implements AdvanceMediaPlayer {

    public void playVlc(String fileName) {
        System.out.println("VLC播放:"+fileName);
    }

    public void playMp4(String fileName) {
        // 什么都不用做
    }
}
