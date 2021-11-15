package books.language;

import javax.swing.*;
import java.awt.*;

public class Test { //the Class by which we display our rectangle

    JFrame f;
    MyPanel p;

    public Test() {
        f = new JFrame();
// get the content area of Panel.
        Container c = f.getContentPane();
// set the LayoutManager
        c.setLayout(new BorderLayout());
        p = new MyPanel();
// add MyPanel object into container
        c.add(p);
// set the size of the JFrame
        f.setSize(400, 400);
// make the JFrame visible
        f.setVisible(true);
// sets close behavior; EXIT_ON_CLOSE invokes System.exit(0) on closing the JFrame
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public static void main(String[] args) {
        Test t = new Test();
    }
}
