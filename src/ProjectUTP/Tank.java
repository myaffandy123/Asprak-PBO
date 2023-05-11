package ProjectUTP;

public class Tank extends Unit {

    double armor;

    public Tank(String name, double maxHealth, double maxEnergy, double attack, double armor) {
        super(name, maxHealth, maxEnergy, attack);
        this.armor = armor;
    }

    public Tank(String name, double maxHealth, double maxEnergy, double attack, double armor, int level) {
        super(name, maxHealth, maxEnergy, attack, level);
        this.armor = armor;
    }

    @Override
    public double takeDamage(double damage) {
        damage -= armor;
        damage = damage > 1 ? damage : 1;
        health -= damage;
        health = health > 0 ? health : 0;
        return damage;
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
                armor += (armor * 0.2) + 2.5;
                if ((this.level + 1) % 3 == 0) {
                    maxEnergy++;
                }
                this.level++;
            } while (this.level < level);
        } else {
            do {
                maxHealth -= maxHealth * 0.2;
                attack -= attack * 0.12;
                armor -= 2.5;
                armor -= (armor * 0.2);
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
        System.out.printf("%-12s: Lvl = %d | HP = %3.0f/%3.0f | EP = %.0f/%.0f | AP = %3.0f | AR = %2.0f\n",
                name, level, health, maxHealth, energy, maxEnergy, attack, armor);
    }
}
