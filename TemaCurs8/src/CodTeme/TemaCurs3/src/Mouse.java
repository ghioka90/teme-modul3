package CodTeme.TemaCurs3.src;

public class Mouse implements IAnimal {
    String animalName;
   @Override
    public String makeSound(){
       return "Chit Chit";
   }
    public Mouse(String animalName) {
        this.animalName = animalName;
    }
}
