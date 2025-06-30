import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;

public class NestedPanels {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Nested Panels Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Create parent panel
        JPanel parentPanel = new JPanel();
        parentPanel.setBackground(Color.LIGHT_GRAY);

        // Create child panel 1
        JPanel childPanel1 = new JPanel();
        childPanel1.setBackground(Color.CYAN);
        childPanel1.setPreferredSize(new Dimension(150, 100));

        // Create child panel 2
        JPanel childPanel2 = new JPanel();
        childPanel2.setBackground(Color.ORANGE);
        childPanel2.setPreferredSize(new Dimension(100, 75));

        // Add child panels to the parent panel
        parentPanel.add(childPanel1);
        parentPanel.add(childPanel2);

        // Add the parent panel to the frame
        frame.add(parentPanel);

        frame.setVisible(true);
    }
}