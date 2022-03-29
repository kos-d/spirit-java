package goit.module06.homework.autocheck;

class WordDeleterTest {
    public static void main(String[] args) {
        WordDeleter wordDeleter = new WordDeleter();
        //Hello
        System.out.println(wordDeleter.remove("Hello Java", new String[] {"Java"}));
        
        System.out.println(wordDeleter.remove("This is Sparta", new String[] {"is"}));
                
    }
}

class WordDeleter {
    public String remove(String phrase, String[] words) {
        
        boolean found = false;
        String[] phraseArr = phrase.split(" ");
        StringBuilder result = new StringBuilder();
        for (String phraseNew : phraseArr) {
            for (String word : words) {
                if (phraseNew.equals(word)) {
                    found = true;
                    continue;
                }
            }
            if (!found) {
                result.append(phraseNew);
                result.append(" ");
            }
            found = false;
        }
        return result.toString().trim();
    }
}