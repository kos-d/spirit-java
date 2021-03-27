package offtop.java_patterns.strategy.tower;

public abstract class Character {
	
	WeaponBehavior weapon;

	public Character() {

	}

	public abstract void display();

	public void performFight() {
		weapon.useWeapon();
	}

	public void setWeapon(WeaponBehavior wb) {
		this.weapon = wb;
	}
}
