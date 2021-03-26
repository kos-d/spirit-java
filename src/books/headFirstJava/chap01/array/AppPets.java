package books.headFirstJava.chap01.array;

public class AppPets {

    public static void main(String[] args) {
        String[] pets = {"Fido", "Zeus", "Bin"};
        
        int x = pets.length;

        System.out.println(x);

        String s = pets[0];
        s = s + " " + "is a dog";

        System.out.println(s); 
    }
}
