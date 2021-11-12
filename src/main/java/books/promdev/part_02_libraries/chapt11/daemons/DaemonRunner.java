package books.promdev.part_02_libraries.chapt11.daemons;

public class DaemonRunner {
    public static void main(String[] args) {
        SimpleThread usual = new SimpleThread();
        SimpleThread daemon = new SimpleThread();
        daemon.setDaemon(true);
        daemon.start();
        usual.start();
        System.out.println("end operator main");
    }
}