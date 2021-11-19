package inheritance.animals;

public class Frog extends Animal {

    final static String SOUND = "Ribbit";

    public Frog(String name, String gender, int age) {
        super(name, gender, age);
        setSound(SOUND);
    }
}
