package module06.homework.autocheck;

class WordFreqCounterTest {
    public static void main(String[] args) {
        WordFreqCounter freqCounter = new WordFreqCounter();
        
        System.out.println(freqCounter.countFreq("Hello Java", "java"));
        
        System.out.println(freqCounter.countFreq("Hello World", "java"));
    }
}

class WordFreqCounter {
    public float countFreq(String phrase, String word) {
        float freq = 0;
        String[] phraseArr = phrase.toLowerCase().split(" ");
        float countWords = phraseArr.length;
        
        for (String element : phraseArr) {
            if (element.equals(word.toLowerCase())) {
                freq++;
            }
        }
        float result = freq / countWords;
        return result;
    }
}