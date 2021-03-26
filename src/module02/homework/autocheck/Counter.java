package module02.homework.autocheck;

public class Counter {
    // nonStatic method
    public long current(long number) {
        return number;
    }
    // nonStatic method
    public long next(long number) {
        return ++number;
    }
    // nonSatic method
    public long prev(long number) {
        return --number;
    }
    
    public static void main(String[] args) {
        Counter counter = new Counter();
        
        System.out.println("counter.current(5) = " + counter.current(5));
        System.out.println("counter.nest(5) = " + counter.next(5));
        System.out.println("counter.prev(5) = " + counter.prev(5));
        
    }
}
