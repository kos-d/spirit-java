package module09.conspectus.video.lesson05;

public class GenericTypeTest {
    public static void main(String[] args) {
        GenericType<Integer> genericType = new GenericType<>();
        genericType.set(100);
        
        Integer integer = genericType.get();
        
        System.out.println(integer);
        
//        GenericType<String> genericTypeString = new GenericType<>();
//        
//        genericTypeString.set("Hello");
        
//        String string = genericTypeString.get();
//        System.out.println(string);

        GenericType<Integer> type = new GenericType<>();
        
        
    }
}