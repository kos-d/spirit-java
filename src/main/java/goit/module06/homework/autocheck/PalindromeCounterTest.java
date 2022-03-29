package goit.module06.homework.autocheck;

class PalindromeCounterTest {
    public static void main(String[] args) {
        
        PalindromeCounter counter = new PalindromeCounter();
        //1
        System.out.println(counter.count("Level done!"));
        //0 
        System.out.println(counter.count("No palindromes"));
    }
}
class PalindromeCounter {
    public int count(String phrase) {
        int count = 0;
        String[] phraseArr = phrase.split(" ");
        for (String character : phraseArr) {
            String reversePhraseArr = new StringBuilder(character).reverse().toString();
            if (character.toLowerCase().equals(reversePhraseArr.toLowerCase())) {
                count++;
            }
        }
        return count;
    }
}