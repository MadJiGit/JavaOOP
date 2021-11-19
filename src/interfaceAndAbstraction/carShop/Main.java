package interfaceAndAbstraction.carShop;

public class Main {
    public static void main(String[] args) {

        Car seat = new Seat("Ibiza", "blue", 115, "Spain");

        System.out.println(String.format(
                "%s is %s color and have %s horse power",
                seat.getModel(),
                seat.getColor(),
                seat.getHorsePower()));
        System.out.println(seat);
    }
}
