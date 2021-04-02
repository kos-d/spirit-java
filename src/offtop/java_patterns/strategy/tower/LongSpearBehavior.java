package offtop.java_patterns.strategy.tower;

public class LongSpearBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Long Spear implements");
    }
}
