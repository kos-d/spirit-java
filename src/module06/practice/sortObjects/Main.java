package module06.practice.sortObjects;

import java.util.Arrays;
import java.util.Comparator;

// sort with interface Comparable, and Comparator

public class Main {
    public static void main(String[] args) {
        
        People[] array = new People[3];
        array[0] = new People("name3", "surname3", 35);
        array[1] = new People("name2", "surname2", 25);
        array[2] = new People("name1", "surname1", 45);
        
        //Arrays.sort(array);
        // sort with comparatorAge
        Arrays.sort(array, new PeopleComparatorAge());
        
        System.out.println(Arrays.toString(array));
        
        // sort with comparatorName
        Arrays.sort(array, new PeopleComparatorName());
        
        System.out.println(Arrays.toString(array));
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