import javax.swing.*;
import java.awt.*;
public class LayeredPaneExample {
public static void main(String[] args) {
	
	
	JFrame frame=new JFrame();
	JLabel label1=new JLabel();
	label1.setBackground(Color.ORANGE);
	label1.setOpaque(true);
	label1.setBounds(50,50,200,200);
	
	JLabel label2=new JLabel();
	label2.setBackground(Color.MAGENTA);
	label2.setOpaque(true);
	label2.setBounds(100,100,300,300);
	
	JLabel label3=new JLabel();
	label3.setBackground(Color.green);
	label3.setOpaque(true);
	label3.setBounds(150,150,400,400);
	
	
	JLayeredPane layeredPane=new JLayeredPane();
	layeredPane.setBounds(0, 0, 500, 550);
/*	layeredPane.add(label1);
	layeredPane.add(label2);
	layeredPane.add(label3); 
	in above : orange is on top, then other labels are beneath it, i.e below orange is magenta below magenta is green
	this helps understand order in which the layers are added */
	layeredPane.add(label1,JLayeredPane.DEFAULT_LAYER);
	layeredPane.add(label2,JLayeredPane.DEFAULT_LAYER);
	layeredPane.add(label3,JLayeredPane.POPUP_LAYER);

/*---------------Another ez way to add layers if you dont wanna remember names:
   		Assigning layers: lower number = further back
        layeredPane.add(label1, Integer.valueOf(0));  // base layer
        layeredPane.add(label2, Integer.valueOf(1));  // middle
        layeredPane.add(label3, Integer.valueOf(2));  // top layer
 */
	
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(500,550);
	frame.setLocationRelativeTo(null);
	frame.setLayout(null);
	frame.add(layeredPane);
	frame.setVisible(true);
	

	}
}
