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

        /*System.out.println("礼堂准备......");
        Auditorium auditorium = (Auditorium)ctx.getBean("auditorium");*/

        System.out.println("\n舞台开始准备......");
        Stage stage = (Stage)ctx.getBean("stage");
        System.out.println("\n舞台准备完毕......");

        Performer performer = (Performer)ctx.getBean("juggler_wrongkey");
        System.out.println("\njuggler_wrongkey 开始表演了......");
        performer.perform();

        PoeticJuggler poeticJuggler = (PoeticJuggler)ctx.getBean("poeticjuggler_wrongkey");
        System.out.println("\npoeticjuggler_wrongkey开始表演了......");
        poeticJuggler.perform();

        Performer instrumentalist = (Performer)ctx.getBean("instrumentalist_wrongkey");
        System.out.println("\ninstrumentalist_wrongkey开始表演了......");
        instrumentalist.perform();

        Performer oneManBand = (Performer)ctx.getBean("onemanband_wrongkey");
        System.out.println("\nonemanband_wrongkey开始表演了......");
        oneManBand.perform();
    }
}
