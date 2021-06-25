package hero;

public class Caster extends Hero {

    public Caster() {
        this.healthPoints = 70;
        this.manaPoints = 100;
    }

    @Override
    public void sayCatchphrase() {
        System.out.println("I look pretty in this dress!");
    }

    @Override
    public int strongAttack() {
        int damage = 0;
        return damage;
    }

    @Override
    public int mediumAttack() {
        int damage = 0;
        return damage;
    }

    @Override
    public int lightAttack() {
        int damage = 0;
        return damage;
    }

    @Override
    public int baseAttack() {
        int damage = 0;
        return damage;
    }
}
