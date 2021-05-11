package module08.homework.tmp;

public interface MyIterator<E> {
    
    boolean hasNext();
    
    E next();
    
    default void remove() {
        throw new MyUnsupportedOperationException("remove");
    }
}