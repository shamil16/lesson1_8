package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

public class Witcher extends Hero{
    public Witcher(String name, int health, int damage) {
        super(name, health, damage, SuperAbility.SACRIFICE);
    }
    @Override
    public void applySuperPower(Hero[] heroes, Boss boss) {
        boolean chance = RPG_Game.random.nextBoolean();
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() == 0 && heroes[i] != this && chance == true) {
                int hp = this.setHealth(this.getHealth());
                heroes[i].setHealth(hp);
                this.setHealth(0);
                System.out.println("Witcher gave his life to the hero: " + heroes[i].getName());
                break;
            }
        }
    }
}
