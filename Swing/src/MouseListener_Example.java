
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseListener_Example implements MouseListener {
    JFrame frame;
    JLabel label;

    MouseListener_Example() {
        frame = new JFrame("Mouse Listener");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(new GridBagLayout()); // ✅ IMP---------------Use GridBagLayout to center without stretch
        

        label = new JLabel("Hover / Click me!");
        label.setPreferredSize(new Dimension(200, 100)); // ✅ Set fixed size (as we are using gridbaglayout)
        label.setHorizontalAlignment(JLabel.CENTER); 
        label.setVerticalAlignment(JLabel.CENTER);
//Note about setHorizontal/VerticalAlignment:
//setHorizontalAlignment(JLabel.CENTER) → Aligns the text horizontally (left, center, right) within the label.
//setVerticalAlignment(JLabel.CENTER)   → Aligns the text vertically (top, center, bottom) within the label.
//These two are used to control how the text inside the label is aligned, not the label itself.
        label.setBackground(Color.RED);
        label.setOpaque(true);
        label.addMouseListener(this); // important: registering listener

        frame.add(label); // No constraints needed for basic centering
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    // Triggered when mouse is clicked and released on the same component
    public void mouseClicked(MouseEvent e) {
        label.setText("Mouse Clicked");
        label.setBackground(Color.GREEN);
        // Tip: use getClickCount() to detect double-click
        if (e.getClickCount() == 2) {
            label.setText("Double Clicked!");
        }
    }

    // Triggered as soon as mouse button is pressed
    public void mousePressed(MouseEvent e) {
        label.setText("Mouse Pressed");
        label.setBackground(Color.PINK);
    }

    // Triggered when mouse button is released
    public void mouseReleased(MouseEvent e) {
        label.setText("Mouse Released");
        label.setBackground(Color.MAGENTA);
    }

    // Triggered when mouse enters the component area
    public void mouseEntered(MouseEvent e) {
        label.setText("Mouse Entered");
        label.setBackground(Color.ORANGE);
    }

    // Triggered when mouse exits the component area
    public void mouseExited(MouseEvent e) {
        label.setText("Mouse Exited");
        label.setBackground(Color.RED);
    }

    public static void main(String[] args) {
        new MouseListener_Example();
    }
}
