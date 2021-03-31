package module02.practice.lesson2;

public class Main {
    public static void main(String[] args) {
        
        String name0 = null;
        String name1 = "dima";
        String name2 = "vasya";
        String name3 = "kolya";
        String space = " ";
        
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
        System.out.println("name1.equals(name0) = " + name1.equals(name0));
        
        boolean equalsIgnoreCase = name1.equalsIgnoreCase("dimA");  //true
        System.out.println("name1.equalsIgnoreCase(\"dimA\") = " + equalsIgnoreCase);
    }
}