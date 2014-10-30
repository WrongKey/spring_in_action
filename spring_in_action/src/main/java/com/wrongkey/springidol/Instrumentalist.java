package com.wrongkey.springidol;

/**
 *@author wrongkey
 *@description 音乐演奏家
 *@date 2014/10/30
 *@version v1.0
 *
 */
public class Instrumentalist implements Performer {
    private String name;    //演奏家姓名
    private String song;    //演奏的歌曲
    private Instrument instrument;  //演奏的歌曲

    public Instrumentalist() {
    }

    /**
     *@author wrongkey
     *@description 乐器演奏
     *@date 2014/10/30
     *@version v1.0
     *
     */
    @Override
    public void perform()throws PerformanceException{
        System.out.print(name+" playing " + song + " : ");
        instrument.play();
    }

    /**
     *@author wrongkey
     *@description 注入song
     *@date 2014/10/30
     *@version v1.0
     *
     */
    public void setSong(String song) {
        this.song = song;
    }

    public String getSong() {
        return song;
    }

    public Instrument getInstrument() {
        return instrument;
    }

    /**
     *@author wrongkey
     *@description 注入instrument
     *@date 2014/10/30
     *@version v1.0
     *
     */
    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }


    public String getName() {
        return name;
    }

    /**
     *@author wrongkey
     *@description 注入name
     *@date 2014/10/30
     *@version v1.0
     *
     */
    public void setName(String name) {
        this.name = name;
    }


}
