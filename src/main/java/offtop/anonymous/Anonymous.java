package offtop.anonymous;

import java.util.function.Consumer;

public class Anonymous {
    public static void main(String[] args) {
        Consumer<String> foo = new Consumer() {
            @Override
            public void accept(Object o) {
                System.out.println(o + " TO DO something useful!");
            }
        };
        foo.accept("Work anonymous class in static method");
    }
}