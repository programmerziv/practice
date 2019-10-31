package com.ziv.adapter.c;

import com.ziv.adapter.i.MediaPlayer;

/**
 * <p>title:AudioPlayer </p>
 * <p>package: com.ziv.adapter</p>
 * <p>description:媒体播放器 </p>
 *
 * @author zhangzong
 * @version 1.0
 * @date 2019/10/30 8:51
 */
public class AudioPlayer implements MediaPlayer {


    private MediaAdapter mediaAdapter;

    public void paly(String audioType,String fileName) {

        if (audioType.equalsIgnoreCase("mp3")){
            System.out.println("MP3播放:"+fileName);
        }else if (audioType.equalsIgnoreCase("mp4") || audioType.equalsIgnoreCase("vlc")){
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.paly(audioType,fileName);

        }else {
            System.out.println(audioType + "格式暂不支持");
        }
    }
}
