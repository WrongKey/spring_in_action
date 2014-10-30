package com.wrongkey.springidol;

import java.util.Map;

/**
 *@author wrongkey
 *@description 使用Map的OneManBand
 *@date 2014/10/30
 *@version v1.0
 *
 */
public class OneManBand2 implements Performer{
    private Map<String,Instrument> instruments;

    public OneManBand2() {
    }

    @Override
    public void perform() throws PerformanceException {
        for (String key : instruments.keySet()){
            System.out.print(key+" : ");
            Instrument instrument = instruments.get(key);
            instrument.play();
        }
    }

    public void setInstruments(Map<String, Instrument> instruments) {
        this.instruments = instruments;
    }
}
