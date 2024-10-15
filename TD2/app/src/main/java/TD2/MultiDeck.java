package TD2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MultiDeck {
    private List<Deck> decks  = new ArrayList<>();
    public MultiDeck( int nbDecks){
        decks = new ArrayList<Deck>();
        for (int i=1; i<= nbDecks ; i++)
        {decks.add(new Deck());}
    }

    public MultiDeck( MultiDeck multiDeck){
        decks = new ArrayList<>();
        for (Deck deck : multiDeck.decks){
            this.decks.add(new Deck(deck));
        }
    }
    Optional<Card> draw(){
        Optional<Deck> premierDeckPasVide = decks.stream()
                                            .filter((Deck deck) -> !deck.isEmpty()) // Filter for non-empty decks
                                            .findFirst(); // Get the first available non-empty deck
        if (premierDeckPasVide.isPresent())
        {
            return premierDeckPasVide.get().draw();        }
        else
        {
            return Optional.empty();
        }
                                         
    }
    int size(){
        return decks.stream().map(Deck::size).reduce(0,(a,b)-> a+b);
    }
    boolean isEmpty(){
        return decks.stream().allMatch(Deck::isEmpty);
    }

}
