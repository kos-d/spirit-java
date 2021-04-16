package module06.homework.autocheck;

class NameCounterTest {
    public static void main(String[] args) {
        //1
        System.out.println(new NameCounter().count("Mars is great planet"));
        //2
        System.out.println(new NameCounter().count("Moon is near Earth"));
        //0
        System.out.println(new NameCounter().count("SPACE IS GREAT"));
    }
}
class NameCounter {
    public int count(String text) {
        
        String[] textArr = text.split(" ");
        int count = 0;
        for (String word : textArr) {
            if (word.substring(0, 1).equals(word.substring(0, 1).toUpperCase())) {
                if (word.substring(1, 2).equals(word.substring(1, 2).toLowerCase())) {
                    count++;
                }
            }
        }
        return count;
    }
}