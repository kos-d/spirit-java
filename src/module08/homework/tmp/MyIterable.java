package module08.homework.tmp;

import java.util.function.Consumer;

public interface MyIterable<T> {
    
    MyIterator<T> iterator();
    
//    default void forEach(Consumer<? super T> action) {
//        for (T t : this) {
//            action.accept(t);
//        }
//    }
}