package module03.homework.autocheck;
import java.util.Arrays;
public class HarekCity {
    //create empty array
    public String[] createEmptyArray() {
        String[] result = new String[0];
        return result;
    }
    public int[] createAgeArray(int age1, int age2, int age3, int age4) {
        int[] ageArray = {age1, age2, age3, age4};
        return ageArray;
        //or
        //return new int[] {age1, age2, age3, age4};
    }
    public void fixNames(String[] names, String[] toReplace) {
        names[1] = toReplace[0];
        names[3] = toReplace[1];
    }
    public String firstAndLastTogether(String[] names1) {
        String[] words = {" ", "AND", "TOGETHER"};
        String result = names1[0] + words[0] + words[1] + words[0] + names1[9] + words[0] + words[2];
        return result; 
    }
    /*
    public String firstAndLastTogether(String[] names) {
        return names[0] + " AND " + names[9] + " TOGETHER";
    }
     */
    public void changeElectResult(String[] results) {
        String tmp = results[0];
        results[0] = results[results.length -1];
        results[results.length -1] = tmp;
    }
    public String[] changeElectResultAgain(String[] results) {
        String[] tmpArray = new String[3];
        tmpArray[0] = results[2];
        tmpArray[1] = results[3];
        tmpArray[2] = results[4];
        return tmpArray;
    }

    public static void main(String[] args) {
        String[] arr = new HarekCity().createEmptyArray();
        System.out.println(Arrays.toString(arr));

        int[] ageArray = new HarekCity().createAgeArray(10, 20, 30, 40);
        System.out.println(Arrays.toString(ageArray));

        String[] names = new String[]{"mixa", "ukio", "barek", "krou", "fiha"};
        String[] toReplace = new String[]{"lopr", "boki"};
        new HarekCity().fixNames(names, toReplace);
        System.out.println(Arrays.toString(names));

        String[] names1 = new String[] {"io", "pu", "re", "max", "kok", "mis", "hit", "kio", "pax", "rew"};
        System.out.println(new HarekCity().firstAndLastTogether(names1));
/*
        String[] results = new String[]{"miho", "hut"};
        new HarekCity().changeElectResult(results);
        System.out.println(Arrays.toString(results));
  */
        String[] results = new String[] {"mix", "max", "pex", "fux", "rox"};
        String[] changeResults = new
                HarekCity().changeElectResultAgain(results);
        System.out.println(Arrays.toString(changeResults));
    }    
}
