import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
public class Flow_Layout {
public static void main(String[] args) {
	// Create a frame
    JFrame frame = new JFrame("FlowLayout Basics");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(400, 200);

    // Create a panel with FlowLayout
    // Parameters: alignment (CENTER), horizontal gap (20), vertical gap (10)
    JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 10));

    // Add some buttons to the panel
    panel.add(new JButton("Button 1"));
    panel.add(new JButton("Button 2"));
    panel.add(new JButton("Button 3"));
    panel.add(new JButton("Button 4"));
    panel.add(new JButton("Button 5"));
    panel.add(new JButton("Button 6"));

    // Add panel to frame
    frame.add(panel);

    // Show the frame
    frame.setVisible(true);
/*FlowLayout.LEADING	Aligns to the beginning of the line (left in LTR, right in RTL)
FlowLayout.TRAILING	Aligns to the end of the line (right in LTR, left in RTL)
LTR vs RTL Example:
For left-to-right locales (like English):

    LEADING → left

    TRAILING → right

For right-to-left locales (like Arabic):

    LEADING → right

    TRAILING → left
    If you're building an internationalized app, use LEADING/TRAILING instead of LEFT/RIGHT
     to automatically adapt to the user's locale.
    
*/

}
}
