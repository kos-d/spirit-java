package module05.conspectus.video.lesson02;

public class Anonymous {
    public static void main(String[] args) {
        String nameThread = Thread.currentThread().getName();
        System.out.println("nameThread " + nameThread);
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from thread " + Thread.currentThread().getName());
            }
        }).start();
    }
}