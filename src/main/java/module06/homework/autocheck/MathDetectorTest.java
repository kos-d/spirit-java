package module06.homework.autocheck;

class MathDetectorTest {
    public static void main(String[] args) {
        System.out.println(new MathDetector().isMath("2+2=47"));
        
        System.out.println(new MathDetector().isMath("1992 is great year"));
        
        System.out.println(new MathDetector().isMath("Venus vs Earth"));
    }
}
class MathDetector {
    public boolean isMath(String text) {
        
        char[] symbolArr = {'+', '-', '*', '/'};
        char[] textArr = text.toCharArray();
        
        boolean result = false;
        
        for (char symbolEl : symbolArr) {
            for (char character : textArr) {
                if (character == symbolEl) {
                    result = true;
                }
            }
        }
        return result;
    }
}