package module03.practice;

public class SwitchLoopsApp {
    public static void main(String[] args) {

        String name = "sun";
        switch (name) {
            case "sun" :
                System.out.println("*");
                //break;
            case "mon" :
                System.out.println("**");
                break;
            default:
                System.out.println("***");
                break;
        }

    }
}
