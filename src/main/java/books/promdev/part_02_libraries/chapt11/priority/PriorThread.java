package books.promdev.part_02_libraries.chapt11.priority;

public class PriorThread extends Thread {
    public PriorThread(String name) {
        super(name);
    }
    public void run() {
        for (int i = 0; i < 71; i++) {
            System.out.println(getName() + " " + i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.err.print(e);
            }
        }
    }
}