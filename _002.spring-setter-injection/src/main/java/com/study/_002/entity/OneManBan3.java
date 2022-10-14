package com.study._002.entity;

import com.study._002.inter.Performer;

import java.util.Properties;

public class OneManBan3 implements Performer {
    private Properties instruments;
    public OneManBan3() {

    }
    public void perform() {
        for(Object key:instruments.keySet()){
            System.out.print(key+": ");
            String ins=instruments.getProperty(key.toString());
            System.out.println(ins);
        }
    }
    public void setInstruments(Properties instruments) {
        this.instruments = instruments;
    }
}