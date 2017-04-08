package lab_2_13.test_enum_2;

import lab_2_13.test_enum_2.Rank.*;
import lab_2_13.test_enum_2.Suit.*;


/**
 * Create new project called TestEnum2. Add package “com.brainacad.oop.testenum2”.
 * Create a class Main with a main().
 * Create two enum type: Suit (which have SPADE, DIAMOND, CLUB, HEART) and
 * Rank (which have ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN,
 * JACK, QUEEN, KING values}.
 * Create class Card which has two private fields:
 * cardSuit of Suit type and cardRank of Rank type.
 * Add to Card constructor with cardSuit and cardRank arguments.
 * In class Card override toString() method to return full name of card.
 * In method main() create and fill (using nested loops) array of Card objects
 * (standard 52- card deck).
 * Add code which iterate over Card array and print full card name to console.
 * The Card: KING_HEART
 * ...
 * The Card: QUEEN_DIAMOND
 * <p>
 * Created by olegpoberezhets on 3/24/17.
 */
public class Main {
    public static void main(String[] args) {
        Card[][] cards = new Card[4][16];

        for (int i = 0; i < Suit.values().length; i++) {

            for (int j = 0; j < Rank.values().length; j++) {
                cards[i][j] = new Card(Suit.values()[i], Rank.values()[j]);
            }
        }
        for (int i = 0; i < Suit.values().length; i++) {

            for (int j = 0; j < Rank.values().length; j++) {
                System.out.println(cards[i][j].toString());
            }
        }
    }
}
