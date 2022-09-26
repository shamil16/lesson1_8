package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

public class Hacker extends Hero {
    public Hacker(String name, int health, int damage) {
        super(name, health, damage, SuperAbility.HACK);
    }

    @Override
    public void applySuperPower(Hero[] heroes, Boss boss) {
        int damage = boss.getHealth() - RPG_Game.random.nextInt(200);
        for (int i = 0; i < heroes.length; i++) {
            i = RPG_Game.random.nextInt(heroes.length);
            heroes[i].setHealth(heroes[i].getHealth() + damage);
            System.out.println("Haсker take health boss");
            break;
        }
    }
}