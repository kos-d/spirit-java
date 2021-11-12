package books.promdev.part_02_libraries.chapt11.thread;

public class SimpleThread extends Thread {
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.err.print(e);
        }
        System.out.println("end of SimpleThread");
    }
}