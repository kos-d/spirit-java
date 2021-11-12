package books.promdev.part_02_libraries.chapt11.management;

public class JoinRunner {
    static {
        System.out.println("Start thread main");
    }
    public static void main(String[] args) {
        JoinThread t1 = new JoinThread("First");
        JoinThread t2 = new JoinThread("Second");
        t1.start();
        t2.start();
        try {
//            t1.join();
            t1.join(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName());
    }
}