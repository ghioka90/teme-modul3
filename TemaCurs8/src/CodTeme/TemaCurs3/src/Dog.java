package CodTeme.TemaCurs3.src;
public class Dog implements IAnimal{

    String animalName;

    @Override
    public String makeSound(){
        return "Ham Ham and my name is " + animalName;
    }

    public Dog(String animalName) {
        this.animalName = animalName;
    }

}
