package goit.module06.homework.autocheck;

class EmailDetectorTest {
    public static void main(String[] args) {
        //true
        System.out.println(new EmailDetector().isPresent("This email is no-reply@goo.com"));
        //flase
        System.out.println(new EmailDetector().isPresent("No email present, but @ there"));
    }
}
class EmailDetector {
    public boolean isPresent(String text) {
        boolean result = false;
        
        String[] textArr = text.toLowerCase().split(" ");
        
        for (String word : textArr) {
            if (word.contains("@")) {
                if (word.indexOf("@") > 1 && word.length() > word.indexOf("@") + 2) {
                    result = true;
                }
            }
        }
        return result;
    }
}