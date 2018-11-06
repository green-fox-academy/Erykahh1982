import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class HorizontalLines {
    public static void mainDraw(Graphics graphics) {

        int x1 = 25;
        int y1 = 75;
        int x2 = 50;
        int y2 = 150;
        int x3 = 75;
        int y3 = 225;

        ArrayList<Integer> startingPoint = new ArrayList<>(Arrays.asList(x1, y1, x2, y2 ,x3, y3));

        int x = 0;
        int y = 0;

        for (int i = 0; i < 3; i++) {
            x = startingPoint.get (i * 2);
            y = startingPoint.get(i * 2 + 1);
            Draw50LongLine(x, y, graphics);
        }
    }

    private static void Draw50LongLine(int x, int y, Graphics graphics) {
        graphics.setColor(Color.DARK_GRAY);
        graphics.drawLine(x, y, x + 50, y);
    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 343;

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
