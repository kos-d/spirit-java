package goit.module04.homework.autocheck;

public class FirTest {
    public int test(FirNum firNum, int number) {
        return firNum.calc(number);
    }

    public static void main(String[] args) {
        //FirNum firNum = new FirNum();
        //FirTest firTest = new FirTest();
        //System.out.println(firTest.test(firNum, 10));

        /*FirNum firNum = new FirNumSum();
        FirTest firTest = new FirTest();
        System.out.println(firTest.test(firNum, 3));*/

        /*FirNum firNum = new FirNumFactorial();
        FirTest firTest = new FirTest();
        System.out.println(firTest.test(firNum, 5));
        System.out.println(firTest.test(firNum, 0));*/

        /*FirNum firNum = new FirNumMultiplyOdd();
        FirTest firTest = new FirTest();
        System.out.println(firTest.test(firNum, 5));*/

        /*FirNum firNum = new FirNumFizzBuzz();
        FirTest firTest = new FirTest();
        //Should be 83
        System.out.println(firTest.test(firNum, 20));*/

        FirNum firNum = new FirNumBasis();
        FirTest firTest = new FirTest();

        //Should be 20
        System.out.println(firTest.test(firNum, 9));

    }
}
class FirNum {
    public int calc(int n) {
        return n;
    }
}
class FirNumSum extends FirNum {
    @Override
    public int calc(int n) {
        int result = 0;
        for (int i = 0; i <= n; i++) {
            result += i;
        }
        return result;
    }
}
class FirNumFactorial extends FirNum {
    @Override
    public int calc(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
class FirNumMultiplyOdd extends FirNum {
    @Override
    public int calc(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                continue;
            }
            result *= i;
        }
        return result;
    }
}
class FirNumFizzBuzz extends FirNum {
    @Override
    public int calc(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            if (((i % 3) == 0) && ((i % 5) == 0)) {
                 continue;
            }
            if (((i % 3) == 0) || ((i % 5) == 0)) {
                result += i;
            }
            continue;
        }
        return result;
    }
}
class FirNumBasis extends FirNum {
    @Override
    public int calc(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                result += i;
            }
            continue;
        }
        return result / 2;
    }
}
