package books.promdev.part_02_libraries.chapt07;

import java.util.Calendar;
import java.util.Formatter;

public class FormatterDemoTimeAndDate {
    public static void main(String[] args) {
        Formatter f = new Formatter();
        Calendar cal = Calendar.getInstance();
        
        f.format("%tr", cal);
        System.out.println(f);
        
        f = new Formatter();
        f.format("%tc", cal);
        System.out.println(f);
        
        f = new Formatter();
        f.format("%tl:%tM", cal, cal);
        System.out.println(f);
        
        f = new Formatter();
        f.format("%tB %tb %tm", cal, cal, cal);
        System.out.println(f);
    }
}