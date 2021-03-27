package module05.test.equals_test;

public class EqualsTest {
    int f1 = -1;
    int f2 = -1;
    
    public EqualsTest (final int f1, final int f2) {
        this.f1 = f1;
        this.f2 = f2;
    }
    public int getF1() {
        return this.f1;
    }
    public int getF2() {
        return this.f2;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj == null) {
            return false;
        } else if (getClass() != obj.getClass()) {
            return false;
        }
        EqualsTest other = (EqualsTest) obj;
        if (f1 != other.getF1()) {
            return false;
        } else if (f2 != other.getF2()) {
            return false;
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + f1;
        result = prime * result + f2;
        return result;
    }
}
