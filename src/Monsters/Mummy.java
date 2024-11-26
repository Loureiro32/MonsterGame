package Monsters;

public class Mummy extends Monster {
    int counter = 0;

    public Mummy() {
        super();
        life = 420;
        damage = 35;
    }

    @Override
    public void attack(Monster defendingMonster) {
        if (counter >= 3) {
            System.out.println("Missed!!");
            return;
        }
        this.life -= damage;
        counter++;
    }

}
