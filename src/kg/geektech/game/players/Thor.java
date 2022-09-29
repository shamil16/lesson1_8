package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

public class Thor extends Hero{
        public Thor(int health, int damage, String name) {
            super(health, damage, name, SuperAbility.STUN);
        }

        @Override
        public void applySuperPower(Hero[] heroes, Boss boss) {
            int stun= RPG_Game.random.nextInt(11)+1;
            if (stun>1){
                boss.setDamage(0);
                System.out.println("Boss got stunned for 1 round");
            }else
                boss.setDamage(boss.getDamage());{
            }
        }
    }
