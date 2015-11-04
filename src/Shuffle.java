import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Jen Mart on 11/2/2015.
 */
public class Shuffle extends CardDeck {
    static String card = deck.get(0).toString();


//    private Shuffle(){
//        String card = deck.get(0).toString();
//        playerOne.add(cardDeck.getDeck().get(0)); //Lets make it simple, no one likes a showoff.
//        discard.add(deck.get(0));
//        deck.remove(0);
//
//    }
//
//    protected ArrayList shuffleCards(String[] ranks, String[] suits){
//        ArrayList<String> genDeck = new ArrayList<String>();
//        String card = "";
//
//        while (genDeck.size() <= 51) { //While loop to stop after 52 cards
//            Random random = new Random();
//            //Randomly selects a rank and suit and combines them into a string
//            card = ranks[random.nextInt(13)].toString() + " of " + suits[random.nextInt(4)].toString();
//            if (!genDeck.contains(card)) { //Only adds card to deck ArrayList if card isn't already present
//                genDeck.add(card);
//            }
//        }
//        return genDeck;
//
//    }

    public static String PickACard(){ //Get a case of the squiggles when I try.
        //Not possible to access another class out of main???
//        CardDeck cardDeck = new CardDeck();
       card = deck.get(0).toString();
//        playerOne.add(cardDeck.getDeck().get(0)); //Lets make it simple, no one likes a showoff.
        discard.add(deck.get(0));
        deck.remove(0);
        return card;
    }
}
