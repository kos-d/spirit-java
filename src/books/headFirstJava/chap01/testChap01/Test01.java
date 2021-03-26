package books.headFirstJava.chap01.testChap01;

class Test01 {

    public static void main(String[] args) {


        int x = 0;
        int y = 0;
        System.out.println(x + " x-test-1");        
        System.out.println(y + " y-test-1");        
        while (x < 5) {
        System.out.println(x + " x-test-2");        
        System.out.println(y + " y-test-2");        
            //            
            y = x - y;
        System.out.println(x + " x-test-3");        
        System.out.println(y + " y-test-3");        

            //
            System.out.print(x + "" + y + " ");
        System.out.println(x + " x-test-4");        
        System.out.println(y + " y-test-4");        
            x = x + 1;
        System.out.println(x + " x-test-5");        
        System.out.println(y + " y-test-5");        
        }
    }
}
