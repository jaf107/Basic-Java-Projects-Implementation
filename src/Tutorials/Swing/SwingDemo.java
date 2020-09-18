package Tutorials.Swing;
import javax.swing.*;

public class SwingDemo {
    public SwingDemo()
    {
        // Create a new JFrame container
        JFrame jFrame = new JFrame("First Swing Application");

        // Give it a size
        jFrame.setSize(400,300);

        // Terminate the program when the user closes the application
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);

        // Create a jLabel
        JLabel jLabel = new JLabel("This is Amazing!");

        // Add to the frame
        jFrame.add(jLabel);

        // Show the program
        jFrame.setVisible(true);
    }
    public static void main(String[] args) {
        // Create the frame on the event dispatching thread
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SwingDemo();
            }
        });


        SwingDemo swingDemo = new SwingDemo();
    }
}
