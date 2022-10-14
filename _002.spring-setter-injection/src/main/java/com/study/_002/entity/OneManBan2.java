package com.study._002.entity;

import com.study._002.inter.Instrument;
import com.study._002.inter.Performer;

import java.util.Map;

public class OneManBan2 implements Performer {
    private Map<String, Instrument> instruments;
    public OneManBan2() {

    }

    public void perform() {
        for(String key:instruments.keySet()){
            System.out.print(key+": ");
            Instrument ins=instruments.get(key);
            ins.play();
        }
    }
    public void setInstruments(Map<String, Instrument> instruments) {
        this.instruments = instruments;
    }
}
