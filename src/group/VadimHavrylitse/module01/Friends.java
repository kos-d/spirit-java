package VadimHavrylitse.module01;
import java.util.Scanner;

public class Friends {

    private String name;
    private int age;
    private String proff;

    public void setFriends() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите попорядку имя, возраст, професию друга:");
        this.name = in.nextLine();
        this.age = in.nextInt();
        this.proff = in.next();
        }

    public void printFriends(){
        System.out.printf("Имя: %-10s Возраст: %-3d Проффесия:%s\n", name, age, proff);
    }




}
