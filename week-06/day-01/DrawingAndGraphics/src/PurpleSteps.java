import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps {
    public static void mainDraw(Graphics g) {
        int position = 10;
        for (int i = 0; i < 20; i++) {
            int side = 10;
            drawSquare(g, side, position);
            position = side + position;
        }
    }

    public static void drawSquare (Graphics square, int side, int position) {
        square.setColor(Color.black);
        square.drawRect(position,position, side, side);
        square.setColor(Color.magenta);
        square.fillRect(position+1,position+1,side-1,side-1);
    }

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