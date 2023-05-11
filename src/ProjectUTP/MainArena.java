package ProjectUTP;

import java.util.Random;

public class MainArena {

    public static void main(String[] args) throws Exception {
        Unit assH = new Assassin("Terrorblade", 75, 2, 28, 8);
        Unit mageH = new Mage("Silencer", 100, 3, 21);
        Unit[] heroes = { assH };

        Unit tankE = new Tank("Axe", 120, 3, 13, 5);
        Unit assE = new Assassin("Morphling", 80, 2, 20, 6);
        Unit mageE = new Mage("Rubick", 90, 2, 18);
        Unit[] enemies = { tankE, assE };

        Arena arena = new Arena(heroes, enemies);

        arena.start(1);
    }
}
