package mid2.collection.compare.test;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> cards = new ArrayList<>();
    public Deck() {
        CardType[] cardTypes = CardType.values();
        for (CardType cardType : cardTypes) {
            for (int i = 1; i <= 13; i++) {
                cards.add(new Card(i, cardType));
            }
        }
    }
    public void shuffleDeck() {
        Collections.shuffle(cards);
    }

    public Card pickCard() {
        Card card = cards.getLast();
        cards.remove(cards.size() - 1);
        return card;
    }
}
