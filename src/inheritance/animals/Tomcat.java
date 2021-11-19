package inheritance.animals;

public class Tomcat extends Cat {

    final static String SOUND = "MEOW";
    final static String GENDER = "Male";

    public Tomcat(String name, int age) {
        super(name, GENDER, age);
        setSound(SOUND);
    }

    public Tomcat(String name, int age, String gender) {
        super(name, GENDER, age);
        setSound(SOUND);
    }
}
