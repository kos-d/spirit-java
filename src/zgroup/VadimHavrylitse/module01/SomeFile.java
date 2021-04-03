package zgroup.VadimHavrylitse.module01;

import java.util.*;


class SomeFile {

    public static void main(String[] args) {

        List<Friends> friend = new ArrayList<Friends>();
        Scanner in = new Scanner(System.in);
        int i = 1;
        while (i != 4) {
            System.out.println("Укажите что нужно делать: 1 - добавить друга, " +
                    "2 - показать всех друзей, " +
                    "31/32 - отсортировать по возрасту/по имени, " +
                    "4 - закончить программу");
            i = in.nextInt();
            switch (i) {
                case 1:
                    friend.add(new Friends());
                    break;
                case 2:
                    printCollection(friend);
                    break;
                case 31:
                    Collections.sort(friend, new FriendsCompereAge());
                    break;
                case 32:
                    Collections.sort(friend, new FriendsCompereName());
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Вы не правильно ввели цифру!");


            }

        }
    }


    private static void printCollection(List<Friends> friend) {
        Iterator<Friends> iterator = friend.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }


}
