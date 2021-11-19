package encapsulation.pizzaCalories;

public class Dough {

    private String flourType;
    private String bakingTechnique;
    private double weight;
    private double calories;

    Dough (String flourType, String bakingTechnique, double weight){
        setFlourType(flourType);
        setBakingTechnique(bakingTechnique);
        setWeight(weight);
        setCalories();
    }

    public double getCalories(){
        return this.calories;
    }

    private void setCalories(){
        DoughType flourTypeCalories = DoughType.valueOf(this.getFlourType());
        DoughType bakingTechniqueCalories = DoughType.valueOf(this.getBakingTechnique());
        this.calories = 2 * (this.getWeight()
                * flourTypeCalories.getDoughTypeCalories()
                * bakingTechniqueCalories.getDoughTypeCalories());
    }

    private String getFlourType() {
        return flourType;
    }

    private void setFlourType(String flourType) {
        this.flourType = flourType;
    }

    private String getBakingTechnique() {
        return bakingTechnique;
    }

    private void setBakingTechnique(String bakingTechnique) {
        this.bakingTechnique = bakingTechnique;
    }

    private double getWeight() {
        return weight;
    }

    private void setWeight(double weight) {
        this.weight = weight;
    }
}
