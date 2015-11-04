import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by jensinamart on 10/19/15.
 */
public class Players{//Sets up player and PC with their hand.

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

}
