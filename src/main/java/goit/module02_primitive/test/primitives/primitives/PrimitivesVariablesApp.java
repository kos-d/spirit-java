package goit.module02_primitive.test.primitives.primitives;

public class PrimitivesVariablesApp {
    public static void main(String[] args) {
        byte b = 1; //цифру 1 Java воспринимает как int, поэтому будет "ошибка компиляции"
        short s = 1; //та же ситуация, как решить эту проблему - чит. далее
        int i = 1;
        long l = 1L;
        float f = 1.0f;
        double d = 1.0;
        char c = 'c'; //одинарные кавычки
        String str = "ABC"; //двойные кавычки
        boolean bool = true;

        /*
        целочисленные
            byte    (1 байт, 8 бит, -128…127)
            short   (2 байта, 16 бит)
            int     (4 байта, 32 бит)
            long    (8 байт, 64 бит)
        числа с плавающей запятой
            float
            double
        символьный – char
        логический – boolean
         */

        byte value = (byte) 128; // получаем -128 из-за «прокрутки»
        System.out.printf("value = %d \n", value);
        int val = value;
        System.out.printf("int val = %d", val); //преобразовать byte в int можно неявно без потери информации
    }
}
