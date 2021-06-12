package offtop.monad_test;

public class MonadApp {
    public static void main(String[] args) {
        Maybe<Integer> x = new Maybe<>(5);
        Monad<Integer> y = x
                .bind(v -> new Maybe<>(v + 1))
                .bind(v -> new Maybe<>(v * 2));
        System.out.println( ((Maybe<Integer>)y).getVal() );
    }
}