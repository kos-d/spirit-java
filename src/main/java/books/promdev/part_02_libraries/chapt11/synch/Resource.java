package books.promdev.part_02_libraries.chapt11.synch;

import java.io.FileWriter;
import java.io.IOException;

public class Resource {
    private FileWriter fileWriter;
    public Resource(String file) throws IOException {
        fileWriter = new FileWriter(file, true);
    }
    public synchronized void writing(String str, int i) {
        try {
            fileWriter.append(str + i);
            System.out.print(str + i);
                Thread.sleep((long) (Math.random() * 50));
                fileWriter.append("->" + i + " ");
                System.out.print("->" + i + " ");
        } catch (IOException e) {
            System.err.print("error file: " + e);
        } catch (InterruptedException e) {
            System.err.print("error thread: " + e);
        }
    }
    public void close() {
        try {
            fileWriter.close();
        } catch (IOException e) {
            System.err.print("error close file: " + e);
        }
    }
}