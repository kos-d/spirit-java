package offtop.anonymous;

public class External {
    static Foo foo = new Foo() {
        @Override
        public void show() {
            super.show();
            System.out.println("Method inner anonymous class");
        }
    };
    public static void main(String[] args) {
        foo.show();
    }
}
class Foo {
    public void show() {
        System.out.println("Method super class");
    }
}