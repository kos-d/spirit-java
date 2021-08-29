
package module07_collection.conspectus.materials.theme01;

public class AmphibianTest {

    public static void main(String[] args) {
        Amphibian a = new Amphibian();
        a.fly();
        
        try {
            a.swim();
            System.out.println("From try block");
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}
