package com.wrongkey.springidol;

/**
 *@author wrongkey
 *@description 钢琴
 *@date 2014/10/30
 *@version v1.0
 *
 */
public class Piano implements Instrument{

    public Piano() {
    }

    @Override
    public void play() {
        System.out.println("PLINGK PLINK PLINK");
    }
}
