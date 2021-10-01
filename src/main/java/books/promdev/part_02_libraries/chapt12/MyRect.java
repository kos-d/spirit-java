package books.promdev.part_02_libraries.chapt12;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MyRect extends JApplet {
private Rectangle rect =
new Rectangle(20, 20, 100, 60);
private class AppletMouseListener//блок обработки событий
implements MouseListener {
/* реализация всех пяти методов интерфейса MouseListener */
public void mouseClicked(MouseEvent me) {
int x = me.getX();
int y = me.getY();
if (rect.contains(x, y)) {
showStatus(
"клик в синем прямоугольнике");
} else {
showStatus("клик в белом фоне");
}
}
// реализация остальных методов интрефейса пустая
public void mouseEntered(MouseEvent e) {}
public void mouseExited(MouseEvent e) {}
public void mousePressed(MouseEvent e) {}
public void mouseReleased(MouseEvent e) {}
}
public void init() {
setBackground(Color.WHITE);
/* регистрация блока прослушивания */
addMouseListener(new AppletMouseListener());
}
public void paint(Graphics g) {
g.setColor(Color.BLUE);
g.fillRect(rect.x, rect.y,
rect.width, rect.height);
}
}