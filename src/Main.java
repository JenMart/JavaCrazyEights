import java.util.*;

/**
 * Created by jensinamart on 9/28/15.
 */
public class Main {
    public static void main(String[] args) {
//        String[] cardNum = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
//        String[] cardSuit = {"Hearts", "Spades","Clubs","Diamonds"};
//        ArrayList shuffle = new ArrayList();
        int x = 0;
        int y = 51;
        Scanner scanner = new Scanner(System.in);
        CardDeck cardDeck = new CardDeck();
//        System.out.println("Price 0 to draw a card");
//        x = scanner.nextInt();
        while (x == 0){ //Allows user to randomly select a card from the deck.
            Random random = new Random();
            System.out.println("Price 0 to draw a card");
            x = scanner.nextInt();
            int rand = random.nextInt(52 - y);
            System.out.println(cardDeck.getDeck().get(rand));
            y--;

            cardDeck.getDeck().remove(rand);
            System.out.println(cardDeck.getDeck().size());
        }

        System.out.println(cardDeck.getDeck().size());

        cardDeck.getDeck().remove(1);
        System.out.println(cardDeck.getDeck().size());
        ArrayList generatedDeck = cardDeck.getDeck();
        cardDeck.getDeck().add("bla");
    }
}
