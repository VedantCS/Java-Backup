import javax.swing.*;
import javax.swing.table.DefaultTableModel;
//We use a DefaultTableModel to provide data for the JTable. The model contains the data and column names.
//A JScrollPane is used to make the table scrollable in case the data exceeds the available space.
public class JTableExample {
    public static void main(String[] args) {
        // Extended data for the JTable
        String[] columnNames = {"Name", "Age"};
        Object[][] data = {
            {"Alice", 25},
            {"Bob", 30},
            {"Charlie", 35},
            {"David", 40},
            {"Eva", 45},
            {"Frank", 50},
            {"Grace", 55},
            {"Helen", 60},
            {"Ivy", 65},
            {"Jack", 70},
            {"Kara", 75},
            {"Leo", 80},
            {"Mona", 85},
            {"Nina", 90},
            {"Oscar", 95},
            {"Paul", 100}
        };

        // Creating a JTable 
        DefaultTableModel model = new DefaultTableModel(data, columnNames);
        JTable table = new JTable(model);

        // Creating a JScrollPane for the table to handle scrolling
        
        JScrollPane scrollPane = new JScrollPane(table);

        // Creating a JFrame to display the JTable,and The frame is set up with the JTable inside a scroll pane.
        JFrame frame = new JFrame("JTable Example with ScrollPane");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(scrollPane);
        frame.setSize(400, 300); // Increase the size to accommodate the table and scrollbar
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
}
