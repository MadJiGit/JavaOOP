package encapsulation.pizzaCalories;

public enum ToppingType {
    MEAT(1.2),
    VEGGIES(0.8),
    CHEESE(1.1),
    SAUCE(0.9);

    private final double toppingCalories;

    ToppingType(double v) {
        this.toppingCalories = v;
    }

    public double getToppingCalories(){
        return this.toppingCalories;
    }
}
