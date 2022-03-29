package goit.module09_io.conspectus.materials.theme02;

import java.io.File;

public class MkDirExample {
    public static void main(String[] args) {
//        File file1 = new File("test.txt");

        System.out.println("Start program");
        
        
//        File file = new File("/media/disk_d/general/dev/workspace/spirit-java/folder1");
        File file1 = new File("folder");
        if (!file1.exists()) {
            file1.mkdir(); // !!!
        }
        
        File file = new File("folder3/folder4/folder5");
        if (!file.exists()) {
            file.mkdirs(); // !!!
        }
        System.out.println("Folder create");
    }
}