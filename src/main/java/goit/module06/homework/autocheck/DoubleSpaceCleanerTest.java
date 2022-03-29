package goit.module06.homework.autocheck;

class DoubleSpaceCleanerTest {
    public static void main(String[] args) {
        DoubleSpaceCleaner cleaner = new DoubleSpaceCleaner();
        
        System.out.println(cleaner.clean("Hello World"));
        System.out.println(cleaner.clean("       Hello              World          "));
    }
}

class DoubleSpaceCleaner {
    public String clean(String phrase) {
        
        String newPhrase = phrase.trim();
        String[] wordsArr = newPhrase.split(" ");
        String[] resultArr = new String[wordsArr.length];
        
        int count = 0;
        int countNull = 0;
        
        for (int i = 0; i < wordsArr.length; i++) {
            if (!wordsArr[i].isEmpty()) {
                resultArr[count++] = wordsArr[i];
            }
        }
        for (int i = 0; i < resultArr.length; i++) {
            if (resultArr[i] == null) {
                countNull++;
            }
        }
        String[] resultWithNullsArr = new String[resultArr.length - countNull];
        for (int i = 0, j = 0; i < resultArr.length; i++, j++) {
            if (resultArr[i] != null) {
                resultWithNullsArr[j] = resultArr[i];
            }
        }
        String result = String.join(" ", resultWithNullsArr);
        return result;
    }
}