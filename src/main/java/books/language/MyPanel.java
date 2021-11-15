package books.language;

import javax.swing.*;
import java.awt.*;
// MyPanel extends JPanel, which will eventually be placed in a JFrame

public class MyPanel extends JPanel {
// custom painting is performed by the paintComponent method

    @Override
    public void paintComponent(Graphics g) {
// clear the previous painting
        super.paintComponent(g);
// cast Graphics to Graphics2D
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.red); // sets Graphics2D color
// draw the rectangle
        g2.drawRect(0, 0, 100, 100); // drawRect(x-position, y-position, width, height)
        g2.setColor(Color.blue);
        g2.fillRect(200, 0, 100, 100); // fill new rectangle with color blue
    }
}
