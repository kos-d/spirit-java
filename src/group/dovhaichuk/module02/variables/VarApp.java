//package dovhaichuk.module02.variables;

public class VarApp {
    public static void main(String[] args) {
        
        //Numeric
        byte b = 8;                 // 8 bits
        short s = 16;               // 16 bits
        int i = 32;                 // 32 bits
        long l = 64;                // 64 bits
      
        float f = 32f;              // 32 bits
        double d = 64;              // 64 bits

        //Textual
        char c = 'a';               // 16 bits
        String str = " bits";       // 

        //Logical
        boolean bool = true;        // 1 bits

        //Reference - ссылочные, null
        
        System.out.println("<< Numeric type >>");
        System.out.println("bite    = " + b + str);       
        System.out.println("short   = " + s + str);       
        System.out.println("int     = " + i + str);       
        System.out.println("long    = " + l + str);       
        System.out.println("float   = " + f + str);       
        System.out.println("double  = " + d + str);
        
        System.out.println("<< Textual type >>");        
        System.out.println("char    = " + c + str);       
        System.out.println("String this reference type");

        System.out.println("<< Logical type >>");
        System.out.println("boolean: true or false");
    }
}
