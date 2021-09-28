package books.promdev.chapt06_interface_inner_class.inner;

public class Ship {
    public class Engine {
        public void launch() {
            System.out.println("Start engine");
        }
    }
    public void init() {
        Engine eng = new Engine();
        eng.launch();
    }
}