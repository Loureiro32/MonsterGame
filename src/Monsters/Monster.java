package Monsters;

public abstract class Monster {

    protected int life;
    protected int damage;
    protected boolean isDead;

    public int getDamage() {
        return damage;
    }

    public boolean setDead() {
        return isDead;
    }

    public void attack() {
        this.life -= damage;
    }


}

