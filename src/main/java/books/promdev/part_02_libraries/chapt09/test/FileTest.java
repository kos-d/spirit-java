package books.promdev.part_02_libraries.chapt09.test;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileTest {
    String file = "data\\symbol.txt";
//        String file = "data\\test.txt";
        
    File f = new File(file);
    
//    File dir = new File("data\\info");
    File dir = new File("data" + File.separator + "info");
    
    
        
    public static void main(String[] args) {
        FileTest ft = new FileTest();
        ft.infoFile();
        ft.createFile();
        ft.dirInfo();
        ft.listRootsInfo();
    }
    public void createFile() { 
        try {
            if (f.createNewFile()) {
                System.out.println("File " + f.getName() + " create");
            }
        } catch (IOException e) {
            System.err.println("File dont create: " + e);
        }
    }
    public void infoFile() {
        if (f.exists()) {
            System.out.println(f.getName() + " exists");
            if (f.isFile()) {
                System.out.println("Path to file: " + f.getPath());
                System.out.println("Absolute path: " + f.getAbsolutePath());
                System.out.println("size file: " + f.length());
                System.out.println("Last modification: " + new Date(f.lastModified()));
                System.out.println("File access for read:\t" + f.canRead());
                System.out.println("File access for write:\t" + f.canWrite());
                System.out.println("File delete:\t" + f.delete());
            }
        } else {
            System.out.println("file " + f.getName() + " no exists");
        }
    }
    
    public void dirInfo() {
        if (dir.exists() && dir.isDirectory()) {
            System.out.println("directory " + dir.getName() + " exists");
        }
        
        File[] files = dir.listFiles();
        for (int i = 0; i < files.length; i++) {
            Date date = new Date(files[i].lastModified());
            System.out.print("\n" + files[i].getPath() + "\t| " + files[i].length() + date);
        }
    }
    
    public void listRootsInfo() {
        File root = File.listRoots()[1];
        System.out.printf("\n%s %,d from %,d free.", root.getPath(), root.getUsableSpace(), root.getTotalSpace());
    }
}
    



