package interfaceAndAbstraction.defineAnInterfacePerson;

public class Rebel implements Person, Identifiable, Buyer {

    private final String name;
    private final int age;
    private int food;
    private final String group;

    private final int foodValue = 5;
    
    public Rebel(String name, String group, int age, int food) {
        this.name = name;
        this.age = age;
        this.food = food;
        this.group = group;
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
        return this.food;
    }

    public String getGroup() {
        return this.group;
    }

    @Override
    public String getId() {
        return this.group;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getAge() {
        return 0;
    }

}
