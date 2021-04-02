package library.string;

public class StringMethods {
    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        String c = "c";
        
        String d = a + b + c;
        
        String e = "";
        
        // static method join()
        String joinTest = String.join(" ", a, b, c);
        System.out.println(joinTest);
        
        String message = "Hello Test";
        // method charAt()
        System.out.println("charAt = " + message.charAt(4));
        
        char myChar;
        String s = "Hello";
        myChar = s.charAt(0);
        
        System.out.println("myChar = " + myChar);
        
        // method valueOf
        char[] arrChar = {'H', 'e', 'l', 'l', 'o'};
        String myStr;
        
        myStr = String.valueOf(arrChar);
        
        System.out.println("myString valueOf char = " + myStr);
        
        
        
        // method concat()
        System.out.println("concat = " + a.concat(b));
        
        // method contains() return boolean result
        System.out.println("conatins = " + message.contains("Te"));
        
        // method endsWith() return boolean result
        System.out.println("endWith = " + message.endsWith("st"));
        
        // method equals() return boolean result
        System.out.println(a.equals(b)); // false
        
        // method equalsIgnoreCase() return boolean result
        System.out.println(a.equalsIgnoreCase(b));  // false
        
        // method indexOf() return index array String
        System.out.println("index of" + message.indexOf('o'));
        
        int index1 = message.indexOf('l', 0);
        System.out.println("index of = " + index1);
        
        // method isEmpty() return boolean result
        System.out.println(e.isEmpty());
        
        // method lastIndexOf()
        System.out.println("last Index of " + message.lastIndexOf('o'));
        
        // method length()
        System.out.println("length message " + message.length());
        
        // method replace()
        System.out.println("replace " + message.replace("Test", "Java"));
        
        String message1 = message.replace("Test", "Java"); // immutable, create new variable String
        
        System.out.println("message1 = " + message1);
        
        // method replaceFirst
        System.out.println("replaceFirst = " + message.replaceFirst("Hello", "World"));
        System.out.println("replaceFirst = " + message.replaceFirst("Test", "Java"));        
        
        System.out.println("message " + message);
        
        // method split
        System.out.println("split length " + message.split(" ").length);
        
        String colors = "red, orange, yellow";
        String[] arrColors = colors.split(", ");
        for (String words : arrColors) {
            System.out.println(words);
        }
        
        // method toLowerCase()
        System.out.println("message.toLowerCase = " + message.toLowerCase());
        
        // method toUpperCase
        System.out.println("message.toUpperCase = " + message.toUpperCase());
        
        // method trim
        String testTrim = "  test Hello  ";
        System.out.println("testTrim = " + testTrim);
        System.out.println("trim = " + testTrim.trim());
        
        // method toCharArray
        String str = "ABC";
        char[] result = str.toCharArray();
        
        System.out.println("Char array:");
        for (int i = 0; i < result.length; i++) {
            System.out.println("Element [" + i + "]: " + result[i]);
        }
        
//        Integer intVar = Integer.valueOf("12");
//        int x = 8;
//        
//        int y = intVar;
//        
//        System.out.println("x + y = " + x + y);
        
        
    }
}