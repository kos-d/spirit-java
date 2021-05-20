package library.string;

public class StringBuilderMethods {
    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        String c = "c";
        
        String d = a + b + c;
        
        StringBuilder sb = new StringBuilder();
        sb.append(a).append(b);
        sb.toString();
        
        System.out.println(sb.toString());        
        
    }
}