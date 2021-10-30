package books.promdev.part_02_libraries.chapt09.test;

package books.promdev.part_02_libraries.chapt09.test;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
 
public class Test2 {
 
    public static void main(String[] args) throws Exception {
 
        FileWriter nFile = new FileWriter("data\\file1.txt");
 
            nFile.write("Хокку \nПодобен лучу самурайский клинок \nИ тот затупился \nПроклятая килька в томате!!");
 
        nFile.close();
        
        FileReader fr = new FileReader("data\\file1.txt");
        Scanner scan = new Scanner(fr);
        
        int i = 1;
        
        while (scan.hasNextLine()) {
            System.out.println(i + " : " + scan.nextLine());
            i++;
        }
        if (fr != null) {
            try {
                fr.close();
                System.out.println("fr close");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
