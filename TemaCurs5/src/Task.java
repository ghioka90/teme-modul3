import static java.lang.Thread.sleep;
import java.util.Random;

public class Task {
   Random rand = new Random();
   public String taskName;
   public int taskId = 0;
   public int executionTime;
   static int numberOfTasks;


   public Task(){
      numberOfTasks++;
      System.out.println("Current number of tasks: " + numberOfTasks );
   }

   public void run() throws InterruptedException {
      sleep(executionTime);
      System.out.println("SLEEP");
   }

//   public void executionTime(){
//      this.executionTime = rand.nextInt(21);
//   }

   public int generateId(){
      this.taskId = numberOfTasks - 1;
      return taskId;
   }
   private void init() {
      generateId();
      this.taskName = "Task " + taskId;
      this.executionTime = rand.nextInt(21);
      System.out.println("Init method: TaskID = " + taskId +" TaskName " + taskName +
              " ExecTime = " + executionTime);
   }
   private void destroy() {
      System.out.println(taskName + " has been destroyed!");
      numberOfTasks--;
      System.out.println("Curent number of tasks " + numberOfTasks);
   }
}
