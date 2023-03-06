public class Dog implements IAnimal{

    String animalName;

    @Override
    public String makeSound(){
        return "Ham Ham";
    }

    public Dog(String animalName) {
        this.animalName = animalName;
    }

}
