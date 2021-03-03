package books.headFirstJava.chap01.testChap01;

class Test2 {

    public static void main(String[] args) {

        int x = 0;
        int y = 0;
        while (x < 5) {
            //            
            y = y + x;

            //
            System.out.print(x + "" + y + " ");
            x = x + 1;
        }
    }
}
