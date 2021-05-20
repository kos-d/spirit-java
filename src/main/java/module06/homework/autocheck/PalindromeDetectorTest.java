package module06.homework.autocheck;

class PalindromeDetectorTest {
    public static void main(String[] args) {
        //PalindromeDetector isPalindrome = new PalindromeDetector();
        //false
        System.out.println(new PalindromeDetector().isPalindrome("Java"));
        //true
        System.out.println(new PalindromeDetector().isPalindrome("Noon"));
    }
}
class PalindromeDetector {
    public boolean isPalindrome(String word) {
        return word.equalsIgnoreCase(reverse(word));
    }
    
    private String reverse(String word) {
        StringBuilder result = new StringBuilder(word);
        return result.reverse().toString();
    }
    
    /*
    private String reverse(String word) {
        String result = "";
        char[] chars = word.toCharArray();
        for (char c: chars) {
            result = c + result;
        }
        return result;
    }
    */
}