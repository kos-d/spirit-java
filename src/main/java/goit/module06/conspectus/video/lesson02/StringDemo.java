package goit.module06.conspectus.video.lesson02;

import java.util.StringJoiner;

public class StringDemo {
    /*
    String 
    Immutable
    String Constant Pool
    StringBuilder
    StringBuffer
    */
    public static void main(String[] args) {
//        getStringFromPool();
//        createStringWithNewKeyword();
//        createStringWithNewKeywordAndIntern();
//        stringConcatination();
//        substringExample();
//        replaceExample();
//        stringFormatExample();
//        stringJoinerExample();

//        String reversed = reverseStringWithNewObject("Hello World");
//        System.out.println(reversed);
//        
//        String reversed1 = reverseStringWithoutAdditionalMemoryUsage("Hello World");
//        System.out.println(reversed1);
        
        String builderReversed = stringBuilderReverseExample("Hello World");
        System.out.println(builderReversed);
    }
    
    private static String stringBuilderReverseExample(String input) {
        StringBuilder builder = new StringBuilder();
        String result = builder.append(input).reverse().toString();
        return result;
    }
    
    private static String reverseStringWithoutAdditionalMemoryUsage(String input) {
        char[] inputArray = input.toCharArray();
        int begin = 0;
        int end = inputArray.length - 1;
        
        char temp;
        
        while (begin < end) {
            temp = inputArray[begin];
            inputArray[begin] = inputArray[end];
            inputArray[end] = temp;
            begin++;
            end--;
        }
        return new String(inputArray);
    }
    
    private static String reverseStringWithNewObject(String input) {
        char[] inputChars = input.toCharArray();
        char[] result = new char[inputChars.length];
        
        for (int i = 0; i < inputChars.length; i++) {
            result[i] = inputChars[inputChars.length - 1 - i];
        }
        
        return new String(result);
    }
    
    private static void stringJoinerExample() {
        String prefix = "[";
        String suffix = "]";
        StringJoiner joiner = new StringJoiner(",", prefix, suffix);
        String[] array = new String[]{"RED", "BLUE", "GREEN"};
        for (String colors : array) {
            joiner.add(colors);
        }
        System.out.println(joiner.toString());
    }
    
    private static void stringFormatExample() {
        /*
        %s - String value, any type
        %d - Integer(byte, short, int, long, bigint)
        %f - floating point digits
        */
        
        String formatted = String.format("Hello %s %s", "Hello", "World");
        System.out.println(formatted);
    }
    
    private static void replaceExample() {
        String s1 = "Hello World";
        System.out.println(s1.replace("l", "2"));
    }
    
    private static void substringExample() {
        String s1 = "Hello World";
        System.out.println(s1.substring(1));
        System.out.println(s1.substring(1, 4));
        System.out.println(s1.substring(1, s1.length() - 1));
    }
    
    private static void stringConcatination() {
        String first = "Hello";
        String hello = "Hel";
        String second = "lo";
        second = hello + second;
        
        System.out.println(first == second);
    }
    
    private static void createStringWithNewKeywordAndIntern() {
        String first = "Hello World";
        String second = new String("Hello World").intern();
        System.out.println(first == second);
        System.out.println(first.equals(second));
    }
    
    private static void createStringWithNewKeyword() {
        String first = "Hello World";
        String second = new String("Hello World");
        System.out.println(first == second);
        System.out.println(first.equals(second));
    }

    private static void getStringFromPool() {
        String first = "Hello World";
        String second = "Hello World";
        
        System.out.println(first == second);
        System.out.println(first.equals(second));
    }
}