package ru.maxima.radio;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestRadio {
    public static  void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        RadioPlayer radioPlayer = context.getBean("player" , RadioPlayer.class);
        radioPlayer.playRadio(3);
        System.out.println();
    }
}
