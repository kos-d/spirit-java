package module02_primitive.practice.lesson2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        
        Integer integer = 5;
        
        String name0 = null;
        String name1 = "dima";
        String name2 = "vasya";
        String name3 = "kolya";
        String name4 = "  ifor  ";
        String name5 = "Hello World";
        String space = " ";
        String empty = "";      // isEmpty() - true
        
        String result = String.join(space, name1, name2, name3);
        System.out.println("result = " + result);
        
        String result1 = String.join("\n", name1, name2, name3);
        System.out.println("result1: \n" + result1);
        
        char d = name1.charAt(0);
        System.out.println("char d = " + d);
        //return boolean
        boolean contains = name1.contains("im");        //true
        System.out.println("contains = " + contains);
        
        boolean endsWith = name1.endsWith("ima");       //true
        System.out.println("contains1 = " + endsWith);
        
        boolean equals = name1.equals(name2);           // false
        System.out.println("name1.equals(name2) = " + equals);
        
        boolean equalsNull = name1.equals(name0);       // false
        System.out.println("name1.equals(name0) = " + equalsNull);
        
        boolean equalsIgnoreCase = name1.equalsIgnoreCase("dimA");  //true
        System.out.println("name1.equalsIgnoreCase(\"dimA\") = " + equalsIgnoreCase);
        
        String trim = name4.trim();
        System.out.println("trim = " + trim);
        
        String replace = name5.replace("World", "Java");
        System.out.println("replace = " + replace);
        System.out.println("name5 = " + name5);
        System.out.println("replace = " + replace);
        
        String substring = name5.substring(0, 1);       //H
        System.out.println("substring = " + substring);
        
        String substring1 = name5.substring(10, 11);    //d
        System.out.println("substring1 = " + substring1);
        
        boolean isEmpty = empty.isEmpty();
        System.out.println("isEmpty = " + isEmpty);
        
        String toLowerCase = name5.toLowerCase();
        System.out.println("toLowerCase = " + toLowerCase);
        
        String toUpperCase = name5.toUpperCase();
        System.out.println("toUpperCase = " + toUpperCase);
        
        int length = name5.length();
        System.out.println("name5.length() = " + length);
        
        String intToString = String.valueOf(integer);
        System.out.println("intToString = " + intToString);
        System.out.println("concatString = " + intToString + 5 + " " + (integer + 5));    //55
        
        int StringToInt = Integer.valueOf("12");
        System.out.println("StringToInt = " + (StringToInt + 8));   //20
        
        String abc = "a bc";
        String[] split = abc.split(" ");
        System.out.println("split = " + Arrays.toString(split));
        
        char[] charArr = { 'a', 'b', 'c', 'd', 'e' };
        
        String stringArr = String.copyValueOf(charArr); 
        System.out.println("stringArr = " + stringArr);                 //abcde
        
        String charArrToString = String.copyValueOf(charArr, 1, 2);
        System.out.println("charArrToString = " + charArrToString);     //bc
        
    }
}