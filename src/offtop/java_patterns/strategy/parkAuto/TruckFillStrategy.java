package offtop.java_patterns.strategy.parkAuto;

public class TruckFillStrategy implements FillStrategy {

    @Override
    public void fill() {
        System.out.println("Refuel special gasoline");
    }
}
