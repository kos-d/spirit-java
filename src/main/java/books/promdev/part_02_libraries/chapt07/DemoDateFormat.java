package books.promdev.part_02_libraries.chapt07;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

public class DemoDateFormat {
    public static void main(String[] args) {
//        DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.US);
//        
//        Date d = null;
//        String str = "April 3, 2006";
//        try {
//            d = df.parse(str);
//            System.out.println(d);
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//        df = DateFormat.getDateInstance(DateFormat.FULL, new Locale("ru", "RU"));
//        System.out.println(df.format(d));
//        
//        d = new Date();
//        
//        df = DateFormat.getTimeInstance();
//        System.out.println(df.format(d));
        
        Date d = new Date();
        Locale[] locales = DateFormat.getAvailableLocales();
        for (Locale loc : locales) {
            DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, loc);
            System.out.println(loc.toString() + "---> " + df.format(d));
        }
    }
}
