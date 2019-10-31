package com.ziv.adapter;

import com.ziv.adapter.c.AudioPlayer;

/**
 * <p>title: AdapterDemoMain</p>
 * <p>package: com.ziv.adapter</p>
 * <p>description:适配器模式main方法 </p>
 *
 * @author zhangzong
 * @version 1.0
 * @date 2019/10/30 10:04
 */
public class AdapterDemoMain {

    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.paly("mp3","beyond the horizon.mp3");
        audioPlayer.paly("mp4","alone.mp4");
        audioPlayer.paly("vlc","far far away.vlc");
        audioPlayer.paly("avi","mind me.avi");
    }
}
