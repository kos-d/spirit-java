package books.promdev.chapt06_interface_inner_class.inner;

public class Motor extends Ship.Engine {
    public Motor(Ship obj) {
        obj.super();
    }
}