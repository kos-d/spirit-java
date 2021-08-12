package offtop.luxcity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution3_1 {
    public static void main(String[] args) {
        runCode();
    }
    
    public static boolean getResult(String s, List<String> words) {
        for (String word : words) {
            s = s.replace(word, "");
        }
        return s.isEmpty() ? true : false;
    }

    public static void runCode() {
        System.out.println(getResult("onetwoone", Arrays.asList("one", "two")));
    }
}