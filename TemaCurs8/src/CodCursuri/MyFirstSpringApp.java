package CodCursuri;

import CodCursuri.ITeacher;
import CodCursuri.JavaTeacher;
import CodCursuri.MyBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyFirstSpringApp {

    public static void main(String[] args) {

        System.out.println(" ----- Before context initialization ----- ");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TeacherConfiguration.class, WisdomWordsService.class);
//        CodCursuri.ServiceA serviceA = context.getBean(CodCursuri.ServiceA.class);
//        CodCursuri.ServiceB serviceB = context.getBean(CodCursuri.ServiceB.class);

        ITeacher teacher = context.getBean("javaTeacher", JavaTeacher.class);

        System.out.println(teacher.getWisdom());
        context.getBean("myBean", MyBean.class).sayHello();

        // close the context
        context.close();
        System.out.println(" ----- After context closed ----- ");

    }

}
