import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by jensinamart on 10/19/15.
 */
public class Players{

    ArrayList playerOne = new ArrayList();
    ArrayList pcPlayer = new ArrayList();

    public Players(){
        for (int y = 0; y < 7; y++){
            playerOne.add(Shuffle.PickACard());
            pcPlayer.add(Shuffle.PickACard());
        }
    }

    public ArrayList getPlayerOne() {
        return playerOne;
    }

    public void setPlayerOne(ArrayList playerOne) {
        this.playerOne = playerOne;
    }

    public ArrayList getPcPlayer() {
        return pcPlayer;
    }

    public void setPcPlayer(ArrayList pcPlayer) {
        this.pcPlayer = pcPlayer;
    }

    public static void ShowHand(ArrayList hand){
        for (int y = 0; y <hand.size() ; y++){
            System.out.println("card " + (y+1) + ". " + hand.get(y));
        }
    }
//
//   protected Hand playHand;
//    protected String playName;
//    protected boolean win;
//
//    public Players (){
//        this.playHand = new Hand();
//        this.playName = "";
//    }
//
//    public Players (String name){
//        this.playName = name;
//        this.playHand = new Hand();
//        this.win = false;
//    }
//
//    public Players (Hand hand) {
//        this.playHand = hand;
//    }
//
//    public Players (LinkedList<Card> hand){
//        this.playHand = new Hand(hand);
//    }
//
//    public Players(Hand playHand, String playName) {
//        this.playHand = playHand;
//        this.playName = playName;
//    }
//
//    public Hand getPlayHand() {
//        return playHand;
//    }
//
//    public String getPlayName() {
//        return playName;
//    }
//
//    public boolean getWin() { return win; }
//
//    public void setPlayHand(Hand playHand) {
//        this.playHand = playHand;
//    }
//
//    public void setPlayName(String playName) {
//        this.playName = playName;
//    }
//
//    public void setWin(boolean winVal) { this.win = winVal; }
//
//    public void showPlayHand(){
//        int cardCount = 1;
//        if (moreCards()) {
//            System.out.println(playName + "'s hand is:");
//            for (Card card : playHand.getCards()) {
//                System.out.println("\t" + cardCount + ": " + card);
//                cardCount++;
//            }
//        }
//    }
//
//    public boolean moreCards() {
//        if (playHand.getCards().size() > 0) {
//            return true;
//        } else {
//            System.out.println(playName + " has no more cards.");
//            return false;
//        }
//    }
}
