package java_patterns.strategy.tower;

public class Knight extends Character {
    
    public Knight() {
        weapon = new LongSpearBehavior();
    }

    public void display() {
        System.out.println("I'm knight!");
    }

    public void fight() {
        weapon.useWeapon();
    }
}
