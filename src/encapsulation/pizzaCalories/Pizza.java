package encapsulation.pizzaCalories;

import java.util.HashMap;
import java.util.Locale;

public class Pizza {

    String name;
    int numberOfToppings;
    double calories;
    Dough dough;
    private HashMap<String, Topping> toppingsList;

    public Pizza(String name, int numberOfToppings){
        setName(name);
        setToppings(numberOfToppings);
        updateCalories(0);
        toppingsList = new HashMap<>();
    }

    public double getOverallCalories(){
        return this.calories;
    }

    public void addTopping(Topping topping){
        String toppingType = topping.getType().toUpperCase(Locale.ROOT);
        toppingsList.put(toppingType, topping);
        this.updateCalories(topping.getCalories());
    }

    public void addDough(Dough dough){
        this.dough = dough;
        this.updateCalories(this.dough.getCalories());
    }

    public String getName(){
        return this.name;
    }

    private void setName(String name){
        this.name = name;
    }

    private void setToppings(int numberOfToppings){
        this.numberOfToppings = numberOfToppings;
    }

    public void updateCalories(double calories){
        this.calories = this.calories + calories;
    }
}
