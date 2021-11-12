package books.promdev.part_02_libraries.chapt11.yield;

public class YieldRunner {
    public static void main(String[] args) {
        new Thread() {
            public void run() {
                System.out.println("start thread 1");
                Thread.yield();
                System.out.println("end thread 1");
            }
        }.start();
        new Thread() {
            public void run() {
                System.out.println("start thread 2");
                System.out.println("end thread 2");
            }
        }.start();
    }
}