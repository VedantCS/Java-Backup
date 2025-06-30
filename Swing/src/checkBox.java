import javax.swing.*;
import java.awt.event.*;

public class checkBox {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Programming Quiz");

        JLabel question = new JLabel("Which of the following are programming languages?");
        question.setBounds(50, 30, 400, 30);

        JCheckBox cb1 = new JCheckBox("HTML");
        cb1.setBounds(50, 70, 90, 30);

        JCheckBox cb2 = new JCheckBox("Python");
        cb2.setBounds(50, 100, 100, 30);

        JCheckBox cb3 = new JCheckBox("Java");
        cb3.setBounds(50, 130, 100, 30);

        JCheckBox cb4 = new JCheckBox("CSS");
       cb4.setBounds(50, 160, 100, 30);

        JButton submitButton = new JButton("Submit");
        submitButton.setBounds(50, 200, 100, 30);

        JLabel result = new JLabel("");
        result.setBounds(50, 240, 400, 30);
        // .addActionListener() is a method that registers an action listener to a component
        //(like a button, checkbox, or timer). When that component gets "activated" (usually by clicking),
        //the listener's actionPerformed() method gets called.

submitButton.addActionListener(//You're adding an anonymous inner class that implements ActionListener to the submitButton.
        		new ActionListener()//because we are creating an object that implements the ActionListener interface
        		{ 
            public void actionPerformed(ActionEvent e) {
                StringBuilder selected = new StringBuilder("You selected: ");
                if (cb1.isSelected()) selected.append("HTML, ");
                if (cb2.isSelected()) selected.append("Python, ");
                if (cb3.isSelected()) selected.append("Java, ");
                if (cb4.isSelected()) selected.append("CSS, ");

                // Clean trailing comma
                if (selected.toString().endsWith(", ")) {
                    selected = new StringBuilder(selected.substring(0, selected.length() - 2));
                }

                result.setText(selected.toString());
            }
        });
//The actionPerformed() method is only needed if you're using the old-school implements ActionListener style
//Lambdas = no need for implements ActionListener
//If you must use actionPerformed(ActionEvent e) and still want to use a lambda, that’s a contradiction — lambdas replace that method. 
//So you either go with lambdas or the actionPerformed override, not both.
/*alternative shortcut using lammbda expression 
 * submitButton.addActionListener(e -> {
 	your click logic});
that is:
submitButton.addActionListener(e -> {
    StringBuilder selected = new StringBuilder("You selected: ");
    if (cb1.isSelected()) selected.append("HTML, ");
    if (cb2.isSelected()) selected.append("Python, ");
    if (cb3.isSelected()) selected.append("Java, ");
    if (cb4.isSelected()) selected.append("CSS, ");

    // Clean trailing comma
    if (selected.toString().endsWith(", ")) {
        selected = new StringBuilder(selected.substring(0, selected.length() - 2));
    }

    result.setText(selected.toString());
});
You can use a lambda when:
The interface is a functional interface (i.e., only one abstract method).
Since ActionListener has only one method — actionPerformed() — it's a perfect fit.

*/

        frame.add(question);
        frame.add(cb1);
        frame.add(cb2);
        frame.add(cb3);
        frame.add(cb4);
        frame.add(submitButton);
        frame.add(result);

        frame.setSize(500, 550);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
