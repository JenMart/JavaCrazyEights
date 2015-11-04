

import java.util.*;

/**
 * Created by jensinamart on 10/19/15.
 */
public class CardDeck {

    static String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
    static String[] suits = {"Spade", "Heart", "Club", "Diamond"};
    public static ArrayList deck = shuffleCards(ranks, suits);//Takes ranks and suits and sends them to method.
    public ArrayList getDiscard() {
        return discard;
    }
    public void setDiscard(ArrayList discard) {
        this.discard = discard;
    }
    public static ArrayList discard = new ArrayList();


    protected static ArrayList shuffleCards(String[] ranks, String[] suits){
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

}
