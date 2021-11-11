package books.promdev.part_02_libraries.chapt10.legacy;
/*
import java.util.Hashtable;
import java.util.Enumeration;
import java.util.HashMap;

public class HashTableDemo {
    public static void main(String[] args) {
      Hashtable<Integer, Double> ht = new Hashtable<Integer, Double>() {
//        HashMap<Integer, Double> ht = new HashMap<Integer, Double> () {
            {
                for (int i = 0; i < 5; i++) {
                    ht.put(i, Math.atan(i));
                }
            }
        };
        Enumeration<Integer> ek = ht.keys();
        int key;
        while (ek.hasMoreElements()) {
            key = ek.nextElement();
            System.out.printf("%4d  ", key);
        }
        System.out.println("");
        Enumeration<Double> ev = ht.elements();
        double value;
        while (ev.hasMoreElements()) {
            value = ev.nextElement();
            System.out.printf("%.2f  ", value);
        }
    }
}
*/