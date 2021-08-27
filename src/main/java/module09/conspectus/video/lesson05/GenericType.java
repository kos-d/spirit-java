package module09.conspectus.video.lesson05;

//public class GenericType<T extends Number> {
public class GenericType<T> {
    // Generic - обобщение
    /*
        E - Element use in java colencion
        K - Key
        V - Value
        N - Number
        T - Type
        S, U, V
        ?
    */    
    
    private T type;
    
    public T get() {
        return this.type;
    }
    
    public void set(T type) {
        this.type = type;
    }
}