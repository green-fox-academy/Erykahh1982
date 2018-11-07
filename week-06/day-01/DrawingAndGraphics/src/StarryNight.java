import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class StarryNight {
    public static void mainDraw(Graphics g) {

        g.setColor(Color.black);
        g.fillRect(0,0,WIDTH,HEIGHT);
        for (int i = 0; i < 40; i++) {
            drawSquare(randomCoordinate(),randomCoordinate(),g);
        }
    }

    public static int randomCoordinate(){
        return (1 + (int)(Math.random()*320 - 5));
    }

    public static void drawSquare(int x, int y, Graphics g){

        Color randomgrey = Color.getHSBColor(1.0F, 0.0F, (float)Math.random());
        g.setColor(randomgrey);
        g.fillRect(randomCoordinate(), randomCoordinate(), 5, 5);

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
