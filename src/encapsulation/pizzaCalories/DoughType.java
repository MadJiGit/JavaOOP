package encapsulation.pizzaCalories;

public enum DoughType {
    WHITE(1.5),
    WHOLEGRAIN(1.0),
    CRISPY(0.9),
    CHEWY(1.1),
    HOMEMADE(1.0);

    private final double doughTypeCalories;

    DoughType(double v){
        this.doughTypeCalories = v;
    }

    public double getDoughTypeCalories(){

        return this.doughTypeCalories;
    }
}
