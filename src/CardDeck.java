import java.util.*;

/**
 * Created by jensinamart on 10/19/15.
 */
public class CardDeck {

    String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
    String[] suits = {"Spade", "Heart", "Club", "Diamond"};


    public ArrayList deck = shuffle(ranks, suits);


    private ArrayList shuffle(String[] ranks, String[] suits){
    ArrayList<String> genDeck = new ArrayList<String>();
    String card = "";

    while (genDeck.size() <= 51) { //While loop to stop after 52 cards
        Random random = new Random();
        //Randomly selects a rank and suit and combines them into a string
        card = ranks[random.nextInt(13)].toString() + " of " + suits[random.nextInt(4)].toString();
        if (!genDeck.contains(card)) { //Only adds card to deck ArrayList if card isn't already present
            genDeck.add(card);
        }
    }
        return genDeck;

    }


    public ArrayList getDeck() {
        return deck;
    }
    public void setDeck(ArrayList deck) {
        this.deck = deck;
    }
//    System.out.println("Done! Total cards are " + deck.size());
//    System.out.println("Price 0 to draw a card");
//    x = scanner.nextInt();
//    while (x == 0){ //Allows user to randomly select a card from the deck.
//        Random random = new Random();
//        System.out.println(deck.get(random.nextInt(52)));
//        System.out.println("Price 0 to draw a card");
//        x = scanner.nextInt();
//    }


}
