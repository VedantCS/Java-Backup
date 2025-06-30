import javax.swing.*;

public class JListExample {
    public static void main(String[] args) {
        // Extended data for the JList
        String[] data = {
            "Apple", "Banana", "Cherry", "Date", "Elderberry",
            "Fig", "Grape", "Honeydew", "Iguana fruit", "Jackfruit",
            "Kiwi", "Lemon", "Mango", "Nectarine", "Orange",
            "Papaya", "Quince", "Raspberry", "Strawberry", "Tomato",
            "Uva", "Vinegar fruit", "Watermelon", "Xigua", "Yellow passionfruit",
            "Zucchini","Kanda","Tamatar","Wanga","Gahu","Chana"
        };

        // Creating a JList with the extended data
        JList<String> list = new JList<>(data);

        // Creating a JScrollPane for the JList to handle scrolling
        JScrollPane scrollPane = new JScrollPane(list);

        // Creating a JFrame to display the JList
        JFrame frame = new JFrame("JList Example with ScrollPane");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(scrollPane);//try frame.add(list) and see outcome
        frame.setSize(200, 300);  // Size of the window (height is enough for scrolling)
        frame.setVisible(true);
    }
}
