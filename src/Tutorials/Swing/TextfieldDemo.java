package Tutorials.Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class TextfieldDemo implements ActionListener{

    JTextField jTextField;
    JButton reverseButton;
    JLabel promptLabel;
    JLabel contentLabel;

    public TextfieldDemo()
    {
        JFrame jFrame = new JFrame("Enter text");

        jFrame.setLayout(new FlowLayout());
        jFrame.setSize(250,120);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create Textfield
        jTextField = new JTextField(10);

        jTextField.setActionCommand("textField");

        // Create a Button
        reverseButton = new JButton("Reverse");


        // Add action listeners
        jTextField.addActionListener(this);
        reverseButton.addActionListener(this);

        // Create our label Prompt
        promptLabel = new JLabel("Enter text:");
        contentLabel = new JLabel("");

        // Add to Frame
        jFrame.add(promptLabel);
        jFrame.add(jTextField);
        jFrame.add(reverseButton);
        jFrame.add(contentLabel);

        jFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if(actionEvent.getActionCommand().equals("Reverse"))
        {
            // Reverse the string
            String originalString = jTextField.getText();
            String holder = "";

            for (int i = originalString.length()-1; i >= 0; i--) {
                holder += originalString.charAt(i);
            }
            contentLabel.setText(holder);
        }
        else if(actionEvent.getActionCommand().equals("textField"))
        {
            // Enter was pressed that was in the textfield
            contentLabel.setText("You pressed Enter. Text is " + jTextField.getText());
        }

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TextfieldDemo();
            }
        });
    }


}
