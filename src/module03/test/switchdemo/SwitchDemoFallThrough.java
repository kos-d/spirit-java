package module03.test.switchdemo;
import java.util.Arrays;
import java.util.ArrayList;
public class SwitchDemoFallThrough {
    public static void main(String[] args) {

        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
        System.out.println(Arrays.toString(args));

        ArrayList<String> futureMonth = new ArrayList<>();
        int month = 8;

        switch (month) {
            case 1: futureMonth.add("January");
            case 2: futureMonth.add("February");
            case 3: futureMonth.add("March");
            case 4: futureMonth.add("April");
            case 5: futureMonth.add("May");
            case 6: futureMonth.add("June");
            case 7: futureMonth.add("July");
            case 8: futureMonth.add("August");
            case 9: futureMonth.add("September");
            case 10: futureMonth.add("October");
            case 11: futureMonth.add("November");
            case 12: futureMonth.add("December");
                    break;
            default:break;
        }

        if (futureMonth.isEmpty()) {
            System.out.println("Invalid month number");
        } else {
            for (String monthName : futureMonth) {
                System.out.println(monthName);
            }
        }
    }
}
