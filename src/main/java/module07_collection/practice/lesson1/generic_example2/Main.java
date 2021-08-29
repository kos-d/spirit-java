package module07_collection.practice.lesson1.generic_example2;

//package module07.practice.lesson1.generic_example2;
//
//import module06.practice.lesson2.*;
//import java.util.Arrays;
//
//public class Main {
//    
//    //public final static String OS = "WINDOWS";
//    //public final static String OS = "LINUX";
//    public final static String OS = "MAC";
//    
//    public static void main(String[] args) {
//        
//        //Pair.of(Integer.SIZE, OS);
//        Pair<String, Long> pair1 = Pair.of("String", 5L);
//        String key = pair1.getKey();
//        
//        Pair<Integer, Long> pair2 = Pair.of(1, 5L);
//        Integer key1 = pair2.getKey();
//        
//        
//        
//        
////        System.out.println("abstract factory from module 06 lesson 1");
////        
////        Factory factory = Factory.of();
////        
////        factory.createButton().handleButton();
////        factory.createPanel().handlePanel();
////        factory.createScroll().handleScroll();
//        
//        //----------------------------------------------
//        // ENUM
//        
//        ColorEnum color = ColorEnum.BLUE;
//        ColorEnum color1 = ColorEnum.GREEN;
//        
//        color.getColor();
//        color.getNumber();
//        
//        int ordinal = color.ordinal();
//        System.out.println("" + ordinal);
//        
//        int ordinal1 = color1.ordinal();
//        System.out.println("" + ordinal1);
//        
//        ColorEnum[] values = ColorEnum.values();
//        
//        ColorEnum valueOf = ColorEnum.valueOf("BLUE");
//        
//        System.out.println("valueOf " + valueOf);
//        
//        
//        for (ColorEnum value : values) {
//            System.out.println("value -> " + value);
//        }
//        
//        for (int i = 0; i < values.length; i++) {
//            System.out.println("value -> " + values[i]);
//        }
//        
//        System.out.println("length " + values.length);
//        
//        System.out.println(""+ Arrays.toString(values));
//        
//        ColorEnum newColor = ColorEnum.GREEN;
//        
//        if (newColor == ColorEnum.GREEN) {
//            System.out.println("Color is Green");
//        }
//        if (color == ColorEnum.BLUE) {
//            System.out.println("Color is Blue");
//        }
//        
//        
//    }
//}