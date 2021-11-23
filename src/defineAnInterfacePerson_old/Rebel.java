package defineAnInterfacePerson_old;

public class Rebel implements Person, Buyer {

    private final String name;
    private final int age;
    private final String group;
    private int food;

    public Rebel(String name, int age, String group, int food) {
        this.name = name;
        this.age = age;
        this.group = group;
        this.food = food;
    }


    @Override
    public void buyFood() {
        this.food += 5;
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

    public String getGroup() {
        return this.group;
    }
}
