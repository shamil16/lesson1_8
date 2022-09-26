package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

public class Antman extends Hero{
    public Antman(String name, int health, int damage) {
        super(name, health, damage, SuperAbility.SIZE);
    }
    @Override
    public void applySuperPower(Hero[] heroes, Boss boss) {
        boolean chance = RPG_Game.random.nextBoolean();
        int health = this.setHealth(this.getHealth());
        int damage = this.setDamage(this.getDamage());
        for (int i = 0; i < heroes.length; i++) {
            if (chance ==true){
                this.setHealth(health + 50);
                this.setDamage(damage + 50);
                System.out.println("Antman increased");
                break;
            }else if (chance == false){
                this.setHealth(health - 50);
                this.setDamage(damage - 50);
                System.out.println("Antman decreased");
                break;
            }
        }
    }
}




