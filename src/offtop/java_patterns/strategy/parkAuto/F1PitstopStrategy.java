package java_patterns.strategy.parkAuto;

public class F1PitstopStrategy implements FillStrategy {

    public void fill() {
        System.out.println("Refuel gasoline only after allother pit stop procedures");
    }
}
