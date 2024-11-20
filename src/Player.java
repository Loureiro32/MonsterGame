import Monsters.Monster;

public class Player {
    protected int maxCards = 4;
    protected Monster[] monsters = new Monster[maxCards];
    protected String name;


    public Player(String name) {
        this.name = name;
    }

    //todo Save objects in array

    public static void storeCard(Player player) {
        Monster[] currentPlayerCards = player.monsters;
        for (int i = 0; i < currentPlayerCards.length; i++) {
            if (currentPlayerCards[i] == null) {
                currentPlayerCards[i] = Game.dealCard();
            }
        }
    }

}
