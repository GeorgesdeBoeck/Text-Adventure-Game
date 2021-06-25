package hero;

import java.util.Random;

public class Melee extends Hero{

    public Melee(){
    healthPoints = 120;
    manaPoints = 50;
    }


    @Override
    public void sayCatchphrase() {
        System.out.println("Nothing I can't solve with my fists!");
    }

    // Crit modifiers for the Melee class
    Random rand = new Random();
    int upperbound = 101;

    //Using a strong attack costs 10 mana and can critical hit
    @Override
    public int strongAttack(){
        int damage;

        this.manaUsed(10);
        int strength = this.getStrength();
        int intellect = this.getIntellect();
        int criticalHit = rand.nextInt(upperbound);

        // Strength and Intellect act as modifiers for damage, allowing for tank / glass cannon builds
        if(criticalHit <= this.getDexterity()) {
            damage = (25 + Math.max(strength, intellect) * 2);
            this.manaGained(this.getIntellect());
        } else {
            damage = (25 + strength);
        }

        System.out.println(damage);
        return damage;
    }

    @Override
    public int mediumAttack() {
        manaUsed(6);
        return getDexterity() > rand.nextInt(upperbound) ? (baseAttack() + 5) * 2 : (baseAttack() + 5);
    }

    @Override
    public int lightAttack() {
        int damage = baseAttack() + 3;
        manaUsed(3);
        return damage;
    }

    @Override
    public int baseAttack() {
        int damage = 5 + Math.max(getStrength(), getIntellect());
        return damage;
    }
}