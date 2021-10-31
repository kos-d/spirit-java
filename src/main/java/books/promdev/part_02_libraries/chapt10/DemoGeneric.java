package books.promdev.part_02_libraries.chapt10;

import java.util.ArrayList;

public class DemoGeneric {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("JavaFX 2");
        
        String res = list.get(0);
        System.out.println(res);
        
        System.out.println(list);
    }
}
