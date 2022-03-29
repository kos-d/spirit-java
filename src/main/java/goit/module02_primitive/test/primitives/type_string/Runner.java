package goit.module02_primitive.test.primitives.type_string;

public class Runner {
    public static void main(String[] args) {
        String name1 = "Igor";
        String name2 = "Igor";
        
        boolean equals = name1.equals(name2);
        System.out.println("equals Strings = " + equals);   //true
        
        String planet = "Earth";
        int length = planet.length();
        System.out.println("length Strings = " + length);   //5
        
        String name = "Elon";
        String surname = "Mask";
        String space = " ";
        
        String concat = name + space + surname;
        System.out.println("concat = " + concat);
        
        String phrase = "Back to the future";
        
        String upperCase = phrase.toUpperCase();
        String lowerCase = phrase.toLowerCase();
        System.out.println("UpperCase and LowerCase = " + upperCase + space + lowerCase);
        System.out.println("test.toUpperCase() = " + "test".toUpperCase());
        
        String newPhrase = "Java is great language";
        String word = "java";
        
        boolean phraseContainsWord = newPhrase.toLowerCase().contains(word.toLowerCase());
        System.out.println("phraseContainsWord = " + phraseContainsWord);   //true
        
        String result = String.join(", ", "apple", "banana", "kiwi");
        System.out.println("result join() = " + result);
        
        String language = "english";
        char thirdChar = language.charAt(2);    //g
        System.out.println("charAt() = " + thirdChar);
        
        String programmingLanguage = "Java";
        System.out.println("");
    }
}