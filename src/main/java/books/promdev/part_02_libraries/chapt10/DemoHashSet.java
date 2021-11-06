package books.promdev.part_02_libraries.chapt10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.Iterator;

public class DemoHashSet {
    public static void main(String[] args) {
        HashSet<String> words = new HashSet<>(100);
        long callTime = System.nanoTime();
        Scanner scan = null;
        try {
            scan = new Scanner(new File("data\\test1.txt"));
            scan.useDelimiter("[^A-z, 0-9]+");
            while (scan.hasNext()) {
                String word = scan.next();
                words.add(word.toLowerCase());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Iterator<String> it;
        it = words.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        TreeSet<String> ts = new TreeSet<>(words);
        System.out.println(ts);
        long totalTime = System.nanoTime() - callTime;
        System.out.println("any words: " + words.size() + ", " + totalTime + " nanosec");
    }
}
