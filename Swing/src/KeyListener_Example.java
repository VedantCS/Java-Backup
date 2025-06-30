import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class KeyListener_Example implements KeyListener {
    JFrame frame;
    JLabel label;
    ImageIcon icon;

    KeyListener_Example() {
        frame = new JFrame("MenuBar Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.addKeyListener(this);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.BLACK); // Needed to change content pane's background so frame.setBackground() se nahi hoga
  // A content pane in Swing is the area within a top-level container (like JFrame) where components are added. 

        icon = new ImageIcon("coder.png");

        label = new JLabel();
        label.setBounds(0, 0, 270, 270);
        label.setIcon(icon);

        frame.add(label);
        frame.setVisible(true);
    }

    // Called when a key is typed (for character keys)
    @Override
    public void keyTyped(KeyEvent e) {
        switch (e.getKeyChar()) {
            case 'a':
                label.setLocation(label.getX() - 10, label.getY());
                break;
            case 'd':
                label.setLocation(label.getX() + 10, label.getY());
                break;
            case 's':
                label.setLocation(label.getX(), label.getY() + 10);
                break;
            case 'w':
                label.setLocation(label.getX(), label.getY() - 10);
                break;
        }
    }

    // Called when a key is pressed (recommended for arrow keys and smoother movement)
    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_A:
                label.setLocation(label.getX() - 10, label.getY());
                break;
            case KeyEvent.VK_D:
                label.setLocation(label.getX() + 10, label.getY());
                break;
            case KeyEvent.VK_W:
                label.setLocation(label.getX(), label.getY() - 10);
                break;
            case KeyEvent.VK_S:
                label.setLocation(label.getX(), label.getY() + 10);
                break;
        }
    }

    // Called when a key is released
    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("You released KEY CHAR '" + e.getKeyChar() + "' key!");
        System.out.println("You released KEY CODE " + e.getKeyCode());
    }

    public static void main(String[] args) {
        new KeyListener_Example();
    }
}
