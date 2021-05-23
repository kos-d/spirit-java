package library.string;

public class StringBufferMethods {
    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        String c = "c";
        
        String d = a + b + c;
        
        // sinchronize
        StringBuffer sb = new StringBuffer();
        sb.append(a).append(b);
        sb.toString();
        
        System.out.println(sb.toString());  
    }
}