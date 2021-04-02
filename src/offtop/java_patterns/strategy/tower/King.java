package offtop.java_patterns.strategy.tower;

public class King extends Character {
	
        @Override
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
