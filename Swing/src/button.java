import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class button implements ActionListener {
	ImageIcon img=new ImageIcon("coder.png");
	
	
    JButton button;

    public button() {
        button = new JButton("Click Me");
        button.setBounds(150, 150, 250, 450); // adjusting size to get a larger button

        button.addActionListener(this); // Add action listener to the button
        button.setText("CLICK ME!");
        button.setFocusable(false);//removes the border around the text
        button.setIcon(img);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.TOP);
        button.setBackground(Color.pink);
        button.setBorder(BorderFactory.createEtchedBorder());//createDashedBorder(null));
      //---to disable a button use: 
       // button.setEnabled(false); 
        

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 600);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.add(button);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            System.out.println("FUCK Niggers!");
            //button.setEnabled(false); this line here makes the button work only once i.e only one click 
        }
    }

    public static void main(String[] args) {
        new button();// create an instance of the class
    }
}
