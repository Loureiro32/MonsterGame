import Monsters.Monster;
import Monsters.Mummy;
import Monsters.Vampire;
import Monsters.Warewolf;


public class Game {
    protected Player[] players = new Player[2];
    protected int roundTrack = 0;


    //todo Review how can save Monsters in Players Array?.

    public Game() {
        this.players[0] = new Player("Player 1");
        this.players[1] = new Player("Player 2");

    }

    //! Review this to do implementation on #storeCards function
    //create a Monsters Card from object creation.
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

    private void playGame() {
        Player player1 = players[0];
        Player player2 = players[1];

        while (player1.hasNoCard() && player2.hasNoCard()) {

            round(player1, player2);
            roundTrack++;
        }
    }

    private void round(Player player1, Player player2) {
        if (roundTrack % 2 == 0) {

        }
    }

    //! TODO AFTER lUNCH
    //todo Create Rounds && define players to play
    //todo Define Randomly what cards play for each player
    //todo If card life == 0 the cards cannot be summoned
    //todo each round update Monster life are taken the damage
    //! Create a method to create a game and run the game logic.


}

