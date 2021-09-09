package offtop.numerical_systems_convert;

import java.util.Arrays;

public class IntegerToBinaryExample {
    public static void main(String[] args) {
//        Integer number = 6;
        Integer number = 8;
//        Integer number = 1;
//        Integer number = 9;
//        Integer number = 10;
        
        // бинарный формат числа
        String convert = Integer.toBinaryString(number);
        System.out.println(convert);
        
        // восьмеричная форма
        convert = Integer.toOctalString(number);
        System.out.println(convert);
        
        // шестнадцатеричная форма        
        convert = Integer.toHexString(number).toUpperCase();
        System.out.println(convert);
        
        
    }
}
