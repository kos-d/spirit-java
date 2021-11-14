package books.promdev.part_02_libraries.chapt11.test;

public class SimpleThreadRunner {
    public static void main(String[] args) {
        new SimpleThread().start();
        System.out.println("Simple thread start");
//        throw new RuntimeException();
    }
}