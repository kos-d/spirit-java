package module06.homework.autocheck;

import java.util.Arrays;

class DigitExtracterTest {
    public static void main(String[] args) {
        DigitExtracter digitExtracter = new DigitExtracter();
        
        int[] extracted = digitExtracter.extract("april 5, year 2000");
        
        System.out.println(Arrays.toString(extracted));
    }
}
class DigitExtracter {
    public int[] extract(String text) {
        char[] textArr = text.toCharArray();
        
        int countNum = 0;
        
        for (char character : textArr) {
            if (character >= '0' && character <= '9') {
                countNum++;
            }
        }
        
        int count = 0;
        
        int[] numberArr = new int[countNum];
        
        for (int i = 0; i < textArr.length; i++) {
            if (textArr[i] >= '0' && textArr[i] <= '9') {
                numberArr[count++] = Character.getNumericValue(textArr[i]);
            }
        }
        return numberArr;        
    }
}