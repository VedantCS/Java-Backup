import javax.swing.*;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.*;

public class TEXTFIELD_example {

    // Fields declared at class level
    JFrame frame;
    JTextField textField;
    JButton button;

    public TEXTFIELD_example() {
        // Set up the frame
        frame = new JFrame("TextField Example");
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null); // in '.setLayout(null)' here null refers to absolute layout (not recommended for large GUIs)
        frame.setLocationRelativeTo(button);
//Since the button is part of the frame, and the frame hasn’t been shown yet, Swing doesn't have proper location info for the button.
//So it falls back to treating it like null, and centers the frame on the screen anyway.
//Basically, Swing's like:
//"Hmm... I don't know where this button lives yet, so I'll just center the frame like you gave me null." SO better use null

        // Create components
        textField = new JTextField();
        textField.setBounds(50, 20, 200, 25);
        textField.setPreferredSize(new Dimension(200, 30));
        textField.setFont(new Font("Consolas", Font.BOLD, 30));//setting text font
        textField.setForeground(Color.red);//changing text color
        textField.setBackground(Color.black);
        textField.setEditable(true);
    /*Use setBounds() when you're not using a layout manager (i.e., layout is set to null) and you want to control the exact position and size.

Use setPreferredSize() when you're using a layout manager, and want to suggest how big the component should be*/    

        button = new JButton("Click");
        button.setBounds(100, 60, 100, 30);

        // Add action listener to button
        button.addActionListener(new A());

        // Add components to frame
        frame.add(textField);
        frame.add(button);
    

        frame.setResizable(true);
        frame.setVisible(true);
        

    }

    // Inner class for event handling
    class A implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String input = textField.getText();
            JOptionPane.showMessageDialog(frame, "You typed: " + input);
        }
    }

    public static void main(String[] args) {
        // Create an instance of the main class to show the GUI
        new TEXTFIELD_example();
    }
}
