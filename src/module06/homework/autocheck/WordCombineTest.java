package module06.homework.autocheck;

class WordCombineTest {
    public static void main(String[] args) {
        //true
        System.out.println(new WordCombine().canCombine("Forest", "tor"));
        //true
        System.out.println(new WordCombine().canCombine("Magic", "Mama"));
        //false
        System.out.println(new WordCombine().canCombine("War", "Piece"));
    }
}
class WordCombine {
    public boolean canCombine(String sourceWord, String targetWord) {
        
        boolean result = false;
        
        String[] sourceWordArr = sourceWord.toLowerCase().split("");
        String[] targetWordArr = targetWord.toLowerCase().split("");
        
        for (String sourceEl : sourceWordArr) {
            for (String targetEl : targetWordArr) {
                if (targetEl.equals(sourceEl)) {
                    result = true;
                }
            }
        }
        return result;
    }
}