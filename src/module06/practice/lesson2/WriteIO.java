package module06.practice.lesson2;

@FunctionalInterface
// only one abstract methods
public interface WriteIO {
    
    void write(Object obj);
    
    default void test(Object obj) {
        //todo
        write(obj);
        //todo
    }
}
