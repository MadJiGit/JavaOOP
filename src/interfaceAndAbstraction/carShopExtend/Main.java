package interfaceAndAbstraction.carShopExtend;

public class Main {
    public static void main(String[] args) {

        Car seat = new Seat("Ibiza", "blue", 115, "Spain", 11122.00);
        Car audi = new Audi("A3", "red", 155, "Germany", 5, 42.50);

        printCarInfo(seat);
        printCarInfo(audi);

    }

    private static void printCarInfo(Car car) {
        System.out.println(String.format(
                "%s is %s color and have %s horse power",
                car.getModel(),
                car.getColor(),
                car.getHorsePower()));
        System.out.println(car);
    }
}
