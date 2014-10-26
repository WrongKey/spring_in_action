package com.wrongkey.springidol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *@author wrongkey
 *@description 主方法
 *@date 2014/10/26
 *@version v1.0
 *
 */
public class SpringIdolMain {
    public static void main(String[] args)throws Exception{
        ApplicationContext ctx = new ClassPathXmlApplicationContext(
                "com.wrongkey.springidol/springidol.xml");

        Performer performer = (Performer)ctx.getBean("juggler_wrongkey");
        performer.perform();
    }
}
