package hero;


import java.util.Random;

public class Ranged extends Melee {

    public Ranged() {
        this.healthPoints = 100;
        this.manaPoints = 70;
    }

    @Override
    public void sayCatchphrase() {
        System.out.println("I look pretty in this dress!");
    }

    // Crit modifiers ranged class
    Random rand = new Random();
    int upperbound = 76;

    @Override
    public int strongAttack() {
        manaUsed(10);
        return getDexterity() > rand.nextInt(upperbound) ? (baseAttack() + 5) * 2 : (baseAttack() + 5);
    }

    @Override
    public int mediumAttack() {
        manaUsed(6);
        return getDexterity() > rand.nextInt(upperbound) ? (baseAttack() + 2) * 2 : (baseAttack() + 2);
    }

    @Override
    public int lightAttack() {
        int damage = baseAttack() + 2;
        manaUsed(3);
        return damage;
    }

    @Override
    public int baseAttack() {
        return 2 + Math.max(getStrength(), getIntellect());
    }
}
