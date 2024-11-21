import Monsters.Monster;
import Monsters.Mummy;
import Monsters.Vampire;
import Monsters.Warewolf;


public class Game {
    protected Player[] players = new Player[2];

    //todo Review how can save Monsters in Players Array?.

    public Game() {
        this.players[0] = new Player("Player 1");
        this.players[1] = new Player("Player 2");

    }

    //! Review this to do implementation on #storeCards function
    //create a Single Monster Card.
    public static Monster dealCard() {
        int scope = (int) (Math.random() * 100 + 1);
        if (scope <= 2) {
            return new Vampire();
        } else if (scope <= 60) {
            return new Warewolf();
        } else {
            return new Mummy();
        }
    }


}

