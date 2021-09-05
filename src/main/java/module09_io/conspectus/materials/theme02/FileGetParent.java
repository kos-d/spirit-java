package module09_io.conspectus.materials.theme02;

import java.io.File;

public class FileGetParent {
    public static void main(String[] args) {
        
//        File file = new File("test.txt");
//        File file = new File("/media");
        File file = new File("/media/disk_d/general/dev/workspace/spirit-java/");
/*                            /media/disk_d/general/dev/workspace               */
        
        String absolutePath = file.getAbsolutePath();
//        System.out.println(absolutePath);
        
        File folder = file.getParentFile();
        System.out.println(folder);
    }
}