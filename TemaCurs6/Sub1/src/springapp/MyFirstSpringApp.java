package springapp;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyFirstSpringApp{

    public static void main(String[] args) {
        // load the Spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        WisdomWordsService wisdomWordsService = new WisdomWordsService();
        homeworkService homeworkService = new homeworkService();

        // retrieve bean from Spring container

        ITeacher teacher1 = context.getBean("devTeacher",ITeacher.class);
        ITeacher teacher2 = context.getBean("javaTeacher",ITeacher.class);
        ITeacher teacher3 = context.getBean("mathTeacher",ITeacher.class);
        ITeacher teacher4 = context.getBean("historyTeacher",ITeacher.class);

        // call methods on the bean


        System.out.println(teacher1.getHomeWork());
        System.out.println(teacher2.getHomeWork());
        System.out.println(teacher3.getHomeWork());
        System.out.println(teacher4.getHomeWork());




        // close the context
        context.close();
    }

}