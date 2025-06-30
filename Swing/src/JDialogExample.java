
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class JDialogExample implements ActionListener{JFrame mainFrame; JButton showDialogButton;
     public JDialogExample() { 
        // Creating the main JFrame window
    	 mainFrame = new JFrame("Main Frame");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(300, 200);
        mainFrame.setVisible(true);

        // Button to trigger the JDialog
     showDialogButton = new JButton("Show Message Dialog");

        // Action listener for the button
        showDialogButton.addActionListener(this);
        showDialogButton.setFocusable(false);
        mainFrame.add(showDialogButton);
        
    
    }
 	public void actionPerformed(ActionEvent e) {
 		if(e.getSource()==showDialogButton) {
		JDialog dialog = new JDialog(mainFrame, "Dialog Example", true);  // true makes it modal
        JLabel messageLabel = new JLabel("This is a message from JDialog.", SwingConstants.CENTER);
        dialog.add(messageLabel);
        dialog.setSize(250, 150);
        dialog.setLocationRelativeTo(mainFrame);  // Center the dialog relative to the main window
        dialog.setVisible(true);  // Show the dialog
/*to add the JDialog to the mainFrame by calling mainFrame.add(dialog);. This isn't necessary and can cause the dialog not to appear correctly. 
  A JDialog is a separate window, and it doesn't need to be added to the JFrame. 
  Instead, you should create the JDialog independently and then make it visible.
 */
    
	}
	
     }
	
	public static void main(String[] args) {
		new JDialogExample();
	}
}
	