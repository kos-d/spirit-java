package module07.test.generics_tutorial;

public class NumericFns<T extends Number> {
    T ob;

    public NumericFns(T ob) {
        this.ob = ob;
    }
    
    double square() {
        return ob.intValue() * ob.intValue();
    }
}