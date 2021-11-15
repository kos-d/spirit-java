package books.language;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JFrame;

public class Test {
    JFrame f;
    MyPanel p;
    public Test() {
        f = new JFrame();
        Container c = f.getContentPane();
        c.setLayout(new BorderLayout());
        p = new MyPanel();
        c.add(p);
        f.setSize(400, 400);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        Test t = new Test();
    }
}
