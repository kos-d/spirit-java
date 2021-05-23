package module06.homework.autocheck;

class AvgWordLengthTest {
    public static void main(String[] args) {
        //6
        System.out.println(new AvgWordLength().count("Launch Rocket"));
        //4.5
        System.out.println(new AvgWordLength().count("Life is strange thing"));
    }
}
class AvgWordLength {
    public double count(String phrase) {
        String[] phraseArr = phrase.split(" ");
        double count = phraseArr.length;
        double wordsLength = 0;
        for (String word : phraseArr) {
            wordsLength += word.length();
        }
        return wordsLength / count;        
    }
}