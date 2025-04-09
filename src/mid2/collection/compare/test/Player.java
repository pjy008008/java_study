package mid2.collection.compare.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Player implements Comparable<Player> {
    private String name;
    private Card[] playerCards = new Card[5];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void pickCards(Deck deck) {
        for (int i = 0; i < 5; i++) {
            playerCards[i]=deck.pickCard();
        }
    }

    public void printCards() {
        Arrays.sort(playerCards);
        int total=0;
        System.out.print(name+"의 카드: [");
        for (int i=0;i<playerCards.length;i++) {
            total += playerCards[i].getNumber();
            if(i<playerCards.length-1){
                System.out.print(playerCards[i]+", ");
            }else{
                System.out.print(playerCards[i]);
            }
        }
        System.out.println("], 합계: "+total);
    }
    @Override
    public int compareTo(Player o) {
        int player1Total = 0;
        int player2Total = 0;
        for (int i=0;i<playerCards.length;i++) {
            player1Total += this.playerCards[i].getNumber();
            player2Total += o.playerCards[i].getNumber();
        }
        return player1Total-player2Total;
    }
}
