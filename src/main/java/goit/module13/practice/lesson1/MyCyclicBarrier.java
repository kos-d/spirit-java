package goit.module13.practice.lesson1;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MyCyclicBarrier {
    public static void main(String[] args) {
        
        CyclicBarrier cyclicBarrier = new CyclicBarrier(4);
        new Thread(new MyThread(cyclicBarrier, "MYThread 1")).start();
        new Thread(new MyThread(cyclicBarrier, "MYThread 2")).start();
        new Thread(new MyThread(cyclicBarrier, "MYThread 3")).start();
    }    
}
class MyThread implements Runnable {
        
    private final CyclicBarrier cyclicBarrier;
    private final String name;
    
    public MyThread (CyclicBarrier cyclicBarrier, String name) {
        this.cyclicBarrier = cyclicBarrier;
        this.name = name;
    }
    
    @Override
    public void run() {
        System.out.println("1 " + name);
        
        //cyclicBarrier.await();
        try {
            cyclicBarrier.await();
        } catch (InterruptedException ex) {
            Logger.getLogger(MyThread.class.getName()).log(Level.SEVERE, null, ex);
        } catch (BrokenBarrierException ex) {
            Logger.getLogger(MyThread.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("2 " + name);
    }
}