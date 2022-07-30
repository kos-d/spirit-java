package goit.module12.conspectus.materials;

public class Main {
    public static void main(String[] args) {
        Thread currentThread = Thread.currentThread();
        System.out.println(currentThread);
        new HelloThread().start();
    }
}
