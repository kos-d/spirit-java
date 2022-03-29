package goit.module06.homework.autocheck;

class PunctuationMarkCounterTest {
    public static void main(String[] args) {
        PunctuationMarkCounter counter = new PunctuationMarkCounter();
        
        System.out.println(counter.count("Hello, world!"));
        System.out.println(counter.count("This is Sparta!"));
        System.out.println(counter.count("End."));
    }
}
class PunctuationMarkCounter {
    public int count(String phrase) {
        
        String[] phraseArr = phrase.split("");
        int count = 0;
        for (int i = 0; i < phraseArr.length; i++) {
            if (phraseArr[i].equals(".") || phraseArr[i].equals(",") || phraseArr[i].equals("!") || phraseArr[i].equals(":") || phraseArr[i].equals(";")) {
                count++;
            }
        }
        return count;
    }
}