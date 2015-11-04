import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Jen Mart on 11/2/2015.
 */
public class Shuffle extends CardDeck { //extends CardDeck
    static String card = deck.get(0).toString();

    public static String PickACard(){
        //used to hand out an individual card to player or PC when requested.
       card = deck.get(0).toString();
        discard.add(deck.get(0)); //adds card to discard ArrayList...
        deck.remove(0); //..before removing it from the main deck
        return card;
    }
}
