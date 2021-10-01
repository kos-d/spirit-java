package books.promdev.part_01_core.chapt05_pattern._04_behavioral._02_strategy;

public class Sorting {
    private Operation operation = null;
    public Sorting(int operation) {
        switch (operation) {
            case 1: this.operation = new SortByMax();
                break;
            case 2: this.operation = new SortByMin();
                break;
            default: System.out.println("There is no such operation");
        }
    }
    public void sorting(int[] mass) {
        if (operation != null) operation.sort(mass);
        else return;
    }
}