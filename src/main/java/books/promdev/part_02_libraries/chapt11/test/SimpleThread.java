package books.promdev.part_02_libraries.chapt11.test;

public class SimpleThread extends Thread {
    @Override
    public void run() {
        try {
            sleep(7);
        } catch (InterruptedException e) {
            System.err.print(e);
        }
        System.out.print("end of SimpleThread");
    }
}