import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class Panel {
public static void main(String[] args) {
	//JPanel=a gui component acts like a container to hold other components
	//Panels use flow layout manager by default
	ImageIcon icon=new ImageIcon("coder.png");
	JPanel redpanel=new JPanel();
	redpanel.setBackground(Color.RED);
	redpanel.setBounds(0, 0, 250, 250);
	redpanel.setLayout(new BorderLayout());///no use here in this code
	
	JPanel bluepanel=new JPanel();
	bluepanel.setBackground(Color.BLUE);
	bluepanel.setBounds(250,0,530, 250);
	bluepanel.setLayout(null);
	
	JPanel greenpanel=new JPanel();
	greenpanel.setBackground(Color.GREEN );
	greenpanel.setBounds(0, 250, 500, 250);
	
	
	//lets add components to them now
	
	
	JLabel label=new JLabel("adding a label");
	label.setForeground(Color.YELLOW);
	label.setIcon(icon);
	label.setVerticalAlignment(JLabel.BOTTOM);
	label.setHorizontalAlignment(JLabel.LEFT);
//So the text/icon will be stuck to the bottom-left corner inside the label area
	label.setBounds(20, 20, 530, 250);
/*---------***************--------------
When you add a component (like a JLabel) to a container (like bluepanel), 
its coordinates (setBounds(x, y, ...)) are relative to the container it’s added to — not the entire window or screen.
*/	
	JFrame frame=new JFrame();
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(800, 600); ;
	frame.setLocationRelativeTo(null);
	frame.setLayout(null);
//tells the JFrame not to use any layout manager.
//You must then manually set the position and size of each component using setBounds(x, y, width, height).
	frame.add(redpanel);
	frame.add(bluepanel);
	frame.add(greenpanel);
	bluepanel.add(label); 
	frame.setVisible(true);
	
}
}
