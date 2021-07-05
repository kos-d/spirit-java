package module04.conspectus.video.lesson02;

import java.util.Arrays;

public class TelephoneBook {
    
    String[] phoneBook = new String[] { "+380990000001", "+380990000002", "+380990000003", "+380990000004" };
    
    public String[] getPhoneBook() {
        
//        return phoneBook;
        return Arrays.copyOf(phoneBook, phoneBook.length - 1);
    }
}