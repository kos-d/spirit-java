package offtop.monad_test;

import java.util.function.Function;

public interface Monad<T> {
    <U> Monad<U> bind(Function<T, Monad<U>> f);

}
