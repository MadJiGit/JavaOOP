package inheritance.needForSpeed;

public class Main {
    public static void main(String[] args) {

        Car car = new Car(250, 115);
        car.drive(20);
        System.out.printf("Ferrari.Car consumption of %.2f has fuel %.2f liters.%n", car.getFuelConsumption(), car.getFuel());

        SportCar sportCar = new SportCar(250, 250);
        sportCar.drive(20);
        System.out.printf("Ferrari.Car consumption of %f has fuel %f liters.%n", sportCar.getFuelConsumption(), sportCar.getFuel());
    }
}
