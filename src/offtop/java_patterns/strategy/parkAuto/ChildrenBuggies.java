package offtop.java_patterns.strategy.parkAuto;

public class ChildrenBuggies extends Auto {

    public ChildrenBuggies() {    
        super(new ToyFillStrategy());
    }
}
