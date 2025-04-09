package mid2.collection.compare.test;

public class Card implements Comparable<Card> {
    private int number;
    private CardType cardType;

    public Card(int number, CardType cardType) {
        this.number = number;
        this.cardType = cardType;
    }
    public int getNumber() {
        return number;
    }
    @Override
    public String toString() {
        return number + "(" + cardType.getCardShape() + ")";
    }
    @Override
    public int compareTo(Card o) {
        if (this.number == o.number) {
            return this.cardType.getPriority() - o.cardType.getPriority();
        }
        return this.number - o.number;
    }
}
