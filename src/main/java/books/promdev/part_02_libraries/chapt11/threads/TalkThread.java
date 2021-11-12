package books.promdev.part_02_libraries.chapt11.threads;
//291

import java.lang.InterruptedException;
public class TalkThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Talking");
            try {
                Thread.sleep(7);
            } catch (InterruptedException e) {
                System.err.print(e);
            }
        }
    }
}