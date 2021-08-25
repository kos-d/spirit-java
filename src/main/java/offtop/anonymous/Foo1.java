package offtop.anonymous;

public class Foo1 {
    static SayHello h = new SayHello() {
        @Override
        public void say() {
            System.out.println("Method inner anonymous class");
        }
    };
    
    public static void main(String[] args) {
        h.say();
    }
}
interface SayHello {
    void say();
}