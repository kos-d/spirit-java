package goit.module12.conspectus.materials.theme01;

public class ImplRunnable extends Thread {
    Thread helloThread = new Thread(new Runnable() {
        @Override
        public void run() {
            System.out.println("Hello from ImplRunnable");
        }
    });
    
//    Thread helloThread = new Thread(() -> System.out.println("Hello"));
}
