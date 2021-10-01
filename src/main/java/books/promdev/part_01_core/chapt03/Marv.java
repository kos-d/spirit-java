package books.promdev.part_01_core.chapt03;

public class Marv<T extends Number> {
    public T marv;
    
    public Marv(T value) {
        marv = value;
    }
    public T getMarv() {
        return marv;
    }
    public int roundMarv() {
        return Math.round(marv.floatValue());
    }
    
//    public boolean sameAny(Marv<T> ob) {
    public boolean sameAny(Marv<?> ob) {
        return roundMarv() == ob.roundMarv();
    }
    public boolean same(Marv<T> ob) {
        return getMarv() == ob.getMarv();
    }
}