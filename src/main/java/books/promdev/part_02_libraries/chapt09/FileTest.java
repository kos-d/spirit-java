package books.promdev.part_02_libraries.chapt09;

import java.io.*;
import java.util.*;

public class FileTest {

    public static String filePath = "D:\\GonzaDoc\\spirit-java\\src\\main\\java\\books\\promdev\\part_02_libraries\\chapt09";

    public static void main(String[] args) {
        //D:\\GonzaDoc\\spirit-java\\src\\main\\java\\books\\promdev\\part_02_libraries\\chapt09\\FileTest2.java

        File fp = new File(filePath + File.separator + "FileTest2.java");
        //File fp = new File("D:\\GonzaDoc\\spirit-java\\src\\main\\java\\books\\promdev\\part_02_libraries\\chapt09" + File.separator + "FileTest2.java");
//		File fp = new File("D:\\GonzaDoc\\spirit-java\\src\\main\\java\\books\\promdev\\part_02_libraries\\chapt09", "FileTest2.java");
        if (fp.exists()) {
            System.out.println(fp.getName() + " exists");

            if (fp.isFile()) {
                System.out.println("path to file:\t " + fp.getPath());
                System.out.println("absolut path to file:\t " + fp.getAbsolutePath());
                System.out.println("size file:\t " + fp.length());
                System.out.println("last modification:\t " + fp.lastModified());
                System.out.println("file to read:\t " + fp.canRead());
                System.out.println("file to write:\t " + fp.canWrite());
                System.out.println("file delete:\t " + fp.delete());
            }
        } else {
            System.out.println("file " + fp.getName() + " no exists");
        }

        try {
            if (fp.createNewFile()) {
                System.out.println("File " + fp.getName() + " create");
            }
        } catch (IOException e) {
            System.err.println(e);
        }
        
        File dir = new File("com" + File.separator + "learn");
        if (dir.exists() && dir.isDirectory())
            System.out.println("directory " + dir.getName() + " exists");
        
        File[] files = dir.listFiles();
        for (int i = 0; i < files.length; i++) {
            Date date = new Date(files[i].lastModified());
            System.out.print("\n" + files[i].getPath() 
                    + " \t| " + files[i].length() + "\t| " 
                    + date.toString());
        }
        File root = File.listRoots()[1];
        System.out.printf("\n%s %,d from %,d free. ", root.getPath(), root.getUsableSpace(), root.getTotalSpace());
    }
}
