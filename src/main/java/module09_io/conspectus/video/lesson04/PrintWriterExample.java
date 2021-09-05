package module09_io.conspectus.video.lesson04;

import java.io.PrintWriter;

public class PrintWriterExample {
//    private static final String ABSOLUTE_PATH = "/media/disk_d/general/dev/workspace/spirit-java/src/main/resources/print_stream/fileFromResources.txt";
    public static void main(String[] args) {
        try (PrintWriter writer = new PrintWriter(System.out)) {
            writer.println("Hello");
            writer.println("World");
        }
    }
}