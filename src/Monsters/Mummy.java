package Monsters;

public class Mummy extends Monster {
    int counter = 0;

    public Mummy() {
        super();
        life = 485;
        damage = 15;
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
