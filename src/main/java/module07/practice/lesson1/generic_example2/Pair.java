//package module07.practice.lesson1.generic_example2;
//
//public class Pair <K, V> {
//    
//    //private Integer key;
//    
//    //private String value;
//    
//    private K key;
//    
//    private V value;
//    
//    private Pair(K key, V value) {
//        this.key = key;
//        this.value = value;
//    }
//    // fabric method
//    public static <E, V> Pair<E, V> of(E key, V value) {        
//        return new Pair(key, value);
//    }
//    
//
//
////    // fabric method
////    public static<K, V> Pair<K, V> of(K key, V value) {
////        if (key == null) {
////            throw new RuntimeException("key = null");
////        }
////        return new Pair(key, value);
////    }
//
//    public K getKey() {
//        return key;
//    }
//
//    public void setKey(K key) {
//        this.key = key;
//    }
//
//    public V getValue() {
//        return value;
//    }
//
//    public void setValue(V value) {
//        this.value = value;
//    }
//
//    @Override
//    public String toString() {
//        return "Pair{" + "key=" + key + ", value=" + value + '}';
//    }
//}