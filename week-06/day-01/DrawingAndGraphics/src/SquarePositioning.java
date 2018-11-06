import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;
public class SquarePositioning {

    public static void mainDraw(Graphics graphics) {

        for (int i = 0; i < 3; i++) {
            drawSquare(randomCoordinate(), randomCoordinate(), graphics);
        }
    }

    public static int randomColor(){
        return (1 + (int)(Math.random()*256));
    }

    public static int randomCoordinate(){
        return (1 + (int)(Math.random()*320 - 50));
    }

    public static void drawSquare(int x, int y, Graphics graphics){

        graphics.setColor(new Color(randomColor(), randomColor(), randomColor(), randomColor()));
        graphics.fillRect(randomCoordinate(), randomCoordinate(), 50, 50);
    }

    //    Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 343;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setSize(new Dimension(WIDTH, HEIGHT));
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.add(new ImagePanel());
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }
    static class ImagePanel extends JPanel{
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);

        }
    }

}
