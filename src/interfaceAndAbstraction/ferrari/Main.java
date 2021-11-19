package interfaceAndAbstraction.ferrari;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        Car ferrari = new Ferrari(scanner.nextLine());

        System.out.println(ferrari);

        scanner.close();

    }
}
