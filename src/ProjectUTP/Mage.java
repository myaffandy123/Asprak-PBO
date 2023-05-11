package ProjectUTP;

public class Mage extends Unit {

    public Mage(String name, double maxHealth, double maxEnergy, double attack) {
        super(name, maxHealth, maxEnergy, attack);
    }

    public Mage(String name, double maxHealth, double maxEnergy, double attack, int level) {
        super(name, maxHealth, maxEnergy, attack, level);
    }

    @Override
    public void attack(Unit unit) {
        if (unit == null) {
            System.out.println(">>> Enemy does not exist");
            return;
        }
        if (unit.health <= 0) {
            System.out.println(">>> Enemy is already dead");
            return;
        }
        if (energy > 0) {
            double damageTaken = 0;
            if (unit instanceof Tank) {
                damageTaken = unit.takeDamage(attack + ((Tank) unit).armor);
            } else {
                damageTaken = unit.takeDamage(attack);
            }
            System.out.printf(">>> %s attack %s for %.0f magic damage\n", name, unit.name, damageTaken);
            if (!unit.isAlive()) {
                System.out.printf(">>> %s is killed\n", unit.name);
            }
            energy--;
        } else {
            System.out.println(">>> Cannot attack: Low energy");
        }
    }

    @Override
    public void print() {
        System.out.printf("%-12s: Lvl = %d | HP = %3.0f/%3.0f | EP = %.0f/%.0f | AP = %3.0f | S = Ignore Armor\n",
                name, level, health, maxHealth, energy, maxEnergy, attack);
    }
}
