package java_patterns.strategy.tower;

public class Troll extends Character {
	public Troll() {
		weapon = new AxeBehavior();
	}

	public void display() {
		System.out.println("I'm a Troll");
	}

	public void fight() {
		weapon.useWeapon();
	}
}
