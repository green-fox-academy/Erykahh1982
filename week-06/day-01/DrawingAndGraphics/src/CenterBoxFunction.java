import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class CenterBoxFunction {

    public static void mainDraw(Graphics g){
        for (int i = 0; i < 3; i++) {
            drawRandomSquare(randomCoordinate(), randomCoordinate(), g);
        }
    }

    private static void drawRandomSquare(int randomCoordinate, int randomCoordinate1, Graphics g) {
        int size = randomWidthHeight();

        g.setColor(new Color(randomColor(), randomColor(), randomColor(), randomColor()));
        g.drawRect(randomCoordinate(), randomCoordinate(), size, size);
    }

    public static int randomColor(){
        return (1 + (int)(Math.random()*256));
    }

    public static int randomCoordinate(){
        return (1 + (int)(Math.random()*320));
    }

    public static int randomWidthHeight(){
        return (1 + (int)(Math.random() * 320));
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
