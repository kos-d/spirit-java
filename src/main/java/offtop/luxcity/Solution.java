package offtop.luxcity;

import java.util.Arrays;

class Solution01 {
    
    public static void main(String[] args) {
       runCode();
    }
    public static int fourLetters(String names) {
        
        return (int) Arrays.stream(names.split(" "))
                .filter(n -> n.length() == 4)
                .count();
    }

    public static void runCode() {
        System.out.println(fourLetters("Tror Gvigris Deriana Nori"));
    }
}