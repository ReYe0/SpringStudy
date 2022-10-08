package com.study._002.entity;

import com.study._002.inter.Instrument;
import com.study._002.inter.Performer;

public class Instrumentalist implements Performer {
    private String song;
    private Instrument instrument;

    public Instrumentalist() {

    }
    public void perform() {
        System.out.println("唱："+song+"");
        instrument.play();
    }
    public String screamSong(){
        return song;
    }
    public String getSong() {
        return song;
    }
    //注入歌曲
    public void setSong(String song) {
        this.song = song;
    }
    public Instrument getInstrument() {
        return instrument;
    }
    //注入乐器
    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }
}