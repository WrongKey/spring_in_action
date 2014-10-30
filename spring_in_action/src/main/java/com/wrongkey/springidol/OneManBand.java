package com.wrongkey.springidol;

import java.util.Collection;

/**
 *@author wrongkey
 *@description 一个人的乐队（很厉害的样子）
 *@date 2014/10/30
 *@version v1.0
 *
 */
public class OneManBand implements Performer{
    private Collection<Instrument> instruments; //演奏的乐器集合

    public OneManBand() {
    }

    @Override
    public void perform() throws PerformanceException {
        for(Instrument instrument : instruments){
            instrument.play();
        }
    }

    /**
     *@author wrongkey
     *@description 注入乐器集合
     *@date 2014/10/30
     *@version v1.0
     *
     */
    public void setInstruments(Collection<Instrument> instruments) {
        this.instruments = instruments;
    }
}
