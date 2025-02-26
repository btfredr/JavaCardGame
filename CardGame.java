// Imports
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CardGame {
    public void main(String[] args) {
        // Making a list that will contain every card in the stack
        List<Card> deck = new ArrayList<>();

        // Listing different symbols
        String[] symbols = {"Hearts", "Diamonds", "Clubs", "Spades"};
    }

    // This class represents a card
    // Each card has it's own symbol, and a value

    static class Card {
        String symbol; // Card symbol
        String rank; // Card name, 1, 2, 3, Q, K, J etc. 
        int value; // Card number value used to decide who has the highest card

        // When making a new Card, assign it a name, symbol and a value
        Card(String symbol, String rank, int value) {
            this.symbol = symbol;
            this.rank = rank;
            this.value = value;
        };

        // This methods writes the card out as text
        public String toString() {
            return rank + " of " + symbol;
        }
    }




}