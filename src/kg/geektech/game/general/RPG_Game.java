package kg.geektech.game.general;

import kg.geektech.game.players.*;

import java.util.Random;

public class RPG_Game {
    public static Random random = new Random();
    private static int round_number;

    public static void startGame() {
        Boss boss = new Boss(2500, 50, "Boke");
        Warrior warrior = new Warrior(270, 10, "Albert");
        Medic doc = new Medic(250, 0, "Aibolit", 15);
        Magic magic = new Magic(260, 15, "Gendelf");
        Berserk berserk = new Berserk(280, 20, "Ahiles");
        Medic assistant = new Medic(290, 5, "Strange", 5);
        Witcher witcher = new Witcher(350,0,"Geralt");
        Hacker hacker = new Hacker(200,0,"Thief");
        TrickyBastard trickyBastard = new TrickyBastard(300,12,"Lutic");
        Thor thor = new Thor(260,10,"Blondy");
        Hero[] heroes = {warrior, doc, magic, berserk, assistant,witcher,hacker,trickyBastard};

        printStatistics(heroes, boss);
        while (!isGameFinished(heroes, boss)) {
            playRound(heroes, boss);
        }
    }

    private static void playRound(Hero[] heroes, Boss boss) {
        round_number++;
        boss.chooseDefence(heroes);
        boss.attack(heroes);

        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getAbilityType() != boss.getDefenceType()
                    && boss.getHealth() > 0 && heroes[i].getHealth() > 0) {
                heroes[i].attack(boss);
                heroes[i].applySuperPower(heroes, boss);
            }
        }
        printStatistics(heroes, boss);
    }

    private static void printStatistics(Hero[] heroes, Boss boss) {
        System.out.println("ROUND " + round_number + " ----------");
        System.out.println(boss);
        for (int i = 0; i < heroes.length; i++) {
            System.out.println(heroes[i]);
        }
    }

    private static boolean isGameFinished(Hero[] heroes, Boss boss) {
        if (boss.getHealth() <= 0) {
            System.out.println("Heroes won!!!");
            return true;
        }
        boolean allHeroesDead = true;
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0) {
                allHeroesDead = false;
                break;
            }
        }
        if (allHeroesDead) {
            System.out.println("Boss won!!!");
        }
        return allHeroesDead;
    }
}
