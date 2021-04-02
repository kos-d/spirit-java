package offtop.java_patterns.strategy.tower;

public class AxeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Axe implemented");
    }
}
