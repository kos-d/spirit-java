package module06.homework.autocheck;

class BigOrSmallTest {
    public static void main(String[] args) {
        //Small
        System.out.println(new BigOrSmall(). calculate("Java"));
        //Big
        System.out.println(new BigOrSmall(). calculate("JAVA"));
        //Same
        System.out.println(new BigOrSmall(). calculate("jAvA"));
    }
}
class BigOrSmall {
    public String calculate(String text) {
        
        String result = "";
        
        String[] textArr = text.replace(" ", "").split("");
        
        int countBig = 0;
        int countSmall = 0;
        
        for (String character : textArr) {
            if (character.equals(character.toUpperCase())) {
                countBig++;
            } else {
                countSmall++;
            }
        }
        
        String[] wordArr = { "Small", "Big", "Same" };
        
        if (countSmall > countBig) {
            result = wordArr[0];
        } else if (countBig > countSmall) {
            result = wordArr[1];
        } else {
            result = wordArr[2];
        }
        return result;
    }
}