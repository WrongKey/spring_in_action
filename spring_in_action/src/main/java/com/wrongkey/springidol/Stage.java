package com.wrongkey.springidol;

/**
 *@author wrongkey
 *@description 舞台类，单例
 *@date 2014/10/30
 *@version v1.0
 *
 */
public class Stage {
    private Stage() {
    }

    /*
    * initialization on demand holder
    * 持有一个单例对象
    **/
    private static class StageSingletonHolder{
        static Stage instance = new Stage();
    }

    /**
     *@author wrongkey
     *@description 获取单例
     *@date 2014/10/30
     *@version v1.0
     *
     */
    public static Stage getInstance(){
        return StageSingletonHolder.instance;
    }
}
