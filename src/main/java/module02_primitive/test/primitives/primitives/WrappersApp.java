package module02_primitive.test.primitives.primitives;

public class WrappersApp {
    public static void main (String[] agrs) {
        Byte myByte = 5;
        System.out.println("Byte MIN_VALUE = " + myByte.MIN_VALUE);
        System.out.println("Byte MAX_VALUE = " + myByte.MAX_VALUE);
        Short myShort = 20;
        System.out.println("Short MIN_VALUE = " + myShort.MIN_VALUE);
        System.out.println("Short MAX_VALUE = " + myShort.MAX_VALUE);
        Integer value = 10;
        System.out.println("Integer MIN_VALUE = " + value.MIN_VALUE);
        System.out.println("Integer MAX_VALUE = " + value.MAX_VALUE);
        Long myLong = 50L;
        System.out.println("Long MIN_VALUE = " + myLong.MIN_VALUE);
        System.out.println("Long MAX_VALUE = " + myLong.MAX_VALUE);

        Float myFloat = 10.5f;
        System.out.println("Float MIN_VALUE = " + myFloat.MIN_VALUE);
        System.out.println("Float MAX_VALUE = " + myFloat.MAX_VALUE);
        Double myDouble = 20.4;
        System.out.println("Double MIN_VALUE = " + myDouble.MIN_VALUE);
        System.out.println("Double MAX_VALUE = " + myDouble.MAX_VALUE);

        Character character = 'a';
        System.out.println(character.MIN_VALUE);
        System.out.println(character.MAX_VALUE);

        Boolean myBoolean = true;
        System.out.println(myBoolean.booleanValue());

        Long long_x = 1L;
        System.out.println("____long_x = " + long_x);
        Integer integer_a = 15;
        System.out.println("____integer_a = " + integer_a);
        System.out.println("integer.doubleValue() = " + integer_a.doubleValue());
        Integer integer_b = Integer.parseInt("14");
        System.out.println("____integer_b = " + integer_b);
        System.out.println("Integer.parseInt(14) = " + integer_b);

        System.out.println("integer_a + integer_b = " + (integer_a + integer_b));
        System.out.println("long_x + integer_b = " + (long_x + integer_b));

        Boolean boolean_c = Boolean.FALSE;
        System.out.println("____boolean_c = " + boolean_c);

        System.out.println("\n");

        String string_a = "ABC";
        String string_b = "ABC";
        String string_c = new String ("ABC");
        System.out.println(
                "____string_a = " + string_a
                + " string b = " + string_b
                + " string_c = " + string_c);
        System.out.println("a == b = " + (string_a == string_b));     // true
        System.out.println("a == c = " + (string_a == string_c));     // false

        System.out.println("\n");

        Double positiveInfinity = Double.POSITIVE_INFINITY;
        Double negativeInfinity = Double.NEGATIVE_INFINITY;
        Double doubleNan = Double.NaN;
        System.out.println("doublePositiveInfinity = " + positiveInfinity);
        System.out.println("doubleNegativeInfinity = " + negativeInfinity);
        System.out.println("doubleNan = " + doubleNan);
    }
}
