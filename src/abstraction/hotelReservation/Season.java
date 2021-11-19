package abstraction.hotelReservation;

public enum Season {

    AUTUMN(1),
    SPRING(2),
    WINTER(3),
    SUMMER(4);

    private final int seasonValue;

    Season(int type) {
        this.seasonValue = type;
    }

    public int getSeasonValue() {
        return this.seasonValue;
    }

//    private final String season;
//    Season value =
//
//    Season (String season) {
//        this.season = season;
//    }
}
