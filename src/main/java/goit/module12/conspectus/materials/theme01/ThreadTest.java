package goit.module12.conspectus.materials.theme01;

public class ThreadTest {
    public static void main(String[] args) throws InterruptedException {
        Thread printThread = new Thread(() -> {
            System.out.println("Exec thread");
            
            synchronized (Thread.currentThread()) {
                try {
                    Thread.currentThread().wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            
            System.out.println("Finish exec thread");
        });
        
        printThread.start();
        
        Thread.sleep(2000); // 2 секунды
        
        synchronized (printThread) {
            printThread.notify();
        }
    }
}
