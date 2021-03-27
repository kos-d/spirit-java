package offtop.java_patterns.strategy.parkAuto;

public class ToyFillStrategy implements FillStrategy {

    @Override
    public void fill() {
        System.out.println("Toy do not fill");
    }
}
