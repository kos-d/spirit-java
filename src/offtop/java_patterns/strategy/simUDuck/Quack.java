package offtop.java_patterns.strategy.simUDuck;

public class Quack implements QuackBehavior {
        @Override
	public void quack() {
		System.out.println("Quack");
	}
}
