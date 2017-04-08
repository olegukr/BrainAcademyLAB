package lab_2_13.test_enum_2;
import lab_2_13.test_enum_2.Rank.*;
import lab_2_13.test_enum_2.Suit.*;

/**
 * Created by olegpoberezhets on 3/24/17.
 */
public class Card {
    private Suit cardSuit;
    private Rank cardRank;

    public Card(Suit cardSuit, Rank cardRank) {
        this.cardSuit = cardSuit;                   //масть
        this.cardRank = cardRank;                   //value
    }

    @Override
    public String toString() {
        return "The Card: " + cardRank +  "_" + cardSuit;
    }
}
