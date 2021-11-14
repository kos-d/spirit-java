package books.promdev.part_02_libraries.chapt11.test;

public class WalkRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Walking");
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                System.err.println(e);
            }
        }
    }
}