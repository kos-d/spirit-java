package books.promdev.part_01_core.chapt05_pattern._04_behavioral._02_strategy;

public class SortByMax extends Operation {
    @Override
    public void sort(int[] mass) {
        for (int i = 0; i < mass.length; ++i) {
            for (int j = i; j < mass.length; ++j) {
                if (mass[j] > mass[i]) {
                    int m = mass[i];
                    mass[i] = mass[j];
                    mass[j] = m;
                }
            }
        }
        System.out.print("SortByMax : ");
        for (int i : mass) 
            System.out.print(i + " ");
        System.out.println('\n');
    } 
}