import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MyApp {
    public static void main(String[] args) throws InterruptedException{

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
Task task = context.getBean("newTask", Task.class);
//        context.getBean("newTask", Task.class);
//        context.getBean("newTask", Task.class);
//        context.getBean("newTask", Task.class);
////        System.out.println("Current number of Tasks: " + Task.numberOfTasks);
//        System.out.println();
//        System.out.println("After destroy bean");
//        context.getBean("destroyTask", Task.class);
////        context.getBean("destroyTask", Task.class);
//        System.out.println("Current number of Tasks: " + Task.numberOfTasks);

        task.run();

        // close the context
        context.close();
        System.out.println("----- After context closed");
    }
}
