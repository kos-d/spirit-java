package books.promdev.part_02_libraries.chapt07.test;

import java.util.Locale;

public class LocaleDemo {
    public static void main(String[] args) {
        Locale current = Locale.getDefault();
        System.out.println(current);
        
        String country = current.getCountry();
        String displayCountry = current.getDisplayCountry();
        String language = current.getLanguage();
        String displayLanguage = current.getDisplayLanguage();
        
        System.out.println("country: " + country);
        System.out.println("display country: " + displayCountry);
        System.out.println("language: " + language);
        System.out.println("display language: " + displayLanguage);
    }
}
