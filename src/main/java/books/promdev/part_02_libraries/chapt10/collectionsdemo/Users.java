package books.promdev.part_02_libraries.chapt10.collectionsdemo;

import java.util.ArrayList;

public class Users {

    public static ArrayList<User> createListUsers() {
        User userSpanch = createObject("spanch", 20);
        User userPatric = createObject("patric", 30);
        User userSquidi = createObject("squidi", 40);

        ArrayList<User> listUsers = new ArrayList<User>();
        listUsers.add(userSpanch);
        listUsers.add(userPatric);
        listUsers.add(userSquidi);

        return listUsers;
    }

    public static User createObject(String name, int age) {
        User user = new User(name, age);
        return user;
    }
}
