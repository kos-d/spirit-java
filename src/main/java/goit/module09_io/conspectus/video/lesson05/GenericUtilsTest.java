package goit.module09_io.conspectus.video.lesson05;

public class GenericUtilsTest {
    public static void main(String[] args) {
        GenericType<Integer> genericType = new GenericType<>();
        genericType.set(100);        
        Integer integer = genericType.get();
        
        GenericType<Integer> genericType1 = new GenericType<>();
        genericType1.set(100);        
        Integer integer1 = genericType1.get();
        
        GenericType<String> genericTypeString = new GenericType<>();
        
        genericTypeString.set("Hello");
        
        String string = genericTypeString.get();
        
//        boolean equals = GenericUtils.isEquals(genericType, genericType1);
//        System.out.println(equals);
    }
}