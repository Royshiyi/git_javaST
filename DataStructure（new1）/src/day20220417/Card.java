package day20220417;

public class Card {
    char suit;
    String rank;

    public Card(char suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "[" + suit + "," + rank + "]";
    }
}
