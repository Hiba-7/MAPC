package TD2;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a new Deck instance
        Deck deck = new Deck();
        
        // Get the list of cards from the deck
        List<Card> cards = deck.getCards();
        
        // Add a new Card to the list
        cards.add(new Card(Card.Suit.HEARTS, Card.Rank.ACE));
        
        // Optionally print the cards to verify
        System.out.println(cards);
    }
}
