package module06.test;

public class StringBuilderApp {
    public static void main(String[] args) {
        
        /*
        String result = "";
        for (int i = 0; i < 100000; i++) {
            result += i;
        }
        System.out.println(result);
        */
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            result.append(i);
        }
        System.out.println(result);
    }
}