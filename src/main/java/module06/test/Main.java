package module06.test;

public class Main {
    public static void main(String[] args) {
        String str = new String("Java");
        String concat = str.concat(" Hot");
        System.out.println(concat);
        System.out.println(str);
        StringBuilder stringBuilder = new StringBuilder("Java");
        
        StringBuilder append = stringBuilder.append(" Hot");
        System.out.println(append);
        
//        stringBuilder.toString();
        int capacity = stringBuilder.capacity();
        System.out.println(capacity);
        
        stringBuilder.ensureCapacity(20);
        System.out.println(stringBuilder.capacity());
        
//        stringBuilder.setLength(35);
//        System.out.println(stringBuilder.capacity());
        
//        stringBuilder.insert(1, "G");
//        System.out.println(stringBuilder);
        
        StringBuilder deleteCharAt = stringBuilder.deleteCharAt(1);
        System.out.println(deleteCharAt);
        
        StringBuilder reverse = stringBuilder.reverse();
        System.out.println(reverse);
    }
}