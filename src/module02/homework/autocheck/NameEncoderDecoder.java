package module02.homework.autocheck;

public class NameEncoderDecoder {
    public String encode(String name) {
        String codeName = name
                .replace("e", "1")
                .replace("u", "2")
                .replace("i", "3")
                .replace("o", "4")
                .replace("a", "5") ;
        return "NOTFORYOU" + codeName + "YESNOTFORYOU";
    }
    public String decode(String name) {
        String decodeName = name
                .replace("YESNOTFORYOU", "")
                .replace("NOTFORYOU", "")
                //.replace("YES", "")
                .replace("1", "e")
                .replace("2", "u")
                .replace("3", "i")
                .replace("4", "o")
                .replace("5", "a");
        return decodeName;
    }
    public static void main(String[] args) {
        NameEncoderDecoder nameEncoderDecoder = new NameEncoderDecoder();

        System.out.println(nameEncoderDecoder.encode("Crab"));
        System.out.println(nameEncoderDecoder.decode("NOTFORYOUCr5bYESNOTFORYOU"));
        System.out.println(nameEncoderDecoder.decode("NOTFORYOUNOTFORYOUYESNOTFORYOU"));
    }
}
