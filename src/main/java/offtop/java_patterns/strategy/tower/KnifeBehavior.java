package offtop.java_patterns.strategy.tower;

public class KnifeBehavior implements WeaponBehavior {
        @Override
	public void useWeapon() {
		System.out.println("Knife implemented");
	}
}
