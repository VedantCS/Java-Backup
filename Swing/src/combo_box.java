import java.awt.FlowLayout;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class combo_box{
//you can pass any object type to combo box so you cant pass primitive data types use wrapper class for it
//example:JComboBox<Integer> comboBox = new JComboBox<>(new Integer[] { 10, 20, 30 });
/*
  If you want more control (e.g., to add/remove items dynamically), use a DefaultComboBoxModel instead of arrays or vector:

DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
model.addElement("Java");
model.addElement("Python");
model.addElement("C++");

JComboBox<String> comboBox = new JComboBox<>(model);
 */
	
		JFrame frame=new JFrame();
		String[] languages = { "Java", "Python", "C++", "JavaScript" ,"Ruby","C#","Assembly"};
		JComboBox<String> animals=new JComboBox<>(languages);
		
		public combo_box() {
		
			 frame.setSize(400, 200);
		     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		     frame.setLayout(new FlowLayout());
		     frame.add(animals);
		     frame.pack();
		     frame.setVisible(true);
		     animals.setEditable(true); 
		     System.out.println("Items in our combo box:"+animals.getItemCount());//users can type their own value in addition to choosing from the dropdown)
		     System.out.println("adding one more item ...\n");
		     animals.addItem("Bhai Lang");//try: animal.insertItemAt(
		     animals.insertItemAt("Haskell", 2);
		     
		     System.out.println("Updated Items in our combo box:"+animals.getItemCount());
		     System.out.println("Combo box printing: \n");
		     for (int i = 0; i < animals.getItemCount(); i++) {
		    	    System.out.println("Item " + i + ": " + animals.getItemAt(i));
		    	}
		     System.out.println("removing some item ...\n");
		     animals.removeItem("Python");
		     animals.removeItemAt(4);
		     //try animals.removeAllItems();
		     System.out.println("Updated Items in our combo box:"+animals.getItemCount());
		     animals.addActionListener(e -> {
		            String selected = (String) animals.getSelectedItem();
		            System.out.println("Selected language: " + selected);
		        });

		}
		
		
		
		
		
		
	
	
	public static void main(String[] args) {
	
	new combo_box();
	
}	
}
