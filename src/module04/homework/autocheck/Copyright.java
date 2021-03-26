package module04.homework.autocheck;

final class Copyright {
    public void print() {
        System.out.println("SpaceWarriors Inc.");
    }

    public static void main(String[] args) {
        Copyright copyright = new Copyright();
        copyright.print();

        new Copyright().print();
    }
}