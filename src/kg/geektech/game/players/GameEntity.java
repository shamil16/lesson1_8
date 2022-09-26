package kg.geektech.game.players;

public class GameEntity {
    private int health;
    private int damage;
    private String name;

    public GameEntity(String name, int health, int damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public int setHealth(int health) {
        if (health < 0) {
            this.health = 0;
        } else {
            this.health = health;
        }
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public int setDamage(int damage) {
        this.damage = damage;
        return damage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

