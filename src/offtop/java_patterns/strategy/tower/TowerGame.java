package offtop.java_patterns.strategy.tower;

public class TowerGame {
	public static void main(String[] args) {

	Character king = new King();
	king.display();
	king.performFight();

	Character queen = new Queen();
	queen.display();
	queen.performFight();

	Character knight = new Knight();
	knight.display();
	knight.performFight();

	Character troll = new Troll();
	troll.display();
	troll.performFight();
	}
}
