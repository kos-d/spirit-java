package books.promdev.part_01_core.chapt05_pattern._04_behavioral._03_observer;

public class Main {
    public static void main(String[] args) {
        Rectangle observed = new Rectangle(5, 3);
        System.out.println(observed.toString());
        observed.addObserver(new Square());
        observed.addObserver(new Perimeter());
        observed.setWidth(10);
        System.out.println(observed.toString());
        observed.setHeight(8);
        System.out.println(observed.toString());
    }
}