package books.promdev.part_02_libraries.chapt11.test;

public class TalkThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Talking");
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                System.err.print(e);
            }
        }
    }
}