package TD2;
public class Card {
    public enum Rank {
        ACE,    // Typically referred to as "Ace"
        TWO,
        THREE,
        FOUR,
        FIVE,
        SIX,
        SEVEN,
        EIGHT,
        NINE,
        TEN,
        JACK,
        QUEEN,
        KING;
    }

    public enum Suit {
        CLUBS,
        DIAMONDS,
        HEARTS,
        SPADES;
    }

    private Suit suit; 
    private Rank rank; 

    public Card(Suit suit, Rank rank) {
        assert suit != null ;
        assert rank != null ;
        this.suit = suit;
        this.rank = rank;
    }   

    public Suit getSuit() {
        return suit;
    }

    public Rank getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return rank + " of " + suit;
    }
}
