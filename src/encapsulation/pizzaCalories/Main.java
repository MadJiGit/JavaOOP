package encapsulation.pizzaCalories;

import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;
import java.lang.*;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);


        // ********************   Pizza input check   ***********************
        String[] typeOfPizza = scanner.nextLine().split("\\s+");

//        if(!typeOfPizza[0].equals("Pizza")) {
//            throw new IllegalArgumentException("Not valid order.");
//        }

        String pizzaName = typeOfPizza[1];
        int numberOfIngredients = Integer.parseInt(typeOfPizza[2]);
        if(numberOfIngredients > 10 || numberOfIngredients < 0){
            System.out.println("Number of toppings should be in range [0..10].");
            return;
        }
        // END Pizza

        // ********************   Dough input check     ***********************
        String[] typeOfDough = scanner.nextLine().split("\\s+");

//        if(!typeOfDough[0].equals("Dough")) {
//            throw new IllegalArgumentException("Not valid type of dough.");
//        }

        String doughFlourType = typeOfDough[1].toUpperCase(Locale.ROOT);
        String doughBackingType = typeOfDough[2].toUpperCase(Locale.ROOT);
        double doughWeight = Double.parseDouble(typeOfDough[3]);
        Dough dough;

        try {
            dough = new Dough(doughFlourType, doughBackingType, doughWeight);
        } catch (IllegalArgumentException e){
            System.out.println("Invalid type of dough.");
            return;
        }

        // END Dough


        // ********************   Topping input check   ***********************

        HashMap<String, Topping> listOfToppings = new HashMap<>();
        String[] toppingsInput = scanner.nextLine().split("\\s+");

        while (!toppingsInput[0].equals("END")){
//            if(!toppingsInput[0].equals("Topping")){
//                throw new IllegalArgumentException("Not valid topping.");
//            }

            try {
                ToppingType.valueOf(toppingsInput[1].toUpperCase(Locale.ROOT));
            } catch (IllegalArgumentException e) {
                System.out.println("Cannot place " + toppingsInput[1] + " on top of your pizza.");
                return;
            }

            Topping tempTopping = new Topping(toppingsInput[1].toUpperCase(Locale.ROOT), Double.parseDouble(toppingsInput[2]));
            listOfToppings.put(tempTopping.getType(), tempTopping);
            toppingsInput = scanner.nextLine().split("\\s+");
        }
        // END Topping

        Pizza newPizza = new Pizza(pizzaName, numberOfIngredients);
        newPizza.addDough(dough);


        for(Topping tt : listOfToppings.values()){
            newPizza.addTopping(tt);
        }

        System.out.printf("%s - %.2f\n", newPizza.getName(),newPizza.getOverallCalories());
    }
}
