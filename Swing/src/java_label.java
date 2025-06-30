import java.awt.Color;
import java.awt.Font;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class java_label  {
public static void main(String[] args) {//new Frame(); uncomment it for using frame class and comment everything else
	
	ImageIcon img=new ImageIcon("pngtree-coder-clipart-boy-working-with-computer-game-on-the-desk-vector-png-image_6804917.png");
	Border border= BorderFactory.createLineBorder(Color.GREEN, 5);
	 JLabel label=new JLabel();//Create a label  
     label.setText("MY NERD AHH LEARNING SWING");//sets text for a label
     //or use: JLable x=new JLabel("TEXT");
     
     label.setIcon(img);
     label.setHorizontalTextPosition(JLabel.CENTER); //SET text left,center, or right of imageIcon 
     label.setVerticalTextPosition(JLabel.TOP);
     //---------TO CHANGE FONT COLOR
     label.setForeground(Color.MAGENTA);//or(new Color(0,0,0) ) aka rgb values or(new Color(0X00FF00)) FOR hex values
     //------TO CHANGE FONT STYLE
     label.setFont(new Font("MV BOLI", Font.PLAIN,20)); //Font style name,plain/bold/italic,font size
     
     label.setIconTextGap(-25);//to set gap between text and icon try(50)
     //----------TO CHANGE BACKGROUND COLOR
     label.setBackground(Color.PINK);
     label.setOpaque(true);//THIS Displays background color so this must be set to true
     //If true the component paints every pixel within its bounds.Otherwise, the component may not paint some or all of its
	//---------------------Borders---------------------
     label.setBorder(border); //now you can see that the borders indicate that the  label takes up pretty much all of the space this is because of the default layout manager
     
     
   // -------moving text and image within the label, (by default it likes to be in the center and to the left)
     label.setVerticalAlignment(JLabel.CENTER);//Sets vertical position of contents(icon+text) **within** label area i.e its width and height
 //(JLabel.CENTER) because we need to align the text inside the JLabel else use SwingConstants.LEFT etc etc
     
 //
     label.setHorizontalAlignment(JLabel.CENTER);//Sets horizontal position of contents(icon+text) **within** label area i.e its width and height
     
   //-----------------------------------as you can see label is moving as we resize the window so to restrict that use setBounds() method
     //it sets x,y positions within the frame and also the dimenesion
     label.setBounds(10,420, 250, 230);//x,y,width,height x=0,y=0 is the top left of window btw 
 //defines the position and size of the entire JLabel(component) inside its container (i.e frame here)
   
     
     JFrame frame=new JFrame();
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.setResizable(true);//mtlb window can be resized
     frame.setSize(800,700);//used here for setBound method, we will learn about layouts later...
     frame.setLayout(null);//tells the JFrame not to use any layout manager.
   //You must then manually set the position and size of each component using setBounds(x, y, width, height).
 
     frame.setVisible(true);
     frame.setLocationRelativeTo(null);
   //  frame.pack(); Can use it instead of setBounds()
    //make sure you use pack method ONLY after adding all the components.[here after .add(label) method]
     //.pack() is a method associated with the java.awt.Frame class 
    // that adjusts the frame's size to accommodate its content. 
//primarily used to resize a window (or frame) so that it fits the content it contains, including all visible components like buttons,
 //labels, etc.
//You typically call pack() on a JFrame (or similar class) after you've added all the components to it.
//This ensures that the window is resized to display everything properly.
   
     frame.add(label);//generally for labels, BY default the layout manager for our frame is implemented using a bordered layout, and it
     //takes strings or images centers it and put it onto L.H.S
    
}
}
//common confusion: If you're also using setHorizontalTextPosition() and setVerticalTextPosition(), 
//they control the text position relative to the icon, not the label box.