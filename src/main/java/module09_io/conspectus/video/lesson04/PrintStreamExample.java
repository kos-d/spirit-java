package module09_io.conspectus.video.lesson04;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamExample {

    private static final String ABSOLUTE_PATH = "/media/disk_d/general/dev/workspace/spirit-java/src/main/resources/print_stream/fileFromResources.txt";

    public static void main(String[] args) {
        File file = new File(ABSOLUTE_PATH);
        checkIfFileAvailable(file);
        
        try (PrintStream printStream = new PrintStream(new FileOutputStream(file))) {
            printStream.print("A");
            printStream.print('a');
            printStream.print(100);
            printStream.println();
            printStream.println("Some text");
        } catch (IOException ex) {
            System.err.print(ex.getMessage());
        }
    }

    private static void checkIfFileAvailable(File file) {
        if (!file.exists()) {
            file.getParentFile().mkdirs();
            try {
                file.createNewFile();
            } catch (IOException ex) {
                System.err.println(ex.getMessage());
            }
        }
    }
}
