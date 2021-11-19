package abstraction;


import abstraction.cardRanks.CardRanksTwo;
import abstraction.cardSuits.CardSuitsTwo;
import abstraction.trafficLights.TrafficLights;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //Traffic Lights
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        int rounds = Integer.parseInt(scanner.nextLine());
        String lastOne = "";

        //CardRanks[] cardRank = CardRanks.values();

        while (rounds-- > 0) {
            for (String in : input) {
                lastOne = TrafficLights.valueOf(in).toString();
                System.out.print(in + " ");
            }

            System.out.println("\n" + lastOne);
        }

    }
        /*
        // Card with Power
        Scanner scanner = new Scanner(System.in);
        String value = scanner.nextLine();
        String suit = scanner.nextLine();

        CardSuitsTwo tempCardSuit = CardSuitsTwo.valueOf(suit);
        CardRanksTwo tempCardValue = CardRanksTwo.valueOf(value);
        int cardValue = tempCardValue.getCardValue();
        int cardSuit = tempCardSuit.getCardValue();

        System.out.printf("Card name: %s of %s; Card power: %d", tempCardSuit, tempCardValue, cardSuit+cardValue);
    }
         */
        /*
        // Card Rank
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");

        if (input[0].equals("Card") && input[1].equals("Ranks")) {
            CardRanks[] cardRank = CardRanks.values();
            System.out.println("Card Ranks:");
            for (CardRanks cr : cardRank) {
                System.out.printf("Ordinal value: %d; Name value: %s\n", cr.getCardRankValue(), cr);
            }
        }
    }
         */
        /*
        // Card Suit task
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");

        if(input[0].equals("Card") && input[1].equals("Suits")) {
            CardSuits[] cardSuits = CardSuits.values();
            System.out.println("Card Suits:");
            for (CardSuits cs : cardSuits) {
                System.out.printf("Ordinal value: %d; Name value: %s\n", cs.getCardValue(), cs);
            }
        }
    }
         */
        /*
        // Hotel Reservation task
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");

        double price = Double.parseDouble(input[0]);
        int days = Integer.parseInt(input[1]);
        int season = returnSeasonValue(input[2]);
        int discount = returnDiscountString(input[3]);


        PriceCalculator priceCalculation = new PriceCalculator(price, days, season, discount);
        System.out.printf("%.2f\n", priceCalculation.getPrice());


    }

    private static int returnSeasonValue(String s) {
        String seas =  s.toUpperCase(Locale.ROOT);
        int seasonValue = 0;
        switch(seas) {
            case "AUTUMN":
                seasonValue = Season.AUTUMN.getSeasonValue();
                break;
            case "SPRING":
                seasonValue = Season.SPRING.getSeasonValue();
                break;
            case "WINTER":
                seasonValue = Season.WINTER.getSeasonValue();
                break;
            case "SUMMER":
                seasonValue = Season.SUMMER.getSeasonValue();
                break;
        }

        return seasonValue;
    }

    private static int returnDiscountString(String s) {
        int temp = 0;

        switch (s) {
            case "VIP":
                temp = Discount.VIP.getPercents();
                break;
            case "SecondVisit":
                temp = Discount.SECOND_VISIT.getPercents();
                break;
            default:
                temp = Discount.NONE.getPercents();
                break;

        }
        return temp;
    }
    */
/*
        String temp = switch (s) {
            case "VIP" -> "VIP";
            case "SecondVisit" -> "SECOND_VISIT";
            default -> "None";
        };

 */
        /*
        // Student System task

        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");

        ArrayList<Student> students = new ArrayList<>();

        while(!input[0].equals("Exit")) {

            String task = input[0];
            String name = input[1];

            if(task.equals("Create")) {
                int age = Integer.parseInt(input[2]);
                double grade = Double.parseDouble(input[3]);
                Student student = new Student(name, age, grade);
                students.add(student);
            } else if (task.equals("Show")) {

                for(Student st : students) {
                    if(st.getStudentName().equals(name)) {
                        System.out.println(st.toString());
                    }
                }
            }

            input = scanner.nextLine().split("\\s+");
        }
        */


        /*
        // Rhombus task
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        RhombusOfStars rhombus = new RhombusOfStars(Integer.parseInt(input[0]));
        rhombus.calculateRhombus();
        System.out.println(rhombus);
        */

        // Point In Rectangle task
        /*
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        int[] pointInputs = Arrays
                .stream(input)
                .mapToInt(Integer::parseInt)
                .toArray();

        Point X = new Point(pointInputs[0], pointInputs[1]);
        Point Y = new Point(pointInputs[2], pointInputs[3]);

        Rectangle rect = new Rectangle(X, Y);

        int iter = Integer.parseInt(scanner.nextLine());

        while(iter-- > 0) {
            input = scanner.nextLine().split("\\s+");
            int[] searchedPoint = Arrays
                    .stream(input)
                    .mapToInt(Integer::parseInt)
                    .toArray();

            Point temp = new Point(searchedPoint[0], searchedPoint[1]);

            boolean isInside = rect.isInside(temp);

//            System.out.println("For point with x = "
//                    + temp.getX()
//                    + " and y = "
//                    + temp.getY());
            System.out.println(isInside ? "true" : "false");
        }

        */

}
