package abstraction.cardSuits;

public enum CardSuitsTwo {

    CLUBS(0),
    DIAMONDS(13),
    HEARTS(26),
    SPADES(39);

    private final int cardValue;

    CardSuitsTwo(int type) {
        this.cardValue = type;
    }

    public int getCardValue() {
        return this.cardValue;
    }

}
