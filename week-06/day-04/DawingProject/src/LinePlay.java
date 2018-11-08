import javax.swing.*;
import java.awt.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

    public class LinePlay {
        public static void mainDraw(Graphics graphics) {

            int lineStep = 20;

            graphics.setColor(Color.MAGENTA);
            for (int i = 0; i < 16; i++) {
                graphics.drawLine( i * lineStep ,0, WIDTH,i * lineStep);
            }
            graphics.setColor(Color.GREEN);
            for (int j = 0; j < 16 ; j++) {
                graphics.drawLine(0, j * lineStep, j * lineStep, HEIGHT);
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
