package com.ziv.adapter.c;

import com.ziv.adapter.i.AdvanceMediaPlayer;

/**
 * <p>title: </p>
 * <p>package: com.ziv.adapter</p>
 * <p>description: </p>
 *
 * @author zhangzong
 * @version 1.0
 * @date 2019/10/30 8:46
 */
public class Mp4Player implements AdvanceMediaPlayer {

    public void playVlc(String fileName) {
        // 什么都不用做
    }

    public void playMp4(String fileName) {
        System.out.println("MP4播放:"+fileName);
    }
}
