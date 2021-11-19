package inheritance.animals;

public class Cat extends Animal{

    final static String SOUND = "Meow meow";

    public Cat(String name, String gender, int age) {
        super(name, gender, age);
        setSound(SOUND);
    }
}
