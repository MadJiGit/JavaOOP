package interfaceAndAbstraction.defineAnInterfacePerson_with_abstract;

public class Citizen extends Human {

    int foodValue = 10;

    public Citizen(String name, int age, String id, String birthDate, int food) {
        super(name, age, id, birthDate, food);
    }

    @Override
    public void buyFood() {
        setFood(this.foodValue);
    }
}
