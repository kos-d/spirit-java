package module11.practice.lesson2;

public class DaemonTest extends Thread {
    
    public static void main(String[] args) {
        
        DaemonTest daemonTest = new DaemonTest();
        
        boolean daemon = daemonTest.isDaemon();
        System.out.println(daemon);
        
        daemonTest.setPriority(MIN_PRIORITY);
    }
}