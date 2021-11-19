package interfaceAndAbstraction.ferrari;

public class Ferrari implements Car {

    private final String driverName;
    final static String MODEL = "488-Spider";
    private final String model;

    public Ferrari(String name) {
        this.driverName = name;
        this.model = MODEL;
    }


    @Override
    public String brakes() {
        return "Brakes!";
    }

    @Override
    public String gas() {
        return "brum-brum-brum-brrrrr";
    }

    @Override
    public String getName() {
        return this.driverName;
    }

    @Override
    public String getModel() {
        return this.model;
    }

    @Override
    public String toString() {
        return this.getModel() + "/"
                + this.brakes() + "/"
                + this.gas() + "/"
                + this.getName();
    }
}
