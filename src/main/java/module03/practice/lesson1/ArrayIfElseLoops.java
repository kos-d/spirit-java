package module03.practice.lesson1;

public class ArrayIfElseLoops {
    public static void main(String[] args) {
        
        int[] array = new int[4];
        array[0] = 2;
        array[1] = 8;
        array[2] = 4;
        array[3] = 2;
        
        System.out.println("method forEach()");
        forEach(array);
        System.out.print("\n");
        System.out.println("method forEach1()");
        forEach1(array);
        System.out.print("\n");
        System.out.println("method forEach2()");
        forEach2(array);
        System.out.print("\n");
        System.out.println("method forEachSearch()");
        int forEachSearch = forEachSearch(array, 2);
        System.out.println("namber search - " + forEachSearch);
        
        System.out.print("\n");
        System.out.println("method search()");
        int search = search(array, 2);
        System.out.println("search index = " + search);
    }
    
    public static void forEach(int[] args) {
        int var = 8;
        for (int value : args) {
            boolean result = value == var;
            if (result)  {
                continue;
            }
            System.out.println("value -> " + value);
        }
    }
    
    public static void forEach1(int[] args) {
        Integer var = 4;
        for (Integer value : args) {            
            boolean result = value.equals(var);
            if (result)  {
                continue;
            }
            System.out.println("value -> " + value);
        }
    }
    
    public static void forEach2(int[] args) {        
        for (int value : args) {
            if (value == 4)  {
                System.out.println("+ from if");
            } else {
                System.out.println("* from else");
            }
            System.out.println("value -> " + value);
        }
    }
    
    public static int forEachSearch(int[] args, int number) {
        int count = 0;
        for (int value : args) {
            if (value == number)  {
                count++;
            }
        }
        return count;
    }
    
    public static int search(int[] args, int number) {
        for (int i = 0; i < args.length; i++) {
            if (args[i] == number) {
                return i;
            }
        }
        return -1;
    }
}