import java.util.Scanner;

public class Friends {

    private String name;
    private int age;
    private String proff;
/*
    public Friends(String name, int age, String proff){
        this.name = name;
        this.age = age;
        this.proff = proff;
    }
*/
    public void setFriends() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите попорядку имя, возраст, професию друга:");
        this.name = in.nextLine();
        this.age = in.nextInt();
        this.proff = in.nextLine();
    }

    public void printFriends(){
        System.out.printf("Имя: %10s Возраст: %3d Проффесия:%s\n", name, age, proff);
    }




}
