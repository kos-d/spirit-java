package books.promdev.part_02_libraries.chapt09.test;

import java.io.*;

public class FileCopySymbolStream {
    public static void main(String[] args) {
        FileReader fileIn = null;
        FileWriter fileOut = null;
        
        String path = "data\\res.txt";        
        String pathCopyFile = "data\\resCopy2";
        
        try {
            fileIn = new FileReader(path);
            fileOut = new FileWriter(pathCopyFile);
            
            int a;
            while ((a = fileIn.read()) != -1) {
                fileOut.write(a);
            }
            System.out.println("file copies");
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
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
