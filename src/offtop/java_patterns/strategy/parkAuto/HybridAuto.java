package java_patterns.strategy.parkAuto;

public class HybridAuto extends Auto {
    
    public HybridAuto() {
        super(new HybridFillStrategy());
    }
}
