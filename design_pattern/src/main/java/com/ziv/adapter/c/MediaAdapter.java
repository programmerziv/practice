package com.ziv.adapter.c;

import com.ziv.adapter.i.AdvanceMediaPlayer;
import com.ziv.adapter.i.MediaPlayer;

/**
 * <p>title:MediaAdapter </p>
 * <p>package: com.ziv.adapter</p>
 * <p>description:适配器类 </p>
 *
 * @author zhangzong
 * @version 1.0
 * @date 2019/10/30 8:48
 */
public class MediaAdapter implements MediaPlayer {

    private AdvanceMediaPlayer advanceMediaPlayer;

    public MediaAdapter(String mediaType) {

        if(mediaType.equalsIgnoreCase("mp4")){
            advanceMediaPlayer = new Mp4Player();
        }
        if(mediaType.equalsIgnoreCase("vlc")){
            advanceMediaPlayer = new VlcPlayer();
        }


    }

    public void paly(String audioType,String fileName) {
        if (audioType.equalsIgnoreCase("mp4")){
            advanceMediaPlayer.playMp4(fileName);
        }
        if (audioType.equalsIgnoreCase("vlc")){
            advanceMediaPlayer.playVlc(fileName);
        }

    }
}
