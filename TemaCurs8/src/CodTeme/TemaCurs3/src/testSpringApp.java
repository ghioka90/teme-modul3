package CodTeme.TemaCurs3.src;
import CodCursuri.TeacherConfiguration;
import CodCursuri.WisdomWordsService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testSpringApp {
   public static void main(String[] args) {
      AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(animalConfiguration.class);

      IAnimal oneAnimal = context.getBean("dog",IAnimal.class);


      System.out.println(oneAnimal.makeSound());

      context.close();
   }
}
