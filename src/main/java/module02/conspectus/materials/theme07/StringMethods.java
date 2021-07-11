package module02.conspectus.materials.theme07;

public class StringMethods {
    public static void main(String[] args) {
        String phrase1 = "Back to the future";

        System.out.println(phrase1.toUpperCase());          //BACK TO THE FUTURE
        System.out.println(phrase1.toLowerCase());          //back to the future

        System.out.println("ivan".toUpperCase());           // IVAN
        
        String phrase2 = "Summer is hot";
        
        boolean phraseContains1 = phrase2.contains("Summer"); 
        System.out.println(phraseContains1);                 // true
        
        String phrase = "Java is great language";
        String word = "java";
        
        boolean phraseContains = phrase.toLowerCase().contains(word.toLowerCase());
        System.out.println(phraseContains);
        
        String result = String.join(", ", "apple", "banana", "kiwi");
        System.out.println(result);
        
        String language = "english";
        
        char thirdChar = language.charAt(2);
        System.out.println(thirdChar);
        
        String programmingLanguage = "java";
        System.out.println(programmingLanguage.startsWith("jav"));
        System.out.println(programmingLanguage.endsWith("ava"));
        System.out.println(programmingLanguage.startsWith("help"));
        
        System.out.println("".isEmpty());   // true
        System.out.println(" ".isEmpty());  // false
        
//        System.out.println("".isBlank()); //true
//        System.out.println(" ".isBlank()); //true
//        System.out.println("java".isBlank()); //false

        String replaced = "my name is Ivan".replace("Ivan", "Igor");
        System.out.println(replaced);               // my name is Igor
        
        String source = "never never never";
        String replace = source.replace("n", "");
        System.out.println(replace);                // ever ever ever
        
        System.out.println(" java ".trim());
        
//        String lang = "\njava          \n"; //Здесь есть два переноса строки и много пробелов
//        String cleanLang = lang.strip();

        String text = "This is Sparta!";
        System.out.println(text.substring(0, 4)); //Выведется This, без пробела в конце
    }
}