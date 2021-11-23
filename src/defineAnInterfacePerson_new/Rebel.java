package defineAnInterfacePerson_new;

public class Rebel implements Person, Identifiable, Birthable, Buyer {

    private final String name;
    private int food;
    private final String group;

    int foodValue = 5;
    
    public Rebel(String name, String group, int food) {
        this.name = name;
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
        return 0;
    }

    public String getGroup() {
        return this.group;
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
