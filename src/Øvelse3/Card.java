package Øvelse3;

import java.util.Random;

public class Card {

    int[] value = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
    String[] suit = {"Hearts", "Diamonds", "Spades", "Clubs"};


    public void beats() {
        Random random = new Random();
        int p1Value = random.nextInt(value.length);
        int p1Suit = random.nextInt(suit.length);

        int p2Value = random.nextInt(value.length);
        int p2Suit = random.nextInt(suit.length);

        if (p1Suit < p2Suit) { //[p1Suit] er elementets plads
            System.out.println(suit[p1Suit] + " " + value[p1Value] + " slår " +
                    suit[p2Suit] + " " + value[p2Value] + "\nDu vandt!");
        } else if (p1Suit == p2Suit && p1Value > p2Value) {
            System.out.println(suit[p1Suit] + " " + value[p1Value] + " slår " +
                    suit[p2Suit] + " " + value[p2Value] + "\nDu vandt!");
        } else {
            System.out.println(suit[p1Suit] + " " + value[p1Value] + " slår ikke " +
                    suit[p2Suit] + " " + value[p2Value] + "\nDu tabte :(");
        }
    }
}
