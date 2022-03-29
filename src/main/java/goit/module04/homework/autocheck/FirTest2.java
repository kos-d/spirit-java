package goit.module04.homework.autocheck;

class FirTest2 {
    public int test(FirNum firNum, int number) {
        return firNum.calc(number);
    }

    public static void main(String[] args) {
        FirNum firNum = new FirNumBasis();
        FirTest firTest = new FirTest();

        //Should be 20
        System.out.println(firTest.test(firNum, 9));
    }
}

class FirNum2 {
    public int calc(int n) {
        return n;
    }
}

class FirNumSum2 extends FirNum2 {
    @Override
    public int calc(int n) {
        int sum = 0;
        for(int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}

class FirNumFactorial2 extends FirNum2 {
    @Override
    public int calc(int n) {
        int result = 1;
        for(int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}

class FirNumMultiplyOdd2 extends FirNum2 {
    @Override
    public int calc(int n) {
        int result = 1;
        for(int i = 1; i <= n; i++) {
            if (i%2 != 0) {
                result *= i;
            }
        }
        return result;
    }
}

class FirNumFizzBuzz2 extends FirNum2 {
    @Override
    public int calc(int n) {
        int result = 0;
        for(int i = 1; i <= n; i++) {
            if ((i % 3 == 0 || i % 5 == 0) && !(i % 15 == 0)) {
                result += i;
            }
        }
        return result;
    }
}