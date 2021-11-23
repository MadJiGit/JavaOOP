package defineAnInterfacePerson_new;

public class Citizen implements Person, Identifiable, Birthable, Buyer {

    private final String name;
    private final int age;
    private int food;
    private final String id;
    private final String birthDate;
    int foodValue = 10;

    public Citizen(String name, int age, String id, String birthDate, int food) {
        this.name = name;
        this.age = age;
        this.food = food;
        this.id = id;
        this.birthDate = birthDate;
    }

    protected void setFood(int food){
        this.food += food;
    }

    @Override
    public void buyFood() {
        setFood(this.foodValue);
    }

    @Override
    public int getFood() {
        return 0;
    }

    @Override
    public String getBirthDate() {
        return null;
    }

    @Override
    public String getId() {
        return null;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public int getAge() {
        return 0;
    }
}
