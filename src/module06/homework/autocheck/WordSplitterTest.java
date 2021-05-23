package module06.homework.autocheck;

import java.util.Arrays;

class WordSplitterTest {
    public static void main(String[] args) {
        
        WordSplitter wordSplitter = new WordSplitter();
        
        String[] words = wordSplitter.split("Hello      world");
        
        //[hello, world]
        System.out.println(Arrays.toString(words));
    }
}
class WordSplitter {
    public String[] split(String phrase) {
        String[] wordsArr = phrase.split(" ");
        String[] resultArr = new String[wordsArr.length];
        
        int count = 0;
        for (String word : wordsArr) {
            if (!word.isEmpty()) {
                resultArr[count++] = word.toLowerCase();
            } 
        }
        return resultArr.length == count ? resultArr : Arrays.copyOfRange(resultArr, 0, count);
    } 
}