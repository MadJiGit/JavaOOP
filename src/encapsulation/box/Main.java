package encapsulation.box;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Problem 1.	Class Box
        Scanner scanner = new Scanner(System.in);
        double length= scanner.nextDouble();
        double width = scanner.nextDouble();
        double height = scanner.nextDouble();
        Box box;

        try {
            box = new Box(length, width, height);
            printData(box.calculateSurfaceArea(), box.calculateLiteralArea(), box.calculateVolume());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }


    static void printData(double area, double surfaceArea, double volume){
        System.out.printf( "Surface Area - %.2f\nLateral Surface Area - %.2f\nVolume – %.2f\n", area,surfaceArea, volume);
    }
}
