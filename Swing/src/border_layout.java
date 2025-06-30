import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class border_layout {
public static void main(String[] args) {
	

	JFrame frame=new JFrame();
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(800,600);
	frame.setLayout(new BorderLayout(10,20));//10 pixels of margin for width and 0 pixel for height
	frame.setVisible(true);
	frame.setLocationRelativeTo(null);
	JPanel panel1=new JPanel();
	JPanel panel2=new JPanel();
	JPanel panel3=new JPanel();
	JPanel panel4=new JPanel();
	JPanel panel5=new JPanel();
 
	panel1.setBackground(Color.red);
	panel2.setBackground(Color.green);
	panel3.setBackground(Color.yellow);
	panel4.setBackground(Color.magenta);
	panel5.setBackground(Color.blue);

//--------------setPreferredSize() is just a suggestion to the layout manager.
//Some layout managers ignore it:***GridLayout resizes all components to be the same size (ignores preferred size).
//it’s your way of saying to the layout manager: “Hey, I prefer this size. You don’t have to follow it, 
//but I’d really like it if you did.”	
//the layout manager respects preferred sizes (most do), it will size the panel accordingly.

	
	panel1.setPreferredSize(new Dimension(100, 60));  // height matters for NORTH
    panel2.setPreferredSize(new Dimension(100, 60));  // height matters for SOUTH
    panel3.setPreferredSize(new Dimension(120, 100)); // width matters for EAST
    panel4.setPreferredSize(new Dimension(120, 100)); // width matters for WEST
    panel5.setPreferredSize(new Dimension(200, 200)); // CENTER can resize, but initial preferred size helps
   
    
// ----------------adding sub panels-----------------------
    
    JPanel panel6 =new JPanel();
    JPanel panel7 =new JPanel();
    JPanel panel8= new JPanel();
    JPanel panel9= new JPanel();
    JPanel panel10= new JPanel();

    panel6.setBackground(Color.black);
    panel7.setBackground(Color.darkGray);
    panel8.setBackground(Color.gray);
    panel9.setBackground(Color.lightGray);
    panel10.setBackground(Color.white);

    panel5.setLayout(new BorderLayout());

    panel6.setPreferredSize(new Dimension(50,50));
    panel7.setPreferredSize(new Dimension(50,50));
    panel8.setPreferredSize(new Dimension (50,50));
    panel9.setPreferredSize(new Dimension(50,50));
    panel10.setPreferredSize(new Dimension (50,50));
    
    panel5.add(panel6,BorderLayout.NORTH);
    panel5.add(panel7,BorderLayout.SOUTH);
    panel5.add(panel8,BorderLayout.WEST);
    panel5.add(panel9,BorderLayout.EAST);
    panel5.add(panel10,BorderLayout.NORTH);
    
//---------------------------------------------------------
	
	
	frame.add(panel1,BorderLayout.NORTH);
	frame.add(panel2, BorderLayout.SOUTH);
	frame.add(panel3, BorderLayout.EAST);
	frame.add(panel4, BorderLayout.WEST);
	frame.add(panel5, BorderLayout.CENTER);
//center wala resize hota charo side se baki north and south  not vertically hote but horizontally hote
//east aaur west wale vertically hote
// layout managers automatically handle sizing and positioning for you. 
//Even if you don’t set panel dimensions manually, things still work 
	
	
	



}
	}

