import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ConnectTheDots {
    public static void mainDraw(Graphics g) {

        int[][] shape1 = {{10, 10}, {290, 10}, {290, 290}, {10, 290}};
        int[][] shape2 = {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70}, {120, 100}, {85, 130}, {50, 100}};

        display(shape1, g);
        display(shape2, g);

    }

     public static void display (int[][] array, Graphics graphics) {

         int[] xCoordinates = new int[array.length];
         int[] yCoordinates = new int[array.length];

         for (int i = 0; i < array.length; i++) {
             xCoordinates[i] = array[i][0];
             yCoordinates[i] = array[i][1];
         }
         graphics.setColor(Color.GREEN);
         graphics.drawPolygon(xCoordinates, yCoordinates, array.length);

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
