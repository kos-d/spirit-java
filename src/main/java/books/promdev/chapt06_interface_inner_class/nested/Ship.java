package books.promdev.chapt06_interface_inner_class.nested;

public class Ship {
    private int id;
    public static class LifeBoat {
        public static void down() {
            System.out.println("boats on water");
        }
        public void swim() {
            System.out.println("go boats");
        }
    }
}