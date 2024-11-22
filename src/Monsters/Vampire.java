package Monsters;

public class Vampire extends Monster {
    int lifeRegen = 23;

    public Vampire() {
        super();
        life = 1000;
        damage = 125;
    }

    public void bite() {
        int chance = (int) (Math.random() * 100) + 1;
        if (life <= 560 && chance <= 20) {
            life += lifeRegen;
        }
    }

}
