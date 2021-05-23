package offtop.nix;

public class NameArgs {
    public static void main(String[] args) {
        String result = nameArgs(args);
        System.out.println(result);
        
    }
    public static String nameArgs(String[] arr) {
        int index = 0;
        String name = arr[index];
        String surname = arr[index++];
        /*
        String name = arr[0];
        String surname = arr[1];
        */
//        for (int i = 0; i < arr.length; i++) {
//            String name = arr[0];
//            String surname = arr[1];
//            System.out.printf("%s %n %s",  name, surname);
//        }
        return name + "\n" + surname;
    }
}