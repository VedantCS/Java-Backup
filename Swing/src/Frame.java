import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
public  class Frame extends JFrame {
	
//REMEMBER THIS IMP NOTE: You cannot have executable statements like frame.setSize(...) ,.setTitle(),.setVisible() directly in the class body
//(outside of a method or constructor).
//The code inside the class must be in a method, constructor, or initializer block.
	Frame(){
	//***********JFrame frame=new JFrame("Shop"); *****it creates a frame and name it as shop or use .setTitle() method later. HOWEVER..
	//NO need here because you're already extending JFrame in your Frame class
//What does extends JFrame mean?It means your Frame is a JFrame. So instead of creating a new JFrame object inside your constructor,
//you can just configure this, which refers to the current instance of your Frame class (which is a JFrame).
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	//tells what happens when the frame close
	//it include DO_NOTHING_ON_CLOSE,HIDE_ON_CLOSE (removes the window from the screen but leaves it displayable)
	//DISPOSE_ON_CLOSE:removes the window from the screen and frees up any resources used by it.
	this.setTitle("Shop");
	this.setResizable(false);//prevents frame from being resizable
	this.setSize(450,250);//x and y dimension
	this.setLocationRelativeTo(null); // this method display the JFrame to center position of a screen
	this.setVisible(true);
	this.getContentPane().setBackground(new Color(60,15,100));//import java.awt.Color and these three are the R G B values
//yaha pe bas setBackground() se kaam nahi chalega kyuki yaha pe content pane hona
	// A content pane in Swing is the area within a top-level container (like JFrame) where components are added. 
	ImageIcon img=new ImageIcon("newlogo.png");//used to set images
	this.setIconImage(img.getImage());
//ImageIcon is not a component—it's actually a class that implements the Icon interface.I.E Why we use.setIconImage() not add() 
	//beacuse add is used to add components not a class
	
	 
	
	
}
}
