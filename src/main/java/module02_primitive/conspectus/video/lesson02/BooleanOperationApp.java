package module02_primitive.conspectus.video.lesson02;

public class BooleanOperationApp {
    public static void main(String[] args) {
        // логические опрераторы применимы к булиан переменным
        boolean a = true;
        boolean b = false;

        System.out.println("");
        System.out.println("bool a = " + a + " ; " + "bool b = " + b);
        System.out.println("");

        System.out.println("Операция отрицания:");
        System.out.println("!a = " + !a);
        System.out.println("!b = " + !b);
        System.out.println("");

        System.out.println("Логическая И");
        System.out.println("a && b = " + (a && b));
        System.out.println("");

        System.out.println("Логическая ИЛИ");
        System.out.println("a || b = " + (a || b));
        System.out.println("");
        
        boolean c = true;
        System.out.println("bool c = " + c);
        System.out.println("");
        System.out.println("Исключающее ИЛИ");
        System.out.println("a ^ c = " + (a ^ c));
    }
}
