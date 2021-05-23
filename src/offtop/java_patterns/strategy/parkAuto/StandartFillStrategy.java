package offtop.java_patterns.strategy.parkAuto;

public class StandartFillStrategy implements FillStrategy {

    @Override
    public void fill() {
        System.out.println("Just refueling gasoline!");
    }
}
