import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testSpringApp {
   public static void main(String[] args) {
      ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("homeWorkContext.xml");

      IAnimal oneAnimal = context.getBean("myDog",IAnimal.class);


      System.out.println(oneAnimal.makeSound());

      context.close();
   }
}
