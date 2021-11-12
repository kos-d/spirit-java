package books.promdev.part_02_libraries.chapt11.management;

public class JoinThread extends Thread {
    public JoinThread(String name) {
        super(name);
    }
    public void run() {
        String nameT = getName();
        long timeout = 0;
        System.out.println("Start thread " + nameT);
        try {
            switch (nameT) {
                case "First":
                timeout = 5_000;
                break;
                case "Second":
                    timeout = 1_000;
            }
            Thread.sleep(timeout);
            System.out.println("End thread " + nameT);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}