package kg.geektech.game.players;

public class Berserk extends Hero{
        private int savedDamage;

        public Berserk(int health, int damage, String name) {
            super(health, damage, name, SuperAbility.SAVE_DAMAGE_AND_REVERT);
        }

        @Override
        public void applySuperPower(Hero[] heroes, Boss boss) {
            this.savedDamage = boss.getDamage() - 30;
            boss.setHealth(boss.getHealth()-(this.getDamage() + this.savedDamage)) ;
            System.out.println("Revert damage: " + (this.getDamage() + this.savedDamage));
        }

        public int getSavedDamage() {
            return savedDamage;
        }

        public void setSavedDamage(int savedDamage) {
            this.savedDamage = savedDamage;
        }
    }
