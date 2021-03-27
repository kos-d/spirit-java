package offtop.java_patterns.strategy.simUDuck;

public class FlyNoWay implements FlyBehavior {
	public void fly() {
		System.out.println("I can't fly ='( ");
	}
}
