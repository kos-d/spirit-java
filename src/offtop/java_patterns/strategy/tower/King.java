package java_patterns.strategy.tower;

public class King extends Character {
	
	public void display() {
		System.out.println("I'm a King!");
	}	

	public King() {
		weapon = new SwordBehavior();
	}

	public void fight() {
		weapon.useWeapon();
	}
}
