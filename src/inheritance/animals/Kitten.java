package inheritance.animals;

public class Kitten extends Cat {

    final static String SOUND = "Meow";
    final static String GENDER = "Female";

    public Kitten(String name, int age) {
        super(name, GENDER, age);
        setSound(SOUND);
    }

    public Kitten(String name, int age, String gender) {
        super(name, GENDER, age);
        setSound(SOUND);
    }
}
