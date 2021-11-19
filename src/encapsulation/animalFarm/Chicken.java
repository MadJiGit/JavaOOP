package encapsulation.animalFarm;

public class Chicken {
    private String name;
    private int age;

    Chicken(String name, int age) {
        setName(name);
        setAge(age);
    }

    private void setName(String name) {
        if (name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        this.name = name;
    }

    private void setAge(int age) {
        if(age < 0 || age > 15) {
            throw new IllegalArgumentException("Age should be between 0 and 15.");
        }
        this.age = age;
    }

    public double productPerDay(){
        return calculateProductPerDay();
    }

    private double calculateProductPerDay(){
        if (this.age > 11 ) {
            return 0.75;
        } else if (this.age > 5) {
            return 1.0;
        } else {
            return 2;
        }
    }

    @Override
    public String toString() {
        return "Chicken " + this.name + " (age " + this.age + ") can produce " + productPerDay() +
                " eggs per day.";
    }
}
