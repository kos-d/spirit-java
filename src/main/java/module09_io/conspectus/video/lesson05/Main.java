package module09_io.conspectus.video.lesson05;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Integer element = 10;
        Object object = null;        
        object = element;        
        System.out.println(object);
        
        
        // Not work
//        List<Integer> list = new ArrayList<>();
//        List<Object> objects = null;
        
        GenericType<Object> type = new GenericType<>();
        type.set(1000);
        GenericType<Number> type1 = new GenericType<>();
        type1.set(1000);
        
        boolean equals = GenericUtils.isEquals(type, type1);
        System.out.println(equals);
//        GenericUtils.isEquals(type1, type1);
        
    }
}