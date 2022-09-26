package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

public class Warrior extends Hero{

    public Warrior(String name, int health, int damage) {
        super(name, health, damage, SuperAbility.CRITICAL_DAMAGE);
    }

    @Override
    public void applySuperPower(Hero[] heroes, Boss boss) {
        int  coeff = RPG_Game.random.nextInt(4) + 1;
        boss.setHealth(boss.getHealth() - this.getDamage() * coeff);
        System.out.println("Warrior inflicts critically " + this.getDamage() * coeff);
    }
}


