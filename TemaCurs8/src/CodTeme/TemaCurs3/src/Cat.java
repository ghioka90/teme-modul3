package CodTeme.TemaCurs3.src;
public class Cat implements IAnimal{

    String animalName;
   @Override
    public String makeSound(){
        return "Miau Miau";
    }
    public Cat(String animalName) {
        this.animalName = animalName;
    }
}
