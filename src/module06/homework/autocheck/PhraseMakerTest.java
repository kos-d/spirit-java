package module06.homework.autocheck;

class PhraseMakerTest {
    public static void main(String[] args) {
        String[] words = {"Life", "is", "great", "think"};
        
        System.out.println(new PhraseMaker().join(words));
    }
}

class PhraseMaker {

    public String join(String[] words) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (word.length() <= 3) {
                word = word.toUpperCase();
            } else {
                word = word.toLowerCase();
            }
            result.append(word);
            if (i != words.length - 1) {
                result.append(" ");
            }
        }
        return result.toString();
    }
}

/*
class PhraseMaker {

    public String join(String[] words) {
        String result = "";
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (word.length() <= 3) {
                word = word.toUpperCase();
            } else {
                word = word.toLowerCase();
            }
            result += word;
            if (i != words.length - 1) {
                result += " ";
            }
        }
        return result;
    }
}

*/
