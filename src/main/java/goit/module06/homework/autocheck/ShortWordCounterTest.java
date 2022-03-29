package goit.module06.homework.autocheck;

class ShortWordCounterTest {
    public static void main(String[] args) {
        System.out.println(new ShortWordCounter().count("Java is great language", 2));
        
        ShortWordCounter counter = new ShortWordCounter();
        
        System.out.println(counter.count("Java is great language", 4));
        
        System.out.println(counter.count("Java is great language", 5));
        
        System.out.println(counter.count("Java is great language", 100));
    }
}

class ShortWordCounter {
    public int count(String phrase, int minLength) {
        int count = 0;
        String[] phraseArr = phrase.split(" ");
               
        for (String character : phraseArr) {
            if (character.length() <= minLength) {
                count++;
            }
        }
        return count;
    }
}
        
        
        
        
        
        
        
        
        
        
        
      
        
        
        
        
        
        
        
        
        
        

//class ShortWordCounter {
//    public int count(String phrase, int minLength) {
//        int countMinLength = 0;
//        String[] phraseArr = phrase.split(" ");
//        
//        for (String el : phraseArr) {
//            if (el.length() <= minLength) {
//                countMinLength++;
//            }
//        }
//        return countMinLength;
//    }
//}