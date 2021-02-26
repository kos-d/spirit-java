
import java.util.Scanner;

class SomeFile {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int i = 1;
        int k = 0;
        Friends f1 = new Friends();
        Friends f2 = new Friends();
        Friends f3 = new Friends();
        Friends f4 = new Friends();
        Friends f5 = new Friends();

        while (i!=3){
            System.out.println("Укажите что нужно делать: 1 - добавить друга, " +
                    "2 - показать всех друзей, " +
                    "3 - закончить программу");
            i = in.nextInt();
            if (i == 1) {
                k++;
                switch (k) {
                    case (1):
                        f1.setFriends();
                    case (2):
                        f2.setFriends();
                    case (3):
                        f3.setFriends();
                    case (4):
                        f4.setFriends();
                    case (5):
                        f5.setFriends();
                    default:
                        i = 3;
                }
            }

            if (i == 2)
                for (int j = 0; j < 6; j++){
                    switch (j) {
                        case (1):
                            f1.printFriends();
                        case (2):
                            f2.printFriends();
                        case (3):
                            f3.printFriends();
                        case (4):
                            f4.printFriends();
                        case (5):
                            f5.printFriends();
                    }
                }






        }





    }
}