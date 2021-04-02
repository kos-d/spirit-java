package offtop.java_patterns.strategy.tower;

public class SwordBehavior implements WeaponBehavior {

        @Override
	public void useWeapon() {
		System.out.println("Sword implemented");
	}
}
