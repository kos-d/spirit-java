package books.promdev.part_01_core.chapt06_interface_inner_class.inner;

public class Motor extends Ship.Engine {
    public Motor(Ship obj) {
        obj.super();
    }
}