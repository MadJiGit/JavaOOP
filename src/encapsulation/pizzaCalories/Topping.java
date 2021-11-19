package encapsulation.pizzaCalories;

import encapsulation.pizzaCalories.ToppingType;

public class Topping {
    private String type;
    private double weight;
    private double calories;

    public Topping(String type, double weight) {
        setType(type);
        setWeight(weight);
        setCalories();
    }

    private void setWeight(double weight){
        this.weight = weight;
    }

    private double getWeight(){
        return this.weight;
    }

    private void setCalories(){
        ToppingType toppingType = ToppingType.valueOf(this.getType());
        this.calories = 2 * toppingType.getToppingCalories() * this.getWeight();
    }

    private void setType(String type){
        this.type = type;
    }

    public double getCalories(){
        return this.calories;
    }

    public String getType() {
        return this.type;
    }
}
