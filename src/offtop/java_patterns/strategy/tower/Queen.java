public class Queen extends Character {
	
	public Queen() {
		weapon = new KnifeBehavior();
	}

	public void display() {
		System.out.println("I'm a Queen");
	}

	public void fight() {
		weapon.useWeapon();
	}
}
