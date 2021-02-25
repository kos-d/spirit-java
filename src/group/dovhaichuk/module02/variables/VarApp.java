package dovhaichuk.module02.variables;

public class VarApp {
    public static void main(String[] args) {        
        //Numeric
        byte byteVar = 8;               // 8 bits
        short shortVar = 16;            // 16 bits
        int intVar = 32;                // 32 bits
        long longVar = 64L;             // 64 bits
      
        float floatVar = 32.0f;         // 32 bits
        double doubleVar = 64.0;        // 64 bits

        //Textual
        //Variant #1
        char c1 = '\u0031';             // 1
        char c2 = '\u0036';             // 6
        String charVar = (c1 + "" + c2);// 16 bits
        //Variant #2
        //char charVar1 = (int)16;      // 16 bits

        String stringVar = "String";    // Reference type

        //Logical
        boolean bool = true;            // 1 bits

        // Variables string title 
        String typeHead     = "Type";
        String amountHead   = "Amount";
        String bitsHead     = "Bits";
        String extension    = "bits";
        // Variable name type
        String byteTitle    = "byte";
        String shortTitle   = "short";
        String intTitle     = "int";
        String longTitle    = "long";
        String floatTitle   = "float";
        String doubleTitle  = "double";
        String charTitle    = "char";
        String booleanTitle = "boolean";
        // More variables
        String nullVar      = "null";
        String refVar       = "ref";
        int boolAmount      = 1;

        // out in console
        System.out.printf("%s %n", "=================================");
        System.out.printf("%24s %n", "<< Numeric type >>");
        System.out.printf("%s %n", "=================================");
        System.out.printf("%s %15s %10s %n", typeHead, amountHead, bitsHead);
        System.out.printf("%s %n", "_________________________________");
        System.out.printf("%s %13x %12s %n", byteTitle, byteVar, extension);
        System.out.printf("%s %12d %12s %n", shortTitle, shortVar, extension);
        System.out.printf("%s %14d %12s %n", intTitle, intVar, extension);
        System.out.printf("%s %13d %12s %n", longTitle, longVar, extension);
        System.out.printf("%s %15.2f %9s %n", floatTitle, floatVar, extension);
        System.out.printf("%s %14.2f %9s %n", doubleTitle, doubleVar, extension);
        System.out.printf("%s %n", "=================================");
        System.out.printf("%24s %n", "<< Textual type >>");
        System.out.printf("%s %n", "=================================");
        System.out.printf("%s %15s %10s %n", typeHead, amountHead, bitsHead);
        System.out.printf("%s %n", "_________________________________");
        System.out.printf("%s %13s %12s %n", charTitle, charVar, extension);
        System.out.printf("%s %13s %9s %n", stringVar, nullVar, refVar);
        System.out.printf("%s %n", "=================================");
        System.out.printf("%24s %n", "<< Logical type >>");
        System.out.printf("%s %n", "=================================");
        System.out.printf("%s %9d %13s %n", booleanTitle, boolAmount, extension);
    }
}
