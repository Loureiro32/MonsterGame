package Monsters;

public abstract class Monster {

    protected int life;
    protected int damage;

    public boolean isDead() {
        return life <= 0;
    }

    public void attack(Monster defendingMonster) {
        defendingMonster.life -= damage;
    }


}

