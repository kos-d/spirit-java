package books.promdev.part_02_libraries.chapt12.test;

import books.promdev.part_02_libraries.chapt12.test.subject.User;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        User user = new User("Ivan", 30, 1);
        
//        System.out.println(user);

        User[] arrayUser = new User[2];
        arrayUser[0] = new User("Nikolay", 31, 2);
        arrayUser[1] = new User("Petr", 32, 3);
        
//        System.out.println(Arrays.toString(arrayUser));
        
        ArrayList<User> list = new ArrayList<>();
        list.add(user);
        list.add(new User("Igor", 33, 4));
        
        list.add(arrayUser[0]);
        list.add(arrayUser[1]);
        
        for (User users : list) {
            System.out.println(users);
        }
//        System.out.println(list);
        System.out.println("------------");
            list.sort(new UserComparatorAge());
            
        for (User users : list) {
            System.out.println(users);
        } 
    }
}

class UserComparatorAge implements Comparator<User> {

    @Override
    public int compare(User o1, User o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}
