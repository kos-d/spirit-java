package offtop.java_patterns.strategy.tower;

public class Knight extends Character {
    
    public Knight() {
        weapon = new LongSpearBehavior();
    }

    @Override
    public void display() {
        System.out.println("I'm knight!");
    }

    public void fight() {
        weapon.useWeapon();
    }
}
