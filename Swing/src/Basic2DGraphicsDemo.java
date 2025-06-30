import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class Basic2DGraphicsDemo extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // Step 2: Clear the background

        Graphics2D g2 = (Graphics2D) g; // Step 3: Get access to advanced 2D features

        // Enable anti-aliasing for smoother shapes using setRenderingHint(...)
//Anti-aliasing smooths out the jagged edges (also called “jaggies”) that appear when drawing diagonal 
//or curved shapes (like circles or slanted lines) on a pixel-based screen.
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // 1. Draw a line
        g2.setColor(Color.BLUE);
        g2.drawLine(20, 20, 120, 20);

        // 2. Draw a rectangle
        g2.setColor(Color.RED);
        g2.drawRect(20, 40, 100, 50);

        // 3. Fill a rectangle
        g2.setColor(Color.ORANGE);
        g2.fillRect(140, 40, 100, 50);

        // 4. Draw an oval
        g2.setColor(Color.MAGENTA);
        g2.drawOval(20, 110, 100, 50);

        // 5. Fill an oval
        g2.setColor(Color.GREEN);
        g2.fillOval(140, 110, 100, 50);

        // 6. Draw a rounded rectangle
        g2.setColor(Color.CYAN);
        g2.drawRoundRect(20, 180, 100, 50, 20, 20);

        // 7. Fill a rounded rectangle
        g2.setColor(Color.PINK);
        g2.fillRoundRect(140, 180, 100, 50, 20, 20);

        // 8. Draw with custom stroke
        g2.setStroke(new BasicStroke(4));
        g2.setColor(Color.BLACK);
        g2.drawLine(20, 250, 220, 250);

        // 9. Draw a custom shape (Ellipse2D)
        g2.setColor(new Color(100, 100, 255, 180)); // Semi-transparent blue
        Shape ellipse = new Ellipse2D.Double(80, 270, 100, 60);
        g2.fill(ellipse);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Basic 2D Graphics in Java Swing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 400);
        frame.setLocationRelativeTo(null);
        frame.add(new Basic2DGraphicsDemo());
        frame.setVisible(true);
    }
}
