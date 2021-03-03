package java_patterns.strategy.parkAuto;

public class F1Car extends Auto {
    
    public F1Car() {
        super(new F1PitstopStrategy());
    }
}
