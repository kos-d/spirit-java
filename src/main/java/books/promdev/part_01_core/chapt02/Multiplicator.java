package books.promdev.part_01_core.chapt02;

public class Multiplicator {
    public static Matrix multiply(Matrix p, Matrix q)
                throws MultipleException {
        int v = p.getVerticalSize();
        int h = q.getHorizontalSize();
        int temp = p.getHorizontalSize();
        
        if (temp != q.getVerticalSize())
                throw new MultipleException();
        Matrix result = new Matrix(v, h);
        
        for (int i = 0; i < v; i++) {
            for (int j = 0; j < h; j++) {
                int value = 0;
                for (int k = 0; k < temp; k++) {
                    value += p.getElement(i, k) * q.getElement(k, j);
                }
                result.setElement(i, j, value);
            }
        }
        return result;
    }
}