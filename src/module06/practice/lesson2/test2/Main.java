package module06.practice.lesson2.test2;

public class Main {
    
    public static void main(String[] args) {
        
        String[] arr1 = {"1", "2", "3"};
        
        String value = "value";
     
        ArrayWrapper arrayWrapper = new ArrayWrapper(arr1);
        
        StringWrapper stringWrapper = new StringWrapper(value);
        
        //print(arrayWrapper);
        print(stringWrapper);

    }
    
    public static void print(Iterable args) {
        while (args.hasNext()) {
            System.out.println("args.next() " + args.next());
        }
    }
}

//        String[] array = new String[3];
//        for (int i = 0; i < array.length; i++) {
//            String string = array[i];
//            
//        }