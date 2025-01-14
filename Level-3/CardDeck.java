import java.util.Arrays;
import java.util.Random;

public class CardDeck {

    // Arrays for suits and ranks
    private static final String[] SUITS = {"Hearts", "Diamonds", "Clubs", "Spades"};
    private static final String[] RANKS = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

    // Method to initialize the deck of cards
    public static String[] initializeDeck() {
        // Total number of cards in the deck
        int numOfCards = SUITS.length * RANKS.length;
        String[] deck = new String[numOfCards];

        int index = 0;
        // Initialize the deck with all combinations of ranks and suits
        for (String suit : SUITS) {
            for (String rank : RANKS) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    // Method to shuffle the deck
    public static String[] shuffleDeck(String[] deck) {
        Random random = new Random();
        // Shuffle the deck using the Fisher-Yates algorithm
        for (int i = 0; i < deck.length; i++) {
            int randomCardIndex = i + random.nextInt(deck.length - i);  // Get a random index
            String temp = deck[i];  // Swap the cards
            deck[i] = deck[randomCardIndex];
            deck[randomCardIndex] = temp;
        }
        return deck;
    }

    // Method to distribute the deck among players
    public static String[][] distributeDeck(String[] deck, int numOfCards, int numOfPlayers) {
        if (numOfCards % numOfPlayers != 0) {
            System.out.println("The cards cannot be evenly distributed to the players.");
            return null;
        }

        int cardsPerPlayer = numOfCards / numOfPlayers;
        String[][] playersCards = new String[numOfPlayers][cardsPerPlayer];

        // Distribute cards to each player
        for (int i = 0; i < numOfPlayers; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                playersCards[i][j] = deck[i * cardsPerPlayer + j];
            }
        }
        return playersCards;
    }

    // Method to print the players' cards
    public static void printPlayersCards(String[][] playersCards) {
        if (playersCards == null) {
            return;
        }

        // Print each player's cards
        for (int i = 0; i < playersCards.length; i++) {
            System.out.print("Player " + (i + 1) + ": ");
            System.out.println(Arrays.toString(playersCards[i]));
        }
    }

    public static void main(String[] args) {
        int numOfPlayers = 4;  // Set the number of players
        int numOfCards = 52;   // Total number of cards in the deck (standard deck)

        // Initialize and shuffle the deck
        String[] deck = initializeDeck();
        deck = shuffleDeck(deck);

        // Distribute the cards among players
        String[][] playersCards = distributeDeck(deck, numOfCards, numOfPlayers);

        // Print the cards that each player has
        printPlayersCards(playersCards);
    }
}
