package mid2.collection.compare.test;

import java.util.Collections;

public class CardGameMain {
    public static void main(String[] args) {
        Deck deck = new Deck();
        Player player1 = new Player("플레이어1");
        Player player2 = new Player("플레이어2");

        deck.shuffleDeck();
        player1.pickCards(deck);
        player2.pickCards(deck);
        player1.printCards();
        player2.printCards();
        if (player1.compareTo(player2)==0) {
            System.out.println("무승부");
        }else if (player1.compareTo(player2) > 0) {
            System.out.print(player1.getName()+" 승리");
        }else{
            System.out.print(player2.getName() + " 승리");
        }
    }
}
