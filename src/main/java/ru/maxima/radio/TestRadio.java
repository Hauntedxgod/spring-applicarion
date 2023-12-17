package ru.maxima.radio;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;

public class TestRadio {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Music music1 = context.getBean("maximum" , MaximumRadio.class);
        Music music = context.getBean("relax" , RadioRelax.class);
        Music music2 = context.getBean("energy" , RadioEnergy.class);
        RadioPlayer radioPlayer = new RadioPlayer(music);
        RadioPlayer radioPlayer1 = new RadioPlayer(music1);
        RadioPlayer radioPlayer2 = new RadioPlayer(music2);
        radioPlayer.playRadio();
        System.out.println("------");
        radioPlayer1.playRadio();
        System.out.println("-------");
        radioPlayer2.playRadio();

    }
}
