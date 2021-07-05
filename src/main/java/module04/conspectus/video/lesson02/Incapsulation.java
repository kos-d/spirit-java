package module04.conspectus.video.lesson02;

import java.util.Arrays;

public class Incapsulation {
    public static void main(String[] args) {
        TelephoneBook telephoneBook = new TelephoneBook();
        String[] phoneNumber = telephoneBook.getPhoneBook();
        System.out.println("Before change " + Arrays.toString(phoneNumber));
        
        String[] phoneBook = telephoneBook.getPhoneBook();
        phoneBook[1] = "+380981111115";
        
        System.out.println("Changed_______" + Arrays.toString(phoneBook));
        System.out.println("Original______" + Arrays.toString(phoneNumber));
    }
}