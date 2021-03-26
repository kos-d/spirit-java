package module03.homework.autocheck;

public class ATM {

    public int countBanknotes(int sum) {
        int count = sum;
        int result = 0;
        int iter = 0;
        int [] banknotes = {500, 200, 100, 50, 20, 10, 5, 2, 1};

        while (iter < banknotes.length) {
            if (count / banknotes[iter] != 0) {
                result = result + count / banknotes[iter];
                count = count % banknotes[iter];
            }
            iter++;
        }
        return result;
    }

    public static void main(String[] args) {
        // automated teller machine
        ATM machine = new ATM();

        System.out.println(machine.countBanknotes(500));
        System.out.println(machine.countBanknotes(578));
    }
}
