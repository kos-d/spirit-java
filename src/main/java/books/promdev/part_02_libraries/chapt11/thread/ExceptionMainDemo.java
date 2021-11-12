package books.promdev.part_02_libraries.chapt11.thread;

public class ExceptionMainDemo {
    public static void main(String[] args) {
        new SimpleThread().start();
        System.out.println("end of main with exception");
        throw new RuntimeException();
    }
}