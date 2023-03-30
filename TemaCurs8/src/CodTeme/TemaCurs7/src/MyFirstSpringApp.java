import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyFirstSpringApp{

    public static void main(String[] args) {
        // load the Spring configuration file
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("applicationContext.xml");



        // retrieve bean from Spring container

       CarService carService = context.getBean("carService", CarService.class);




        // call methods on the bean

        carService.travel();
        carService.getAutocar().travel();
        carService.getMotocicleta().travel();







        // close the context
        context.close();
    }

}