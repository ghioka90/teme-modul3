package com.devmind.annotation.springapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyFirstSpringAnnotationApp {

    public static void main(String[] args) {
        // citeste fisierul de configurare
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // obtine bean-ul din containerul de Spring
        ITeacher teacher = context.getBean(ITeacher.class);

        // foloseste functionalitatile bean-ului
        System.out.println(teacher.getHomeWork());
        // inchide contextul
        context.close();
    }
}