package offtop.java_patterns.strategy.parkAuto;

public class Sedan extends Auto {

    public Sedan() {
        super(new StandartFillStrategy());
    }
}
