import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FunctionToCenter {
    public static void mainDraw(Graphics graphics) {

        graphics.setColor(Color.MAGENTA);
        for (int i = 0; i < 16; i++) {
            graphics.drawLine( i * 20 , 0, 160,160);
        }
        for (int j = 0; j < 16 ; j++) {
            graphics.drawLine(320, j * 20, 160, 160);
        }
        for (int k = 0; k < 16 ; k++) {
            graphics.drawLine(k * 20, 320, 160, 160);
        }
        for (int l = 0; l < 16 ; l++) {
            graphics.drawLine(0, l * 20, 160, 160);
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
