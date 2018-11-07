import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {

    public static void mainDraw(Graphics graphics){
        for (int i = 0; i < 20; i++) {
            drawSquare(graphics);
        }
    }

    public static int randomColor() {
        return ((int)(Math.random() * 256));
    }

    public static int randomSize(){
        return ((int)(Math.random() * 320));
    }

    public static void drawSquare(Graphics graphics){
        int size = randomSize();
        int x = (WIDTH / 2) - (size / 2);
        int y = (HEIGHT / 2) - (size / 2);

        graphics.setColor(new Color(randomColor(), randomColor(), randomColor(), randomColor()));
        graphics.fillRect(x,y, size, size);
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