package books.promdev.part_02_libraries.chapt11.thread;

public class ExceptThread extends Thread {
    @Override
    public void run() {
        boolean flag = true;
        if (flag) {
            throw new RuntimeException();
        }
        System.out.println("end of ExceptThread");
    }
}