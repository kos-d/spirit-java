package goit.module12.conspectus.materials;

public class ImplRunnable {
    Thread helloThread = new Thread(new Runnable() {
        @Override
        public void run() {
            System.out.println("Hello");
        }
    });
}
