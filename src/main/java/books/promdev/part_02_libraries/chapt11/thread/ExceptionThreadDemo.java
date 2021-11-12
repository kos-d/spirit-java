package books.promdev.part_02_libraries.chapt11.thread;

public class ExceptionThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        new ExceptThread().start();
        Thread.sleep(1000);
        System.out.println("end of main");
    }
}