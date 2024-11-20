package Monsters;

public abstract class Monster {
    protected int life;
    protected int damage;
    protected boolean isDead;

    public int getDamage() {
        return damage;
    }

    public void setDead(boolean dead) {
        isDead = dead;
    }

    public void attack() {
        this.life -= damage;
    }


}

