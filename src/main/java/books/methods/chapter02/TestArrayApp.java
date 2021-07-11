package books.methods.chapter02;

public class TestArrayApp {
    public static void main(String[] args) {
        String[] days = {"Monday", "Tusday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        
        printArray(days);
        
//        String day;        
//        int opening_time = (day == SUNDAY) ? 12 : 9;
    }
    
    static void printArray(String[] day) {
       for (int i = 0; i < day.length; i++) {
           System.out.println(day[i]);
       }
    }
}