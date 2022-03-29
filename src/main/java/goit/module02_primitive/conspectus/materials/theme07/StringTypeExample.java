package goit.module02_primitive.conspectus.materials.theme07;

public class StringTypeExample {
    public static void main(String[] args) {
        
        String name0 = "Ivan";
        String lastName0 = new String("Petrov");
        
        String name1 = "Igor";
        String name2 = "Igor";

        System.out.println(name1.equals(name2));    // true
        
        String x = "Java";
        String y = "java";
        
        System.out.println(x.equalsIgnoreCase(y));  // true
        
        String planet = "Earth";
        int length = planet.length();
        System.out.println(length);                 // 5
        
        String firstName = "Elon";
        String lastName = "Musk";
        String fullName = firstName + " " + lastName;
        
        String languageAndYear = "Java " + 1996;
        
        System.out.println(languageAndYear);
    }
}