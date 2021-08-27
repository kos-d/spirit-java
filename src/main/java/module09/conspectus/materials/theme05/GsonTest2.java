package module09.conspectus.materials.theme05;
// JSON - JavaScript Object Notation - это текстовый формат хранения и передачи данных.

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


public class GsonTest2 {
    public static void main(String[] args) {
        String json = "{\n" +
                " \"name\": \"Bill\", \n" +
                " \"age\": 30, \n" +
                " \"height\": 1.78, \n" +
                " \"married\": true \n" +
                "}";
        Person person = new Gson().fromJson(json, Person.class);
        System.out.println(person.getName());
        System.out.println(person.getAge());
        System.out.println(person.getHeight());
        System.out.println(person.getMarried());
    }
}