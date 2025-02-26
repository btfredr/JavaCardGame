// Imports
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CardGame {
    public void main(String[] args) {

    }

    // This class represents a card
    // Each card has it's own symbol, and a value

    static class Card {
        String color; // Card symbol
        String rank; // Card name, 1, 2, 3, Q, K, J etc. 
        int value; // Card number value used to decide who has the highest card
    }
}