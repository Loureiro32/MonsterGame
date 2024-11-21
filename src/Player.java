import Monsters.Monster;

public class Player {
    protected int maxCards = 4;
    protected Monster[] monsters = new Monster[maxCards];
    protected String name;
    protected Monster[] cardsAlive;
    protected int aliveCounter;
    private boolean noCard;


    public Player(String name) {
        this.name = name;
    }

    //* storeCard complete saving Monsters for players.
    public static void storeCard(Player player) {
        Monster[] currentPlayerCards = player.monsters;
        int cardCounter = 0;
        if (cardCounter < maxCards) {
            for (int i = 0; i < currentPlayerCards.length; i++) {
                if (currentPlayerCards[i] == null) {
                    currentPlayerCards[i] = Game.dealCard();
                    cardCounter++;
                }
            }
        } else {
            System.out.println("No slots avaible to store more cards!!");
        }
    }

    public boolean hasNoCard() {
        return noCard;
    }
}
