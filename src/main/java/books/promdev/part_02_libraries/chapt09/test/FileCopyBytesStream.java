package books.promdev.part_02_libraries.chapt09.test;

import java.io.*;

public class FileCopyBytesStream {
    public static void main(String[] args) {
        FileInputStream fileIn = null;
        FileOutputStream fileOut = null;
        
        String path = "data\\res.txt";        
        String pathCopyFile = "data\\resCopy";
        
        try {
            fileIn = new FileInputStream(path);
            fileOut = new FileOutputStream(pathCopyFile);
            int a;
            while ((a = fileIn.read()) != -1) {
                fileOut.write(a);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileIn != null) {
                try {
                    fileIn.close();
                    System.out.println("fileIn close");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fileOut != null) {
                try {
                    fileOut.close();
                    System.out.println("fileOut close");
                } catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
