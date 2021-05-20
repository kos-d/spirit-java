package module06.homework.autocheck;

class DigitTextTest {
    public static void main(String[] args) {
        //true
        System.out.println(new DigitText().detect("23 50"));
        //false
        System.out.println(new DigitText().detect("Year 1990"));
    }
}
class DigitText {
    public boolean detect(String text) {
        char[] textArr = text.replace(" ", "").toCharArray();
        boolean result = true;
        
        for (char character : textArr) {
            if (character < '0' || character > '9') {
                result = false;
            }
        }
        return result;
    }
}