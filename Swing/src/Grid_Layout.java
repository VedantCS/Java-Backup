import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.GridLayout;
public class Grid_Layout {
public static void main(String[] args) {
	JFrame frame = new JFrame("Grid Layout Basics");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(500, 500);
    frame.setLocationRelativeTo(null);
    frame.setLayout(new GridLayout(2,2,20,30));//new GridLayout(rows, cols, hgap, vgap);

    //SHORTCUT to add buttons
    for (int i = 1; i <= 6; i++) {
        frame.add(new JButton("Button " + i));
    }
    /* ---LONG CUT TO ADD BUTTONS--------
    frame.add(new JButton("Button 1"));
    frame.add(new JButton("Button 2"));
    frame.add(new JButton("Button 3"));
    frame.add(new JButton("Button 4"));
    frame.add(new JButton("Button 5"));
    frame.add(new JButton("Button 6"));
    */
    frame.setVisible(true);
}
}
