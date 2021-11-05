package books.promdev.part_02_libraries.chapt10.collectionsdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static User createObject(String name, int age) {
        User user = new User(name, age);
        return user;
    }

//    public static User createObject(String name, int age) {
//        User user = new User(name, age);
//        return user;
//    }
    public void tmpMethod() {
        ArrayList<String> words = new ArrayList<>();
        words.add("Hello");
        words.add("world");
        System.out.println(words);

        boolean contains = words.contains("Hello");
        System.out.println("contains: " + contains);

        ArrayList<String> copyWords = new ArrayList<>();

        User userSpanch = createObject("spanch", 20);
        User userPatric = createObject("patric", 30);
        User userSquidi = createObject("squidi", 40);

        Object[] arrayUsers = new Object[3];
//        arrayUsers[0] = userSpanch;
//        arrayUsers[1] = userPatric;
//        arrayUsers[2] = userSquidi;
//        System.out.println("arrayBegin " + '\n' + Arrays.toString(arrayUsers) + '\n' + "arrayEnd");

        ArrayList<User> listUsers = new ArrayList<User>();

        for (int i = 0; i < arrayUsers.length; i++) {
            listUsers.add((User) arrayUsers[i]);
        }
//        System.out.println(listUsers);
//        for (Object ob : arrayUsers) {
//            listUsers.add((User) ob);
//        }
//        System.out.println("listBegin " + '\n' + listUsers + '\n' + "listEnd");

//        listUsers.
//        System.out.print(userSpanch);
//        System.out.println(createObject1("patric", 30));
//        System.out.println(userPatric);
    }

    public static void main(String[] args) {
        Users listUsers = new Users();
        listUsers.createListUsers();
        
        ArrayList<User> list = listUsers.createListUsers();
        
                
        
        System.out.println("list = " + list);
    }
}

//class User {
//
//    private String name;
//    private int age;
//
//    public User() {
//    }
//
//    public User(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    @Override
//    public String toString() {
//        return "User{" + "name=" + name + ", age=" + age + '}' + '\n';
//    }
//
////    @Override
////    public String toString() {
////        return "User: [" + " name: " + name + ", age: " + age + "]" + '\n';
////    }
//}
