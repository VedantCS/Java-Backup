import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;//isme keystroke bhi aata means just remember bout javax.swing.KeyStroke, KeyEvent;
import java.awt.event.KeyEvent;

public class MenuBarExample implements ActionListener {

    // Frame and Menu Components
    JFrame frame;
    JMenuBar menuBar;
    JMenu fileMenu, editMenu, helpMenu;
    JMenuItem loadItem, saveItem, exitItem;

    // Constructor to set up the GUI
    MenuBarExample() {
        frame = new JFrame("MenuBar Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new FlowLayout());

        // Initialize MenuBar and Menus
        menuBar = new JMenuBar();
        fileMenu = new JMenu("File");
        editMenu = new JMenu("Edit");
        helpMenu = new JMenu("Help");

        // Create MenuItems
        loadItem = new JMenuItem("Load");
        saveItem = new JMenuItem("Save");
        exitItem = new JMenuItem("Exit");

        // --------- ToolTips ---------
        // ToolTips are small pop-up text boxes that appear when the user hovers over a component.
        // They are useful for giving quick hints or explanations about what a button/menu item does.
        loadItem.setToolTipText("Load a file");
        saveItem.setToolTipText("Save the current file");
        exitItem.setToolTipText("Exit the application");

        // --------- Keyboard Accelerators ---------
        // Accelerators are keyboard shortcuts (e.g., Ctrl+L) that activate a menu item
        // even if the menu is not open. They improve speed and accessibility.
        loadItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L, ActionEvent.CTRL_MASK));
        saveItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));
        exitItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, ActionEvent.CTRL_MASK));

        // Add ActionListeners
        loadItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);

        // Assemble Menus
        fileMenu.add(loadItem);
        fileMenu.add(saveItem);
        fileMenu.addSeparator();  // Adds a separator line between Save and Exit
        fileMenu.add(exitItem);

        // Add Menus to MenuBar
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        // Set the MenuBar in the Frame
        frame.setJMenuBar(menuBar);
        frame.setVisible(true);
    }

    // Event handling for menu items
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loadItem) {
            System.out.println("Load item clicked");
        } else if (e.getSource() == saveItem) {
            System.out.println("Save item clicked");
        } else if (e.getSource() == exitItem) {
            System.out.println("Exit item clicked");
            System.exit(0);
        }
    }

    // Main method to run the application
    public static void main(String[] args) {
        new MenuBarExample();//  SwingUtilities.invokeLater(() -> new MenuBarExample()); can be used for complex GUIs
    //swing is not thread safe so it ensures that all Swing code runs on the correct thread, avoiding bugs or weird UI behavior — especially in more complex apps.
    }
}
