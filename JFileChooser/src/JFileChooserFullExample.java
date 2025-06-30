import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File;

public class JFileChooserFullExample {

    public static void main(String[] args) {
        // Create a basic JFrame (invisible, used only to anchor dialogs)
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // -------------------- OPEN FILE --------------------
        // Create a JFileChooser instance
        JFileChooser fileChooser = new JFileChooser();

        // Set a file filter to only allow .txt and .pdf files
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Text & PDF Files", "txt", "pdf");
        fileChooser.setFileFilter(filter);

        // Show the Open dialog box .showOpenDialog() and store the user's response
        //Parameters: parent: A component (like a JFrame) to center the dialog on. Use null if no parent
        /*Returns (int):
              JFileChooser.APPROVE_OPTION – user clicked "Open"
         	  JFileChooser.CANCEL_OPTION – user clicked "Cancel"
			  JFileChooser.ERROR_OPTION – an error occurred.
        
        */int openResult = fileChooser.showOpenDialog(frame);

        // Check if the user approved the selection
        if (openResult == JFileChooser.APPROVE_OPTION) {
            // Get the selected file
            File selectedFile = fileChooser.getSelectedFile();
            System.out.println("Opened file: " + selectedFile.getAbsolutePath());
        }

        // -------------------- SELECT DIRECTORY --------------------
        // Create another JFileChooser for directory selection
        JFileChooser dirChooser = new JFileChooser();

        // Set the file chooser to allow directories only
        dirChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        //JFileChooser.FILES_ONLY
        //JFileChooser.DIRECTORIES_ONLY
        //JFileChooser.FILES_AND_DIRECTORIES

        // Show the dialog to select a directory
        int dirResult = dirChooser.showOpenDialog(frame);

        // Check if a directory was selected
        if (dirResult == JFileChooser.APPROVE_OPTION) {
            File selectedDir = dirChooser.getSelectedFile();
            System.out.println("Selected directory: " + selectedDir.getAbsolutePath());
        }

        // -------------------- SAVE FILE --------------------
        // Create another JFileChooser for saving a file
        JFileChooser saveChooser = new JFileChooser();

        // Set a default file name for the Save dialog
        saveChooser.setSelectedFile(new File("default_filename.txt"));

        // Show the Save dialog box
        int saveResult = saveChooser.showSaveDialog(frame);//Pops up a "Save File" file chooser dialog

        // Check if the user approved the save
        if (saveResult == JFileChooser.APPROVE_OPTION)
        {
            // Get the file path where the user wants to save
            File saveFile = saveChooser.getSelectedFile();
            System.out.println("File to save: " + saveFile.getAbsolutePath());

            // Optional: warn if file already exists
            if (saveFile.exists()) {
                System.out.println("Warning: File already exists and might be overwritten.");
            }
        }

        // Dispose of the JFrame (not visible to the user)
       	
    }
}
