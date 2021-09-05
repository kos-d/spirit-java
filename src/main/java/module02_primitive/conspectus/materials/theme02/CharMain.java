package module02_primitive.conspectus.materials.theme02;

public class CharMain {
    public static void main(String[] args) {
        // Символьный тип данных занимает 2 байта в памяти.
        // Символы записываются в одинарных кавычках '.
        char letter = 'x';
        char bigLetter = 'A';
        
        char var = '\u0000';
        
        System.out.println(letter);
        System.out.println(var);
    }
}