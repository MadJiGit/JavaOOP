package interfaceAndAbstraction.defineAnInterfacePerson_with_abstract;

public class Rebel extends Human {
    
    private final String group;
    int foodValue = 5;
    
    public Rebel(String name, int age, String group, int food) {
        super(name, age, food);
        this.group = group;
    }


    @Override
    public void buyFood() {
        setFood(this.foodValue);
    }

    public String getGroup() {
        return this.group;
    }
}
