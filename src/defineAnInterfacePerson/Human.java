package defineAnInterfacePerson;

public abstract class Human implements Person, Identifiable, Birthable, Buyer {

    private final String name;
    private final int age;
    private int food;
    private final String id;
    private final String birthDate;


    protected Human(String name, int age, int food) {
        this.name = name;
        this.age = age;
        this.food = food;
        this.id = null;
        this.birthDate = null;
    }

    protected Human(String name, int age, String id, String birthDate, int food) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.birthDate = birthDate;
        this.food = food;
    }

    protected void setFood(int food){
        this.food += food;
    }

    @Override
    public int getFood() {
        return this.food;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getAge() {
        return this.age;
    }

    @Override
    public String getBirthDate() {
        return this.birthDate;
    }

    @Override
    public String getId() {
        return this.id;
    }
}
