package TD2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Deck {
    private List<Card> cards;
    public Deck() { // ajouter 52 cartes + mélanger
        cards  = new ArrayList<>();
        for (Card.Suit suit : Card.Suit.values()){
            for (Card.Rank rank : Card.Rank.values()){
                cards.add(new Card(suit,rank));
            }
    }
    }
    public Deck(Deck deck) {
        cards = deck.getCards();
    }
    
    public List<Card> getCards() {
        return cards;
    }

    public int size() {
        return cards.size();
    }

    public boolean isEmpty() { // Use primitive boolean instead of Boolean
        return cards.size() == 0; // Simplified check
    }
    public Optional<Card> cardAt(int index){
        assert index >= 0 && index < cards.size();
        if (index >= 0 && index < cards.size())
        {
            return Optional.of(cards.get(index));

        }
        else 
        {return Optional.empty();}
    }
    public Optional<Card> draw()
    {   assert !isEmpty();
        if (isEmpty())
        {return Optional.empty();}
        else {
            return Optional.of(cards.remove(0));
        }
    }
    public Card getCard(int pIndex)
    { return cards.get(pIndex); }
     @Override
    public String toString() {
        return cards.stream()
                    .map(Card::toString) // Corrected to use the method reference
                    .collect(Collectors.joining("\n")); // Fixed the method call and syntax
    }
}
