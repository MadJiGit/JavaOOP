package abstraction.hotelReservation;

public enum Discount {

    NONE(0),
    SECOND_VISIT(10),
    VIP(20);

    private final int percents;


    Discount(int type) {

        this.percents = type;
    }

    public Integer getPercents() {
        return this.percents;
    }
}
