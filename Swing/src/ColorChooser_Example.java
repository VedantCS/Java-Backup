import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ColorChooser_Example {

    public static void main(String[] args) {
        JFrame frame = new JFrame("JColorChooser Example");
        JButton button = new JButton("Pick A Color");
        JLabel label=new JLabel("THIS IS A LABEL");
        label.setFont(new Font("MV Boli",Font.BOLD,100));
        label.setBackground(Color.WHITE);
        label.setOpaque(true);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {    // This code is executed when the button is pressed.
                // Open the color chooser dialog
                Color color = JColorChooser.showDialog(frame, "Choose a Color", Color.BLACK);//parent component,Title,initial color that the dialog will show 
//if u use frame instead of null, The dialog would still open and allow the user to pick a color, but it might open in the center of the screen, 
                //detached from the parent window.
 //Color as the Data Type:
/*JColorChooser.showDialog() The method is designed to let the user pick a color and then return that selected color as a Color object.
Therefore, we need to store the result of the showDialog() call in a Color variable, not a JColorChooser variable, because the method returns a Color object
*/                if (color != null) //If the user cancels the dialog, null will be returned.
                {	
                   label.setBackground(color);// If the user selected a color, change the button's background color
                }
            }
        });

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());
        frame.add(button);
        frame.add(label);
       frame.pack();
       
        frame.setVisible(true);
    }
}

