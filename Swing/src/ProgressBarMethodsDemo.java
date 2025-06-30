import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProgressBarMethodsDemo {

    JFrame frame;
    JProgressBar progressBar;
    JButton startButton, resetButton;

    ProgressBarMethodsDemo() {
        // Create the main frame
        frame = new JFrame("JProgressBar Methods Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new FlowLayout());

        // Create a JProgressBar with default min = 0 and max = 100
        progressBar = new JProgressBar();

        // ➤ setMinimum(int): Set the minimum value of the progress bar
        progressBar.setMinimum(0);

        // ➤ setMaximum(int): Set the maximum value of the progress bar
        progressBar.setMaximum(100);

        // ➤ setValue(int): Set current progress
        progressBar.setValue(0);

        // ➤ setStringPainted(boolean): Display progress as text (e.g., "35%")
        progressBar.setStringPainted(true);

        // ➤ setOrientation(int): Set orientation to HORIZONTAL(by default) or VERTICAL
        progressBar.setOrientation(SwingConstants.HORIZONTAL); // or VERTICAL

        // ➤ setForeground(Color): Set bar color
        progressBar.setForeground(Color.BLUE);

        // ➤ setBackground(Color): Set background color behind the bar
        progressBar.setBackground(Color.LIGHT_GRAY);

        // ➤ setIndeterminate(boolean): Use when task duration is unknown
        //progressBar.setIndeterminate(true); // Uncomment to see effect

        // Button to start progress
        startButton = new JButton("Start");
        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                startProgress();  // Start fake task
            }
        });

        // Button to reset progress
        resetButton = new JButton("Reset");
        resetButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                progressBar.setValue(0); // ➤ Reset progress value
            }
        });

        // Add components to frame
        frame.add(progressBar);
        frame.add(startButton);
        frame.add(resetButton);
        frame.setVisible(true);
    }

    // Simulated task using SwingWorker (non-blocking)
    public void startProgress() {
        SwingWorker<Void, Void> worker = new SwingWorker<Void, Void>() { //SwingWorker<ResultType, IntermediateType> worker = new SwingWorker<>() 
            protected Void doInBackground() throws Exception { //protected ResultType doInBackground() throws Exception
            	   // This method is executed in a background thread.
                // Place long-running or time-consuming tasks here.
                for (int i = 0; i <= 200; i++) {
                    Thread.sleep(100);         // Simulate work
                    progressBar.setValue(i);  // ➤ Update progress
                }
                return null;//resturn result
            }

            protected void done() {
            	 // This method is called on the Event Dispatch Thread after doInBackground() finishes.
                // Use it to update the UI with the results.
                JOptionPane.showMessageDialog(frame, "Progress Complete!");
            }
        };
        worker.execute();  // ➤ Start background task
    }

    public static void main(String[] args) {
        new ProgressBarMethodsDemo();
    }
}
/*
 
Swing is single-threaded, meaning all UI updates and interactions run on the Event Dispatch Thread (EDT). 

SwingWorker in Java is a utility class designed to help you perform background tasks in Swing applications 
without freezing or blocking the Event Dispatch Thread (EDT)
If you perform a long-running operation (like loading data, doing computations, or accessing the network) on the EDT, 
your UI will freeze and become unresponsive.

To avoid this, you can use SwingWorker to:
	1)Perform time-consuming tasks in the background.
	2)Safely update the UI once the task is complete.

Method | Purpose
setMinimum(int) | Sets the starting value (usually 0).

setMaximum(int) | Sets the end value (usually 100).

setValue(int) | Updates the current progress.

setStringPainted(true) | Displays percentage text.

setOrientation(...) | Changes orientation (horizontal/vertical).

setForeground(Color) | Changes the color of the progress bar.

setBackground(Color) | Changes the background color.

setIndeterminate(true) | Used when progress is unknown.

SwingWorker.execute() | Runs background task without freezing the GUI.
*/