import javax.swing.*;
import java.awt.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

    public class LinePlay {
        public static void mainDraw(Graphics graphics) {

            graphics.setColor(Color.MAGENTA);
            for (int i = 0; i < 15; i++) {
                graphics.drawLine( i * 20 ,0, 320,i * 20);
            }
            graphics.setColor(Color.GREEN);
            for (int j = 0; j < 15 ; j++) {
                graphics.drawLine(0, j * 20, j * 20, 320);
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
