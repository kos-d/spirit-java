package module02_primitive.conspectus.materials.theme03;

public class OperationWithPrimitivesApp {
    public static void main(String[] args) {
        //Математические операторы: +, -, *, /
        int x = 5;
        int y = 4;
        int sum = x + y;
        int sub = x - y;
        int multiply = x * y;
        int divide = x / y;

        System.out.printf("x = %d; y = %d \n", x, y );
        System.out.printf("sum = %d; \nsub = %d; \nmultiply = %d; \ndivide = %d.\n", sum, sub, multiply, divide);

        // Операторы присвоения: =,
        // += (прибавляет к операду слева значение справа),
        // -= (вычитает соответственно).
        int a = 1;
        int b = 2;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("a++ = " + a++);     // 1
        System.out.println("a = " + a);         // 2
        System.out.println("--a " + --a);       // 1
        a += b;
        System.out.println("a += b = " + a);    // 3
        a -= b;
        System.out.println("a -= b = " + a);    // 1

        // Операторы сравнения: ==, <, >, <=, >=, != (не равно)
        System.out.println("a == b = " + (a == b));     // false
        System.out.println("a < b = " + (a < b));       // true

        // оператор % - остаток от деления
        int z = 10;
        System.out.println("z = " + z);
        System.out.println("z % 2 == 0 = " + (z % 2 == 0)); // true

        //Битовые & (and), | (or) и логические операции &&, ||, ^, !
        boolean bool1 = true;
        boolean bool2 = false;
        System.out.println("bool1 = " + bool1 + " bool2 = " + bool2);
        System.out.println("bool1 & bool2 = " + (bool1 & bool2));       // false
        System.out.println("bool2 & bool1 = " + (bool2 & bool1));       // false
        System.out.println("bool1 && bool2 = " + (bool1 && bool2));     // false
        System.out.println("bool2 && boole1 = " + (bool2 && bool1));    // false
        System.out.println("\n");
        System.out.println("bool1 | bool2 = " + (bool1 | bool2));       // true
        System.out.println("bool2 | bool1 = " + (bool2 | bool1));       // true
        System.out.println("bool1 || bool2 = " + (bool1 || bool2));     // true
        System.out.println("bool2 || bool1 = " + (bool2 || bool1));     // true
        System.out.println("\n");
        System.out.println("bool1 ^ bool2 = " + (bool1 ^ bool2));       // true
        System.out.println("bool2 ^ bool1 = " + (bool2 ^ bool1));       // true
        System.out.println("\n");
        System.out.println("! bool1 = " + (! bool1));                   // false
        System.out.println("! bool2 = " + (! bool2));                   // true
        System.out.println("\n");

        System.out.println("getTrue() = " + getTrue());
        System.out.println("getFalse() = " + getFalse());
        System.out.println("\n");
        System.out.println("getTrue() & getFalse() = " + (getTrue() & getFalse()));     // false
        System.out.println("\n");
        System.out.println("getTrue() && getFalse() = " + (getTrue() && getFalse()));   // false
        System.out.println("\n");
        System.out.println("getFalse() & getTrue() = " + (getFalse() & getTrue()));     // false
        System.out.println("\n");
        System.out.println("getFalse() && getTrue() = " + (getFalse() && getTrue()));   // false
        System.out.println("\n");
        System.out.println("getTrue() | getFalse() = " + (getTrue() | getFalse()));     // true
        System.out.println("\n");
        System.out.println("getTrue() || getFalse() = " + (getTrue() || getFalse()));   // true
        System.out.println("\n");
        System.out.println("getFalse() | getTrue() = " + (getFalse() | getTrue()));     // true
        System.out.println("\n");
        System.out.println("getFalse() || getTrue() = " + (getFalse() || getTrue()));   // true
        System.out.println("---------------------------------------------------------------\n");
        System.out.println("getTrue ^ getFalse = " + (getTrue() ^ getFalse()));         // true
        System.out.println("\n");
        System.out.println("getFalse ^ getTrue = " + (getFalse() ^ getTrue()));         // true
        System.out.println("---------------------------------------------------------------\n");
        System.out.println("! getTrue = " + (! getTrue()));                             // false
        System.out.println("! getFalse = " + (! getFalse()));                           // false
        System.out.println("\n");

    }

    public static boolean getTrue() {
        System.out.println("________________________________Enter getTrue method");
        return true;
    }
    public static boolean getFalse() {
        System.out.println("________________________________Enter getFalse method");
        return false;
    }
}
