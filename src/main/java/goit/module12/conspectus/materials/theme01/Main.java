package goit.module12.conspectus.materials.theme01;

public class Main {
    public static void main(String[] args) {
        Thread currentThread = Thread.currentThread();
        System.out.println(currentThread);
        
        new HelloThread().start();
        
        new Thread(() -> System.out.println("Hello from thread lambda")).start();
        
//        ImplRunnable implRunnable = new ImplRunnable();
//        new Thread(implRunnable).start();
//        
//        new ImplRunnableLambda().start();
        
        
        
    }
}
