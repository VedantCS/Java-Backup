import java.awt.*;                        // Imports classes for GUI components (e.g., Dimension, Font)
import javax.swing.*;                    // Imports Swing GUI components (e.g., JFrame, JPanel, JLabel, JSlider)
import javax.swing.event.*;             // Imports event classes for listening to changes (e.g., ChangeListener, ChangeEvent)

// The Slider class implements ChangeListener to respond to slider movements
public class Slider implements ChangeListener {

    JFrame frame;    // The main window frame
    JPanel panel;    // A panel to organize components
    JLabel label;    // A label to display the current value of the slider
    JSlider slider;  // A vertical slider to adjust and display a value

    // Constructor for the Slider class
    Slider() {
        frame = new JFrame("Slider demo");  // Creates a new window titled "Slider demo"
        panel = new JPanel();               // Initializes a panel to hold the slider and label
        label = new JLabel();               // Initializes the label (text will be set dynamically)

        // Creates a JSlider with:
        // - Minimum value: 0
        // - Maximum value: 375
        // - Initial value: 120
        slider = new JSlider(0, 375, 120);

        // Sets the preferred size of the slider component
        slider.setPreferredSize(new Dimension(400, 300));

        // Enables small tick marks along the slider track
        slider.setPaintTicks(true);

        // Sets spacing between minor tick marks to 15 units
        slider.setMinorTickSpacing(15);

        // Paints the track of the slider
        slider.setPaintTrack(true);

        // Sets spacing between major tick marks to 75 units
        slider.setMajorTickSpacing(75);

        // Enables numeric labels at tick mark positions
        slider.setPaintLabels(true);

        // Sets the font of the slider labels
        slider.setFont(new Font("MV Boli", Font.BOLD, 10));

        // Sets the font of the label that displays the current value
        label.setFont(new Font("MV Boli", Font.BOLD, 20));

        // Changes the slider orientation to vertical (default is horizontal)
        slider.setOrientation(SwingConstants.VERTICAL);

        // Registers this class (Slider) as a listener to changes in the slider's value
        slider.addChangeListener(this);

        // Adds the slider and label to the panel
        panel.add(slider);
        panel.add(label);

        // Adds the panel to the frame and sets window properties
        frame.add(panel);
        frame.setSize(420, 420);          // Sets the window size
        frame.setVisible(true);         // Makes the window visible
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // This method is called automatically whenever the slider value changes
    public void stateChanged(ChangeEvent e) {
        // Updates the label text to show the current value of the slider
        label.setText("Temprature= " + slider.getValue()); 
    }

    // The main method — program execution starts here
    public static void main(String[] args) {
        new Slider();  // Creates an instance of Slider, which sets up the GUI
    }
}
