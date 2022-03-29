package goit.module07_collection.practice.lesson1.itrb_generic;

//package module07.practice.lesson1.itrb_generic;
//
//public class Main {
//    
//    public static void main(String[] args) {
//        
//        String[] arr = new String[3];
//        
//        //Integer[] next1 = {1, 2, 3};
//        
//        GenericArrayWrapper arrayWrapper = new GenericArrayWrapper(arr);
//        
//        //GenericArrayWrapper<String> genericArrayWrapper = new GenericArrayWrapper<String>(arr);
//        //GenericArrayWrapper<Integer> genericArrayWrapper1 = new GenericArrayWrapper<Integer>(arr);
//        
//        GenericArrayWrapper<String> genericArrayWrapper = new GenericArrayWrapper<>(arr);
//        String[] array = genericArrayWrapper.getArray();
//        
//        
//        Integer[] arr1 = new Integer[3];
//        
//        GenericArrayWrapper<Integer> genericArrayWrapper1 = new GenericArrayWrapper<>(arr1);
//        Integer[] array1 = genericArrayWrapper1.getArray();
//        
//        String name = "name";
//        String example = genericArrayWrapper1.example(name);
//        
//        Integer age = 5;
//        Integer example1 = genericArrayWrapper.example(age);
//        
//        
//        
//        //String next = (String)arrayWrapper.next();
//        Integer next1 = (Integer)arrayWrapper.next();
//        
//        //--------------------------------------------------
//        
//        //String[] arr1 = {"1", "2", "3"};
//        
//        String value = "value";
//     
//        //ArrayWrapper arrayWrapper = new ArrayWrapper(arr1);
//        
//        StringWrapper stringWrapper = new StringWrapper(value);
//        
//        print(arrayWrapper);
//        print(stringWrapper);
//
//    }
//    
//    public static void print(Iterable args) {
//        while (args.hasNext()) {
//            System.out.println("args.next() " + args.next());
//        }
//    }
//}
//
////        String[] array = new String[3];
////        for (int i = 0; i < array.length; i++) {
////            String string = array[i];
////            
////        }