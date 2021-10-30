package books.promdev.part_02_libraries.chapt09.test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class WriterHelper {
    
    String[] pArray = {"2021 ", "Java SE 8"};
    
    File fbyte = new File("data\\byte.data");
    File fsymb = new File("data\\symbol.txt");
    
    FileOutputStream fos = null;
    FileWriter fw = null;
    
    public void writeHelper() {
        try {
            fos = new FileOutputStream(fbyte);
            fw = new FileWriter(fsymb);
            for (String s : pArray) {
                fos.write(s.getBytes());
                fw.write(s);
            }
        } catch (IOException e) {
            System.err.println("Oops! Error write: " + e);
        } finally {
            closeFileOutputStream();
            closeFileWriter();
        }
    }
    private void closeFileOutputStream() {
        try {
            if (fos != null) {
                fos.close();
            }
        } catch (IOException e) {
            System.err.println("Oops! error close FileOutputStream: " + e);
        }
    }
    private void closeFileWriter() {
        try {
            if (fw != null) {
                fw.close();
            }
        } catch (IOException e) {
            System.err.println("Oops! error close FileWriter" + e);
        }
    }
}