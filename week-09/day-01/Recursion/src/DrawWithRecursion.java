import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class DrawWithRecursion {
  public static void mainDraw(Graphics graphics) {
    drawShapeRecursively(0, 0, 600, 3, graphics);
  }

  public static void drawShape(int x, int y, int size, int n, Graphics graphics) {

    graphics.setColor(Color.black);
    graphics.drawLine(x + size / 3, y + 0, x + size / 3, y + size);
    graphics.drawLine(x + 2 * size / 3, y + 0, x + 2 * size / 3, y + size);
    graphics.drawLine(x + 0, y + size / 3, x + size, y + size / 3);
    graphics.drawLine(x + 0, y + 2 * size / 3, x + size, y + 2 * size / 3);
  }

  public static void drawShapeRecursively(int x, int y, int size, int n, Graphics graphics) {
    if (n == 0) {
      return;
    } else {
      drawShape(x, y, size, n, graphics);
      drawShapeRecursively(x + size / 3, y + 0, size / 3, n - 1, graphics);
      drawShapeRecursively(x + 2 * size / 3, y + size / 3, size / 3, n - 1, graphics);
      drawShapeRecursively(x + 0, y + size / 3, size / 3, n - 1, graphics);
      drawShapeRecursively(x + size / 3, y + 2 * size / 3, size / 3, n - 1, graphics);
    }
  }


  // Don't touch the code below
  static int WIDTH = 600;
  static int HEIGHT = 600;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    ImagePanel panel = new ImagePanel();
    panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
    jFrame.add(panel);
    panel.setBackground(Color.YELLOW);
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
    jFrame.pack();
  }

  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);
    }
  }
}