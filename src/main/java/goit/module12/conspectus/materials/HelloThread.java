package goit.module12.conspectus.materials;

public class HelloThread extends Thread {
    @Override
    public void run() {
        System.out.println("Hello from thread");
    }
}
