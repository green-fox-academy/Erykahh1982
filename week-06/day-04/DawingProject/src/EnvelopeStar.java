import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EnvelopeStar {
    public static void mainDraw(Graphics g) {

    int lineSteps = 10;

        drawingStarUp(g, 160, 0, lineSteps);
        drawingStarDown(g, 160, 320, lineSteps);
    }

    public static void drawingStarUp(Graphics g, int X, int Y, int lineStep) {
        g.setColor(Color.GREEN);
        for (int i = 0; i < 15; i++) {
            g.drawLine(X, Y, 160 - lineStep, 160);
            g.drawLine(X, Y, 160 + lineStep, 160);
            lineStep = lineStep + 10;
            Y = Y + 10;
        }
    }

    public static void drawingStarDown(Graphics g, int X, int Y, int lineStep) {
        g.setColor(Color.GREEN);
        for (int i = 0; i < 15; i++) {
            g.drawLine(X, Y, 160 - lineStep, 160);
            g.drawLine(X, Y, 160 + lineStep, 160);
            lineStep = lineStep + 10;
            Y = Y - 10;
        }
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
