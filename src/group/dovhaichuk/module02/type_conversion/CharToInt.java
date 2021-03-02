package dovhaichuk.module02.type_conversion;

public class CharToInt {
    public static void main(String[] args) {
        String oct = "053";
        int dec = Integer.parseInt(oct, 8);
        System.out.println("В десятичной с.с. будет " + dec);
        System.out.println("Знак ASCII будет " + (char) dec);

        char c = '\u0031';
        char c1 = '\u0036';
        System.out.println(c +""+ c1);

    }
    char ch = '8';
    void conversionChatToInt() {

        int i1 = Character.getNumericValue(ch);
        System.out.println(i1 + i1);
    }



}
