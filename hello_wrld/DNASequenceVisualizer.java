package hello_wrld;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DNASequenceVisualizer extends JFrame {
    private JTextArea dnaSequenceArea;
    private JButton reverseComplementButton;
    private JButton transcriptionButton;
    private JPanel sequencePanel;

    // Constructor to set up the GUI
    public DNASequenceVisualizer() {
        // Set title and default behavior
        setTitle("DNA Sequence Visualizer");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null); // Center the window on the screen
        
        // Initialize the components
        dnaSequenceArea = new JTextArea(5, 40);
        reverseComplementButton = new JButton("Reverse Complement");
        transcriptionButton = new JButton("Transcribe (DNA to RNA)");
        sequencePanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                renderSequence(g); // Render the sequence on the panel
            }
        };

        // Set up layout
        JPanel inputPanel = new JPanel();
        inputPanel.add(new JLabel("Enter DNA Sequence:"));
        inputPanel.add(new JScrollPane(dnaSequenceArea));
        inputPanel.add(reverseComplementButton);
        inputPanel.add(transcriptionButton);

        // Set layout for the main frame
        setLayout(new BorderLayout());
        add(inputPanel, BorderLayout.NORTH);
        add(sequencePanel, BorderLayout.CENTER);

        // Add event listeners to the buttons
        reverseComplementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String dnaSequence = dnaSequenceArea.getText().toUpperCase().replaceAll("[^ATCG]", "");
                String reverseComplement = getReverseComplement(dnaSequence);
                dnaSequenceArea.setText(reverseComplement);
                sequencePanel.repaint(); // Re-render the sequence panel
            }
        });

        transcriptionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String dnaSequence = dnaSequenceArea.getText().toUpperCase().replaceAll("[^ATCG]", "");
                String rnaSequence = transcribeToRNA(dnaSequence);
                dnaSequenceArea.setText(rnaSequence);
                sequencePanel.repaint(); // Re-render the sequence panel
            }
        });
    }

    // Render the DNA sequence with colors
    private void renderSequence(Graphics g) {
        String dnaSequence = dnaSequenceArea.getText().toUpperCase().replaceAll("[^ATCG]", "");
        if (dnaSequence.isEmpty()) return;

        // Set font and initial coordinates for drawing
        g.setFont(new Font("Courier", Font.PLAIN, 20));
        int x = 10;
        int y = 30;
        
        // Loop through the sequence and render each nucleotide with a different color
        for (int i = 0; i < dnaSequence.length(); i++) {
            char base = dnaSequence.charAt(i);
            switch (base) {
                case 'A':
                    g.setColor(Color.GREEN);
                    break;
                case 'T':
                    g.setColor(Color.RED);
                    break;
                case 'C':
                    g.setColor(Color.BLUE);
                    break;
                case 'G':
                    g.setColor(Color.YELLOW);
                    break;
            }
            g.drawString(String.valueOf(base), x, y);
            x += 20; // Move the x-coordinate for the next base
        }
    }

    // Function to generate reverse complement of the sequence
    private String getReverseComplement(String sequence) {
        StringBuilder reverseComplement = new StringBuilder();
        for (int i = sequence.length() - 1; i >= 0; i--) {
            char base = sequence.charAt(i);
            switch (base) {
                case 'A': reverseComplement.append('T'); break;
                case 'T': reverseComplement.append('A'); break;
                case 'C': reverseComplement.append('G'); break;
                case 'G': reverseComplement.append('C'); break;
            }
        }
        return reverseComplement.toString();
    }

    // Function to transcribe DNA to RNA (replace T with U)
    private String transcribeToRNA(String sequence) {
        return sequence.replace('T', 'U');
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                DNASequenceVisualizer frame = new DNASequenceVisualizer();
                frame.setVisible(true);
            }
        });
    }
}

