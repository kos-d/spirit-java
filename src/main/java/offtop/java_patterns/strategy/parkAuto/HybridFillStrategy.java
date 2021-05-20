package offtop.java_patterns.strategy.parkAuto;

public class HybridFillStrategy implements FillStrategy {

    @Override
    public void fill() {
        System.out.println("Refuel with gasoline or electricity of your choice!");
    }
}
