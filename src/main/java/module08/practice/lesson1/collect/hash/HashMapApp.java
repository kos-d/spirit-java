package module08.practice.lesson1.collect.hash;

// dictionary key - value
// не горантирует порядок в коллекции HashMap()
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapApp {
    public static void main(String[] args) {
        
        Map<Person, Integer> map = new HashMap<>();
        
       map.put(new Person("vasya", 10), 1000); // 100       first create hashCode, create bucket
       map.put(new Person("kolya", 12), 2000); // 200
       map.put(new Person("oleg", 15), 3000);  // 100  collision
       
       Iterator<Map.Entry<Person, Integer>> iterator = map.entrySet().iterator();
       
       while (iterator.hasNext()) {
           System.out.println(iterator.next());
       }
       
        Person person1 = new Person("vasya", 10);
        Person person2 = new Person("oleg", 15);        
        
        Integer get1 = map.get(person1);
        Integer get2 = map.get(person2);        
        
        System.out.println("get -> " + get1);
        System.out.println("get -> " + get2);
        
        
        System.out.println("te");        
    }
}