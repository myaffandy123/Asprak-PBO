package ProjectUTP;

import java.util.Random;
import java.util.Scanner;

public class Arena {

    private Unit[] heroes;
    private Unit[] enemies;
    private static Scanner scan = new Scanner(System.in);
    private static Random rand = new Random();

    public Arena(Unit[] heroes, Unit[] enemies) {
        this.heroes = heroes;
        this.enemies = enemies;
    }

    public void start(int enemyLevel) {
        this.start(heroes[0].level, enemyLevel);
    }

    public void start(int heroLevel, int enemyLevel) {
        for (Unit hero : heroes) {
            hero.setLevel(enemyLevel);
        }
        for (Unit enemy : enemies) {
            enemy.setLevel(enemyLevel);
        }
        System.out.println("=================================== Fight Started ===================================\n");
        while (heroAlive() && enemyAlive()) {
            heroTurn();
            if (enemyAlive()) {
                enemyTurn();
            }
            resetAllEnergy();
        }
        System.out.println("=================================== Fight Ended ===================================");
        if (heroAlive()) {
            System.out.println("!!! YOU WIN !!!");
            for (Unit hero : heroes) {
                hero.levelUp();
            }
        } else {
            System.out.println("!!! YOU LOSE !!!");
        }
        System.out.println();
        wait(3000);
    }

    public void printStatus() {
        System.out.println("=================================== Heroes ====================================");
        for (Unit hero : heroes) {
            if (hero.isAlive()) {
                hero.print();
            }
        }
        System.out.println("=================================== Enemies ===================================");
        for (Unit enemy : enemies) {
            if (enemy.isAlive()) {
                enemy.print();
            }
        }
    }
    
    public void heroTurn() {
        System.out.println("!!! Heroes Turn !!!");
        wait(3000);
        for (Unit hero : heroes) {
            while (hero.isAlive() && enemyAlive()) {
                printStatus();
                System.out.println("Action for " + hero.name);
                System.out.println("- Attack <enemy name>\n- Recover\n- End");
                System.out.print("Select: ");
                String act = scan.next();
                if (act.equalsIgnoreCase("Attack")) {
                    String target = scan.nextLine().trim();
                    Unit targetEnemy = getEnemyByName(target);
                    hero.attack(targetEnemy);
                } else if (act.equalsIgnoreCase("Recover")) {
                    hero.recover();
                } else if (act.equalsIgnoreCase("End")) {
                    System.out.println();
                    wait(1000);
                    break;
                }
                System.out.println();
                wait(1000);
            }
        }
    }

    public void enemyTurn() {
        System.out.println("!!! Enemy Turn !!!");
        wait(3000);
        for (Unit enemy : enemies) {
            while (enemy.isAlive() && heroAlive() && enemy.energy > 0) {
                printStatus();
                wait(1500);
                int act = rand.nextInt(5);
                while (true) {
                    int iHero = rand.nextInt(heroes.length);
                    if (act < 2 && enemy.health < enemy.maxHealth) {
                        enemy.recover();
                        break;
                    } else if (heroes[iHero].isAlive()) {
                        enemy.attack(heroes[iHero]);
                        break;
                    }
                }
                System.out.println();
                wait(1500);
            }
        }
    }

    private void resetAllEnergy() {
        for (Unit hero : heroes) {
            hero.resetEnergy();
        }
        for (Unit enemy : enemies) {
            enemy.resetEnergy();
        }
    }

    private boolean heroAlive() {
        for (Unit hero : heroes) {
            if (hero.isAlive()) {
                return true;
            }
        }
        return false;
    }

    private boolean enemyAlive() {
        for (Unit enemy : enemies) {
            if (enemy.isAlive()) {
                return true;
            }
        }
        return false;
    }

    public Unit getEnemyByName(String name) {
        for (Unit enemy : enemies) {
            if (name.equalsIgnoreCase(enemy.name)) {
                return enemy;
            }
        }
        return null;
    }

    private static void wait(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
}
