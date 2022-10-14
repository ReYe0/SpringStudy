package com.study._002.entity;

import com.study._002.inter.Instrument;
import com.study._002.inter.Performer;

import java.util.Collection;

public class OneManBan implements Performer {
    private Collection<Instrument> instruments;


    //注入instruments集合
    public void setInstruments(Collection<Instrument> instruments) {
        this.instruments = instruments;
    }

    public void perform() {
        for(Instrument ins:instruments){
            ins.play();
        }
    }
}
