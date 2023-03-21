package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(StudentConfiguration.class);

        Student studentSingle = context.getBean("student", Student.class);
        Student secondSingle = context.getBean("student", Student.class);

        Student prototype = context.getBean("studentPrototype", Student.class);
        Student secondProto = context.getBean("studentPrototype", Student.class);


        System.out.println(studentSingle);
        System.out.println(prototype);
        System.out.println(secondSingle);
        System.out.println(secondProto);

    }
}