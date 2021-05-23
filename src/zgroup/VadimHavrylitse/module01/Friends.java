package zgroup.VadimHavrylitse.module01;

import java.util.Comparator;
import java.util.Scanner;

public class Friends implements Comparable {

    private String name;
    private int age;
    private String proff;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setProff(String proff) {
        this.proff = proff;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getProff() {
        return proff;
    }

    public Friends() {
        setFriends();
    }

    public void setFriends() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите попорядку имя, возраст, професию друга:");
        this.name = in.nextLine();
        this.age = in.nextInt();
        this.proff = in.next();
    }

    @Override
    public String toString() {
        return String.format("Имя: %-10s Возраст: %-3d Проффесия:%s", name, age, proff);
    }


    @Override
    public int compareTo(Object o) {
        Friends other = (Friends) o;
        return Integer.compare(this.age, other.age);
    }


}


