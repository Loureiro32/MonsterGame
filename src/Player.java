import Monsters.Monster;

public class Player {
    protected static int maxCards = 4;
    protected Monster[] monsters = new Monster[maxCards];
    protected String name;
    protected int numberOfCardsAlive;
    protected Monster[] aliveCards;
    protected int aliveCounter;


    public Player(String name) {
        this.name = name;
    }

    public boolean hasNoCards() {
        return numberOfCardsAlive == 0;
    }

    public void updateAliveCards() {
        int aliveCount = 0;
        for (Monster monster : monsters) {
            if (monster != null && !monster.isDead()) {
                aliveCount++;
            }
        }
        numberOfCardsAlive = aliveCount;
        aliveCards = new Monster[aliveCount];
        aliveCounter = 0;
        for (Monster monster : monsters) {
            if (monster != null && !monster.isDead()) {
                aliveCards[aliveCounter++] = monster;
            }
        }
    }
}
