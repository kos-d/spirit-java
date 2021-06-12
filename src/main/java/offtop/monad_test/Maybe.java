package offtop.monad_test;

import java.util.function.Function;

public class Maybe<T> implements Monad<T> {
    
    private final T val;
    
    public Maybe(T val) {
        this.val = val;
    }
    
    public T getVal() {
        return val;
    }

    @Override
    public <U> Monad<U> bind(Function<T, Monad<U>> f) {
        if (val == null) 
            return new Maybe<U>(null);
        return f.apply(val);
    }
}