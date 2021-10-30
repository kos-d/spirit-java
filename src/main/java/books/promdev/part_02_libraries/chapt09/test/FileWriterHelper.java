package books.promdev.part_02_libraries.chapt09.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWriterHelper {
    
    File f = new File("data\\res.txt");
    
    double[] v = { 1.10, 1.2, 1.401, 5.01, 6.017, 7, 8 };
    
    static FileWriter fw = null;
    BufferedWriter bw = null;
    PrintWriter pw = null;
    
    public static void main(String[] args) {
        FileWriterHelper fwh = new FileWriterHelper();
        
        fwh.fileWriterHelper();
    }
    
    public void fileWriterHelper() {
        try {
            fw = new FileWriter(f, true);
            bw = new BufferedWriter(fw);
            pw = new PrintWriter(bw);
            for (double version : v) {
                pw.printf("Java %.2g%n", version);
            }
        } catch (IOException e) {
            System.err.println("Error open stream " + e);
        } finally {
            closeExternalFlowPrintWriter();
            closeBufferedWriiter();
            closeFileWriter();
        }
    }
    public void closeExternalFlowPrintWriter() {        
        if (pw != null) {            
            pw.close();
            System.out.println("pw close");
        }
    }
    
    public void closeBufferedWriiter() {
        if (bw != null) {
            
            try {
                bw.close();
                System.out.println("bw close");
            } catch (IOException e) {
                System.err.println("error close bw " + e);
            }
        } else {
            System.out.println("bw dont close");
        }
    }
    
    public void closeFileWriter() {
        if (fw != null) {
            try {
                fw.close();
                System.out.println("fw close");
            } catch (IOException e) {
                System.err.println("error close fw " + e);
            }
        } else {
            System.out.println("fw dont close");
        }
    }
}