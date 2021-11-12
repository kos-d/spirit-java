package books.promdev.part_02_libraries.chapt11.daemons;

public class SimpleThread extends Thread {
    @Override
    public void run() {
        try {
            if (isDaemon()) {
                System.out.println("start daemon-thread");
//                Thread.sleep(10_000);
                Thread.sleep(1);
            } else {
                System.out.println("start normal thread");
            }
        } catch (InterruptedException e) {
            System.err.print(e);
        } finally {
            if (!isDaemon()) {
                System.out.println("end normal thread");
            } else {
                System.out.println("end daemon-thread");
            }
        }
    }
}