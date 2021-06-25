package hero;

import lombok.Data;

@Data
public abstract class Hero {
    protected int healthPoints;
    protected int manaPoints;
    protected String catchPhrase = "";
    private int strength = 0;
    private int dexterity = 0;
    private int intellect = 0;
    private int stats = 10;

    public abstract void sayCatchphrase();

    // All attacks for every class defined
    public abstract int strongAttack();

    public abstract int mediumAttack();

    public abstract int lightAttack();

    public abstract int baseAttack();

    // Transferring stats to attributes function
    public void transferStats(String stat, int transfer) {
        if(transfer > this.getStats()) {
            System.out.println("You don't have enough stats to do that...");
        } else if (transfer <= this.getStats()) {
            reduceStats(transfer);
            if(stat.equalsIgnoreCase("strength")) {
                gainStrength(transfer);
                System.out.println("You have " + getStrength() + " " + stat + " and you have " + getStats() + " stats left.");
            } else if (stat.equalsIgnoreCase("dexterity")) {
                gainDexterity(transfer);
                System.out.println("You have " + getDexterity() + " " + stat + " and you have " + getStats() + " stats left.");
            } else if (stat.equalsIgnoreCase("intellect")) {
                gainIntellect(transfer);
                System.out.println("You have " + getIntellect() + " " + stat + " and you have " + getStats() + " stats left.");
            } else {
                System.out.println("Please enter valid input");
            }

        }
    }

    // Stat and status modifiers
    public void manaUsed(int manaChange) {
        manaPoints -= manaChange;
    }

    public void manaGained(int manaChange) {
        manaPoints += manaChange;
    }

    public void gainStrength(int strengthGain) {
        strength += strengthGain;
    }

    public void gainDexterity(int dexterityGain) {
        dexterity += dexterityGain;
    }

    public void gainIntellect(int intellectGain) {
        intellect += intellectGain;
    }

    public void reduceStats(int reducedStats) {
        stats -= reducedStats;
    }

    public void gainStats(int gainedStats) {
        stats += gainedStats;
    }
}
