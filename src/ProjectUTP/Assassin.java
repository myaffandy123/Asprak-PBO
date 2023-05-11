package ProjectUTP;

public class Assassin extends Unit {

    double bonusAttack;

    public Assassin(String name, double maxHealth, double maxEnergy, double attack, double bonusAttack) {
        super(name, maxHealth, maxEnergy, attack);
        this.bonusAttack = bonusAttack;
    }
    
    public Assassin(String name, double maxHealth, double maxEnergy, double attack, double bonusAttack, int level) {
        super(name, maxHealth, maxEnergy, attack, level);
        this.bonusAttack = bonusAttack;
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
            double damageTaken = unit.takeDamage(attack);
            Double bonusDamageTaken = unit.takeDamage(bonusAttack);
            System.out.printf(">>> %s attack %s for %.0f + %.0f damage\n", name, unit.name, damageTaken,
                    bonusDamageTaken);
            if (!unit.isAlive()) {
                System.out.printf(">>> %s is killed\n", unit.name);
            }
            energy--;
        } else {
            System.out.println(">>> Cannot attack: Low energy");
        }
    }
    
    @Override
    public void levelUp() {
        this.setLevel(level + 1);
        System.out.printf(">>> %-10s reached level %d\n", name, level);
    }

    @Override
    public void setLevel(int level) {
        if (this.level == level) {
            resetHealth();
            resetEnergy();
            return;
        }
        if (this.level < level) {
            do {
                maxHealth += maxHealth * 0.2;
                attack += attack * 0.12;
                bonusAttack += (bonusAttack * 0.1) + 2;
                if ((this.level + 1) % 3 == 0) {
                    maxEnergy++;
                }
                this.level++;
            } while (this.level < level);
        } else {
            do {
                maxHealth -= maxHealth * 0.2;
                attack -= attack * 0.12;
                bonusAttack -= 2;
                bonusAttack -= (bonusAttack* 0.1);
                if (this.level % 3 == 0) {
                    maxEnergy--;
                }
                this.level--;
            } while (this.level > level);
        }
        resetHealth();
        resetEnergy();
    }

    @Override
    public void print() {
        System.out.printf("%-12s: Lvl = %d | HP = %3.0f/%3.0f | EP = %.0f/%.0f | AP = %3.0f | AP+ = %3.0f\n",
                name, level, health, maxHealth, energy, maxEnergy, attack, bonusAttack);
    }
}
