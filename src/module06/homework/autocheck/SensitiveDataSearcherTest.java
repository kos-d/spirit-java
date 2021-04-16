package module06.homework.autocheck;

import java.util.Locale;

class SensitiveDataSearcherTest {
    public static void main(String[] args) {
        
        SensitiveDataSearcher searcher = new SensitiveDataSearcher();
        System.out.println(searcher.isSensitiveDataPresent("Hello world"));
        
        System.out.println(searcher.isSensitiveDataPresent("Pass: swordfish"));
        
    }
}
class SensitiveDataSearcher {
    public boolean isSensitiveDataPresent(String phrase) {
        
        String[] phraseArr = phrase.toLowerCase().split(" ");
        String[] sensWord = new String[4];
        sensWord[0] = "pass";
        sensWord[1] = "key";
        sensWord[2] = "login";
        sensWord[3] = "email";
        boolean result = false;
        int i, j;
        for (i = 0; i < phraseArr.length; i++) {
            for (j = 0; j < sensWord.length; j++) {
                if (phraseArr[i].contains(sensWord[j].toLowerCase())) {
                    result = true;
                }
            }
        }
        return result;
    }
}