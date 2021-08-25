package offtop.anonymous;

import java.util.function.Consumer;

public class AnonymousLambda {
    public static void main(String[] args) {
        Consumer<String> foo = o -> System.out.println(o + " TODO something useful!");
        foo.accept(" Using lambda ");
    }
}