package offtop.java_patterns.strategy.tower;

public class Queen extends Character {
	
	public Queen() {
		weapon = new KnifeBehavior();
	}

        @Override
	public void display() {
		System.out.println("I'm a Queen");
	}

	public void fight() {
		weapon.useWeapon();
	}
}
