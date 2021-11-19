package test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int counter = 1;

        while (scanner.hasNextLine()) {

            String animalType = scanner.nextLine();
            if (animalType.isEmpty()){
                System.out.println("Empty");
                break;
            } else if (animalType.isBlank()){
                System.out.println("Blank");
                break;
            }
            System.out.println(counter++ + " " + animalType);

        }

        scanner.close();
    }
}
