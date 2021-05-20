package offtop.java_patterns.strategy.parkAuto;

public class Truck extends Auto {

    public Truck() {
        super(new TruckFillStrategy());
    }    
}
