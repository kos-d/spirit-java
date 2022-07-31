package goit.module12.conspectus.materials.theme01;

public class ImplRunnableLambda extends Thread {
    Thread helloThread = new Thread(() -> System.out.println("Hello from ImplRunnable lambda"));
}
