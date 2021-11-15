package books.language;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public class MyPanel extends JPanel {
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.red);
        g2.drawRect(0, 0, 100, 100);
        g2.setColor(Color.blue);
        g2.fillRect(200, 0, 100, 100);
    }    
}