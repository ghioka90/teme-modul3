package org.example;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyFirstSpringApp{

    public static void main(String[] args) {
        // load the Spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        WisdomWordsService wisdomWordsService = new WisdomWordsService();
//        homeworkService homeworkService = new homeworkService();

        // retrieve bean from Spring container
        JavaTeacher theTeacher = context.getBean("myTeacher",JavaTeacher.class);
//        JavaTeacher javaTeacher = new JavaTeacher(wisdomWordsService,homeworkService);
        ITeacher mathTeacher = context.getBean("myMathTeacher",ITeacher.class);

        // call methods on the bean
//        System.out.println(theTeacher.getWisdom());
//        System.out.println(mathTeacher.getWisdom());

        System.out.println("Wisdom: " + theTeacher.getWisdom());
        System.out.println("Age: " + theTeacher.getAge());
        System.out.println("Work place: " + theTeacher.getWorkPlace());

        // close the context
        context.close();
    }

}