package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

public class Magic extends Hero{
    public Magic(String name, int health, int damage) {
        super(name, health, damage, SuperAbility.BOOST);
    }

    @Override
    public void applySuperPower(Hero[] heroes, Boss boss) {
        if (this.getHealth() > 0 && boss.getHealth() > 0) {
            int boost = RPG_Game.random.nextInt(5) + 2;
            int heroIndex = RPG_Game.random.nextInt(heroes.length);
            if (heroes[heroIndex].getHealth() > 0) {
                heroes[heroIndex].setDamage(heroes[heroIndex].getDamage() + boost);
                System.out.println("Magic boosted " + heroes[heroIndex].getName());
            }
        }
    }
}

