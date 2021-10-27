
import java.io.*;
import java.util.Scanner;

class ScannerLogic {

    static String filename = "scan.txt";

    public static void scanFile() {
        try {
            FileReader fr = new FileReader(filename);
            Scanner scan = new Scanner(fr);
            while (scan.hasNext()) {
                if (scan.hasNextInt()) {
                    System.out.println(
                            scan.nextInt() + ":int");
                } else if (scan.hasNextDouble()) {
                    System.out.println(
                            scan.nextDouble() + ":double");
                } else if (scan.hasNextBoolean()) {
                    System.out.println(
                            scan.nextBoolean() + ":boolean");
                } else {
                    System.out.println(scan.next() + ":String");
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println(e);
        }
    }

    public static void makeFile() {
        try {
            FileWriter fw = new FileWriter(filename);
            fw.write("2 Java 1,5 true 1.6 ");
            fw.close();
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}
