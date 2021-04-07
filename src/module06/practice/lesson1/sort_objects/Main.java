package module06.practice.lesson1.sort_objects;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        /*
        int[] array = {2, 1, 8, 5, 4, 3};
        
        Arrays.sort(array);
        System.out.println("sort = " + Arrays.toString(array));
        */
        
        People[] array = new People[3];
        array[0] = new People("bname3", "surname3", 35);
        array[1] = new People("cname2", "surname2", 25);
        array[2] = new People("aname1", "surname1", 45);
        
        //Comparable
        //Arrays.sort(array);
        
        Arrays.sort(array, new PeopleComparatorAge());        
        System.out.println("sort = " + Arrays.toString(array));
        
        Arrays.sort(array, new PeopleComparatorName());        
        System.out.println("sort = " + Arrays.toString(array));
    }
}
class PeopleComparatorAge implements Comparator<People> {

    @Override
    public int compare(People o1, People o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}
class PeopleComparatorName implements Comparator<People> {

    @Override   
    public int compare(People o1, People o2) {
        return o1.getName().compareTo(o2.getName());
    }
}