import javax.swing.*;
import java.awt.event.*;

public class Radioo_Buttonn {
    public static void main(String[] args) {
        // Create a new frame (window)
        JFrame frame = new JFrame("Radio Button Example");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create radio buttons
        JRadioButton rb1 = new JRadioButton("Java");
        JRadioButton rb2 = new JRadioButton("Python");
        JRadioButton rb3 = new JRadioButton("C++");

        // Group the radio buttons so only one can be selected
        ButtonGroup group = new ButtonGroup();
        group.add(rb1);
        group.add(rb2);
        group.add(rb3);

        // Create a label to display the selected option
        JLabel label = new JLabel("Select a programming language:");

        // Add action listeners to each radio button
        rb1.addActionListener(e -> label.setText("Selected: Java"));//lambda expression wala shortcuts
        rb2.addActionListener(e -> label.setText("Selected: Python"));
        rb3.addActionListener(e -> label.setText("Selected: C++"));

        // Create a panel and add components
        JPanel panel = new JPanel();
        panel.add(rb1);
        panel.add(rb2);
        panel.add(rb3);
        panel.add(label);

        // Add the panel to the frame
        frame.add(panel);
        frame.setVisible(true);
    }
}
