import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class JoptionPane_example {
public static void main(String[] args) {
	/*JOptionPane.showMessageDialog(null, "Hello", "title", JOptionPane.DEFAULT_OPTION);
	JOptionPane.showMessageDialog(null, "Hello", "title", JOptionPane.INFORMATION_MESSAGE);
	JOptionPane.showMessageDialog(null, "Hello", "title", JOptionPane.QUESTION_MESSAGE);
	JOptionPane.showMessageDialog(null, "Hello", "title", JOptionPane.WARNING_MESSAGE);
	JOptionPane.showMessageDialog(null, "Hello", "title", JOptionPane.ERROR_MESSAGE);
	*/
	  String[] options = { "HA", "NAHI", "Mujhe Cancel krna hai" };
	ImageIcon icon=new ImageIcon("gay.png");
	String name=JOptionPane.showInputDialog("what is your name nigga?...(see console)");
	System.out.println("Hello :"+ name+" please answer the message shown");
	//earlier below i used showConfirmDialog,but If you need custom buttons and default selection → use showOptionDialog Yahape custom buttons hai 
	//ha, nahi,Mujhe Cancel krna hai aaur default hai "HA"
	int ans=JOptionPane.showOptionDialog(null, 
			"TU CHAKKA HAI?","Title here",
			JOptionPane.YES_NO_CANCEL_OPTION,  
			JOptionPane.QUESTION_MESSAGE,icon,
			 options,   // ✅ Custom button labels
             options[0] );
	if(ans==JOptionPane.YES_OPTION)
			{
				System.out.println("I KNEW U WAS GAY");
			}
	else if(ans==JOptionPane.NO_OPTION)
	{
		System.out.println("STOP LYING NIGGA!");
	}
	else if(ans ==JOptionPane.CANCEL_OPTION)
	{
		System.out.println("Bro Dodged the question lol he definately gay");
	}
	else if(ans == JOptionPane.CLOSED_OPTION)
	{
		System.out.println("Yeah close that shit you pussy ass nigga");
	}
	
/*Summary of Method Signature:

showConfirmDialog(Component parentComponent,
                  Object message,
                  String title,
                  int optionType,
                  int messageType,
                  Icon icon)
	same goes for option dialog but 2 extra prameters after icons
	public static int showOptionDialog(
    Component parentComponent,
    Object message,
    String title,
    int optionType,
    int messageType,
    Icon icon,
    Object[] options,
    Object initialValue
)
*/
}
}
