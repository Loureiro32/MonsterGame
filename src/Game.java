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
        int probability = (int) (Math.random() * 100 + 1);
        if (probability <= 2) {
            return new Vampire();
        } else if (probability <= 60) {
            return new Warewolf();
        } else {
            return new Mummy();
        }
    }

    public void playerHands() {
        for (Player player : players) {

            for (int i = 0; i < Player.maxCards; i++) {
                Monster newCard = dealCard();
                player.monsters[i] = newCard;
            }
            player.numberOfCardsAlive = Player.maxCards;
            player.updateAliveCards();

            System.out.println(player.name + " starts with " + player.numberOfCardsAlive + " monsters:");
            for (Monster monster : player.monsters) {
                System.out.println("- " + monster.getClass().getSimpleName());
            }
        }
    }

    public void startGame() {
        System.out.println("=== Game Starting ===");
        playGame();
    }

    private void playGame() {
        Player player1 = players[0];
        Player player2 = players[1];
        
        while (!player1.hasNoCards() && !player2.hasNoCards()) {
            System.out.println("\nRound : " + (roundTrack + 1));
            round(player1, player2);
            roundTrack++;
            System.out.println(player1.name + " has " + player1.numberOfCardsAlive + " monsters alive");
            System.out.println(player2.name + " has " + player2.numberOfCardsAlive + " monsters alive");
        }

        System.out.println("\n=== Game Over ===");
        if (player1.hasNoCards()) {
            System.out.println(player2.name + " wins with " + player2.numberOfCardsAlive + " monsters remaining!");
        } else {
            System.out.println(player1.name + " wins with " + player1.numberOfCardsAlive + " monsters remaining!");
        }
    }

    private void round(Player player1, Player player2) {

        //? Get the active and defending player based on round number

        Player activePlayer = (roundTrack % 2 == 0) ? player1 : player2;
        Player defendingPlayer = (roundTrack % 2 == 0) ? player2 : player1;

        //? Update alive cards for both players

        activePlayer.updateAliveCards();
        defendingPlayer.updateAliveCards();

        //? Select random monster from active player's alive cards

        Monster attackingMonster = null;
        Monster defendingMonster = null;

        if (activePlayer.aliveCounter > 0) {
            int attackerIndex = (int) (Math.random() * activePlayer.aliveCounter);
            attackingMonster = activePlayer.aliveCards[attackerIndex];
        }

        if (defendingPlayer.aliveCounter > 0) {
            int defenderIndex = (int) (Math.random() * defendingPlayer.aliveCounter);
            defendingMonster = defendingPlayer.aliveCards[defenderIndex];
        }

        if (attackingMonster != null && defendingMonster != null) {
            System.out.println(activePlayer.name + "'s " + attackingMonster.getClass().getSimpleName() +
                    " attacks " + defendingPlayer.name + "'s " + defendingMonster.getClass().getSimpleName());
            attackingMonster.attack(defendingMonster);
            activePlayer.updateAliveCards();
            defendingPlayer.updateAliveCards();
        }
    }

    //! TODO
    //* Create Rounds && define players to play
    //todo Define Randomly what cards play for each player // +/-
    //todo each round update Monster life are taken the damage
    //* Create a method to create a game and run the game logic.


}

