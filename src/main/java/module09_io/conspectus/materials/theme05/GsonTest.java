package module09_io.conspectus.materials.theme05;
// JSON - JavaScript Object Notation - это текстовый формат хранения и передачи данных.

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


public class GsonTest {
    public static void main(String[] args) {
        Person person = new Person("Bill", 30, 1.78, true);
        
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(person);
        
        System.out.println(json);
    }
}