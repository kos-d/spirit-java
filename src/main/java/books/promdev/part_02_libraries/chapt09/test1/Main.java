package books.promdev.part_02_libraries.chapt09.test1;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        String path = "data\\test0.txt";
        File fbyte = new File(path);
        File fsymb = new File("data\\test1.txt");

        String[] arr = {"Lern ", " Java ", " Spring ", " Hibernate"};
        FileOutputStream fos = null;
        FileWriter fw = null;
        try {
            fos = new FileOutputStream(fbyte);
            fw = new FileWriter(fsymb);
            for (String a : arr) {
                fos.write(a.getBytes());
                fw.write(a);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fos != null) {
                    fos.close();
                    System.out.println("fos close");
                }

                if (fw != null) {
                    fw.close();
                    System.out.println("fw close");
                }
            } catch (IOException e) {
                System.err.println("error close stream " + e);
            }
        }
        FileReader fr = null;
        int b, count = 0;
        try {
            fr = new FileReader(fsymb);
            while ((b = fr.read()) != -1) {
                System.out.print((char) b);
                count++;
            }
            System.out.println("\n count byte = " + count);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fr != null) {
                    fr.close();
                    System.out.println("fr close");
                }
            } catch (IOException e) {
                System.err.println("error close: " + e);
            }
        }
    }
}