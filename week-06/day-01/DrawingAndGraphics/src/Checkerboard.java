import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {
    public static void mainDraw(Graphics g){
        g.fillRect(20,20,WIDTH, HEIGHT);
        for (int i = 20; i <= WIDTH ; i += 20){
            for (int j = 20; j <= HEIGHT ; j += 20){
                g.clearRect(i, j,10,10);
            }
        }
        for (int i = 30; i <= WIDTH ; i += 20){
            for (int j = 30; j <= HEIGHT ; j += 20){
                g.clearRect(i,j,10,10);
            }
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
