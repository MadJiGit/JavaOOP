package abstraction.hotelReservation;

public class PriceCalculator {

    private final int constPercents;
    private final int discount;
    private final double price;
    private final double finalPrice;
    private final int days;

    public PriceCalculator(Double price, int days, int season, int discount ) {
        this.constPercents = 100;
        this.discount = discount;
        this.price = price;
        this.days = days;
        this.finalPrice = calculateFinalPrice(season);

    }

    private double calculateFinalPrice(int season) {
        return getPriceWithDiscount() * days * season;
    }

    private Double getPriceWithDiscount() {
        return this.price - (this.price * (this.discount / (this.constPercents * 1.0) ));
    }

    public Double getPrice() {
        return this.finalPrice;
    }
}
