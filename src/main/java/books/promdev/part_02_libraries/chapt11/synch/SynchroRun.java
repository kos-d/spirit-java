package books.promdev.part_02_libraries.chapt11.synch;

import java.io.IOException;

public class SynchroRun {
    public static void main(String[] args) {
        Resource s = null;
        String path = "data/result.txt";
        try {
            s = new Resource(path);
            SyncThread t1 = new SyncThread("First", s);
            SyncThread t2 = new SyncThread("Second", s);
            t1.start();
            t2.start();
            t1.join();
            t2.join();
        } catch (IOException e) {
            System.err.print("error file: " + e);
        } catch (InterruptedException e) {
            System.err.print("error thread: " + e);
        } finally {
            s.close();
        }
    }
}