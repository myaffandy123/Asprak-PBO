package ProjectUTP;

public abstract class Unit {

    protected String name;
    protected double health;
    protected double energy;
    protected double attack;
    protected double maxHealth;
    protected double maxEnergy;
    protected int level;

    public Unit(String name, double maxHealth, double maxEnergy, double attack) {
        this(name, maxHealth, maxEnergy, attack, 1);
    }

    public Unit(String name, double maxHealth, double maxEnergy, double attack, int level) {
        this.name = name;
        this.maxHealth = maxHealth;
        this.maxEnergy = maxEnergy;
        health = maxHealth;
        energy = maxEnergy;
        this.attack = attack;
        this.level = level;
    }

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
            System.out.printf(">>> %s attack %s for %.0f damage\n", name, unit.name, damageTaken);
            if (!unit.isAlive()) {
                System.out.printf(">>> %s is killed\n", unit.name);
            }
            energy--;
        } else {
            System.out.println(">>> Cannot attack: Low energy");
        }
    }

    public double takeDamage(double damage) {
        health -= damage;
        health = health > 0 ? health : 0;
        return damage;
    }

    public void recover() {
        if (energy > 0) {
            double recover = maxHealth * 0.18;
            recover = health + recover > maxHealth ? maxHealth - health : recover;
            health += recover;
            System.out.printf(">>> %s recover for %.0f health\n", name, recover);
            energy--;
        } else {
            System.out.println(">>> Cannot recover: Low energy");
        }
    }

    public void resetEnergy() {
        energy = maxEnergy;
    }

    public void resetHealth() {
        health = maxHealth;
    }

    public void levelUp() {
        setLevel(level + 1);
        System.out.printf(">>> %-10s reached level %d\n", name, level);
    }

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
                if ((this.level + 1) % 3 == 0) {
                    maxEnergy++;
                }
                this.level++;
            } while (this.level < level);
        } else {
            do {
                maxHealth -= maxHealth * 0.2;
                attack -= attack * 0.12;
                if (this.level % 3 == 0) {
                    maxEnergy--;
                }
                this.level--;
            } while (this.level > level);
        }
        resetHealth();
        resetEnergy();
    }

    public boolean isAlive() {
        return health > 0 ? true : false;
    }

    public void print() {
        System.out.printf("%-12s: Lvl = %d | HP = %3.0f/%3.0f | EP = %.0f/%.0f | AP = %3.0f\n",
                level, name, health, maxHealth, energy, maxEnergy, attack);
    }
}
