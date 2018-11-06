import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {

    public static void mainDraw(Graphics graphics) {
        for (int i = 0; i < 4; i++) {
            int x = (int) (Math.random() * 1000);
            int y = (int) (Math.random() * 1000);
            int width = (int) (Math.random() * 1000);
            int height = (int) (Math.random() * 1000);
            int red = (int) (Math.random() * 256);
            int green = (int) (Math.random() * 256);
            int blue = (int) (Math.random() * 256);
            drawARectangle(x, y, width, height, red,green, blue, graphics);
        }
    }
    public static void  drawARectangle (int x, int y, int width, int height, int red, int green, int blue,  Graphics graphics){

        graphics.setColor(new Color(red,green,blue));
        graphics.fillRect(x,y,width,height);

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
