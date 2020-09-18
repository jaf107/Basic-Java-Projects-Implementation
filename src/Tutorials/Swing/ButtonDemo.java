package Tutorials.Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonDemo implements ActionListener{

    JLabel mylabel ;
    public ButtonDemo ()
    {
        JFrame jFrame = new JFrame("Button");

        // Specify FlowLayout for the layout manager
        jFrame.setLayout(new FlowLayout());

        // Give a size for our frame
        jFrame.setSize(200,100);

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Make a Button
        JButton upButton = new JButton("Up");
        JButton downButton = new JButton("Down");

        // 2 ways to select action upon a button
        // 1st way:
//        upButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent actionEvent) {
//                // Do the action Listener
//
//                mylabel = new JLabel("Up Button pressed");
//            }
//        });
//
//        downButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent actionEvent) {
//                mylabel = new JLabel("Down Button pressed");
//            }
//        });

        // 2nd way
        // Add EventListeners
        upButton.addActionListener(this);
        downButton.addActionListener(this);

        // Label
        mylabel = new JLabel("Press Button");

        jFrame.add(upButton);
        jFrame.add(downButton);
        jFrame.add(mylabel);

        // Show it
        jFrame.setVisible(true);

    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ButtonDemo();
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

        String label = "";
        if (actionEvent.getActionCommand().equals("Up")) {
            mylabel.setText("You pressed Up");
        } else if (actionEvent.getActionCommand().equals("Down"))
        {
            mylabel.setText("You pressed down");
        }

    }
}
