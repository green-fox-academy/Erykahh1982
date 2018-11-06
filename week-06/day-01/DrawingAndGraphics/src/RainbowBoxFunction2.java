import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction2 {
    public static void mainDraw(Graphics g) {

        for (int i = 0; i < 20; i++) {
            int size = randomWidthHeight();
            int color = randomColor();
            int color2 = randomColor();
            int color3 = randomColor();
            Color generalColor = new Color(color, color2, color3);
            drawRandomSquare(size, generalColor, g);
        }
    }

    private static void drawRandomSquare(int size, Color color, Graphics g) {
        g.setColor(color);
        g.fillRect(50, 50, size, size);
    }

    public static int randomColor() {
        return ((int) (Math.random() * 256));
    }

    public static int randomCoordinate() {
        return (1 + (int) (Math.random() * 320));
    }

    public static int randomWidthHeight() {
        return (1 + (int) (Math.random() * 320));
    }
    // Create a square drawing function that takes 2 parameters:
    // The square size, and the fill color,
    // and draws a square of that size and color to the center of the canvas.
    // Create a loop that fills the canvas with rainbow colored squares.


    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
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
