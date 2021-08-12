package offtop.luxcity;

import java.util.ArrayList;
import java.util.List;

public class Solution3 {
    
    public static void main(String[] args) {
        runCode();
    }
    /**
     * Implement method getResult
     */
    public static boolean getResult(String s, List<String> words) {
        if (s.contains(words.get(0))) {
            return true;
        } else if (s.contains(words.get(1))) {
          return true;  
        } else {
            return false;
        }
    }

    public static void runCode() {
        String s = "oneteoone";
        
//        List<String> words = new ArrayList<>();        
//        words.add("one");
//        words.add("two");

        String[] item= {"one, two"};
        
        List<String> words = new ArrayList<>();        
            for (String el : item) {
                words.add(el);
            }
        
        boolean result = getResult(s, words);
        System.out.println(result);
    }
}