package inheritance.animals;

public class Dog extends Animal{

    final static String SOUND = "Woof!";

    public Dog(String name, String gender, int age) {
        super(name, gender, age);
        setSound(SOUND);
    }
}
