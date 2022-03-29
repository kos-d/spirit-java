package goit.module06.homework.autocheck;

class UniqueCharCounterTest {
    public static void main(String[] args) {
        UniqueCharCounter charCounter = new UniqueCharCounter();
        //3
        System.out.println(charCounter.count("123"));
        //4
        System.out.println(charCounter.count("ab100"));
        //3
        System.out.println(charCounter.count("Java"));
    }
}
class UniqueCharCounter {
    public int count(String phrase) {
        
        char[] charArr = phrase.toLowerCase().toCharArray();
        int count = phrase.length();
        int i;
        for (i = 0; i < charArr.length; i++) {
            if (i != phrase.toLowerCase().indexOf(charArr[i])) {
                count--;
            }
        }
        return count;
    }
}