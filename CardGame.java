// Imports
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CardGame {
    public static void main(String[] args) {
        // Making a list that will contain every card in the stack
        List<Card> deck = new ArrayList<>();

        // Listing different symbols
        String[] symbols = {"Hearts", "Diamonds", "Clubs", "Spades"};

        // Listing different card names
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14"};

        // Listing the number values
        // For example 2 is 2, J is 11, and A is 14.
        int[] values = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};


        // Adding all cards to the stack
        // Going through each symbol, and for each symbol, the card names.

        for (String symbol : symbols) {
            for (int i = 0; i < ranks.length; i++) {
                // Making a new card with a name, symbol and value
                Card card = new Card(ranks[i], symbol, values[i]);
                deck.add(card); // Adding the new card to the stack.
            }
        }

    // Shuffling the cards to ensure that they are in random order
    Collections.shuffle(deck);

    // Giving a card to player 1 by grabbing the card that's on top of the stack
    Card player1Card = deck.remove(0);

    // Giving a card to player 2 by grabbing the next card.
    Card player2Card = deck.remove(0);


    // Telling user which cards the players got
    System.out.println("Player 1 recieved: " + player1Card);
    System.out.println("Player 2 recieved: " + player2Card);

    // Comparing the card values to see who won
    if (player1Card.value > player2Card.value) {
        System.out.print("Player 1 won!");
    } else if (player2Card.value > player1Card.value) {
        System.out.print("Player 2 won!");
    } else {
        System.out.print("It's a draw!");
    }
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