package kg.geektech.game.players;

public class TrickyBastard extends Hero{
    public TrickyBastard(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.ACTOR);
    }

    @Override
    public void applySuperPower(Hero[] heroes, Boss boss) {
        if (getHealth() >= 251) {
            setHealth(0);
            setDamage(0);
        } else if (getHealth() < 250) {
            setHealth(getHealth());
            setDamage(getDamage());
        }
    }
}

