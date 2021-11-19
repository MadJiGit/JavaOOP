package inheritance.animals;

public class Animal {

    final static String SOUND = null;
    private String name;
    private String gender;
    private String sound = null;
    private int age;

    public Animal(String name, String gender, int age) {
        this.setName(name);
        this.setGender(gender);
        this.setAge(age);
        this.setSound(SOUND);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + System.lineSeparator() +
                this.getName() + " " + this.getAge() + " " + this.getGender() + System.lineSeparator() +
                this.produceSound();
    }

    protected void setSound(String sound) {
        this.sound = sound;
    }

    public String produceSound() {
        return this.sound;
    }

    public String getName() {
        return name;
    }

    protected void setName(String name) {
        if (name.trim().isEmpty()) {
            throw new IllegalArgumentException("Invalid input!");
        }
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    protected void setGender(String gender) {
        if (gender.trim().isEmpty()) {
            throw new IllegalArgumentException("Invalid input!");
        }
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    protected void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Invalid input!");
        }
        this.age = age;
    }
}
