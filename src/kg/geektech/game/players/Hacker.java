package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

public class Hacker extends Hero {
    private int theftHealth;
    private boolean theft= false;

    public Hacker(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.THEFT);
    }

    @Override
    public void applySuperPower(Hero[] heroes, Boss boss) {
        this.theftHealth=16;
        for (int i = 0; i < heroes.length; i++) {
            if (theft) {
                boss.setHealth(boss.getHealth() - this.theftHealth);
                heroes[i].setHealth(getHealth() + this.theftHealth);
                System.out.println("Thief stole hp from Boss: " + this.theftHealth);
                theft = false;
            }else theft = true;
            break;
        }
    }
}
