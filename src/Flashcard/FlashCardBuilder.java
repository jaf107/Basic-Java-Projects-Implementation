package Flashcard;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class FlashCardBuilder {
    private JTextArea question;
    private JTextArea answer;
    private ArrayList<FlashCard> cardList;
    private JFrame frame;

    public FlashCardBuilder() {
        // Build our User interface
        frame = new JFrame("Flash Card");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Create a JPanel to hold everything
        JPanel mainPanel = new JPanel();

        //Create Font
        Font greatFont = new Font("Helvitica", Font.BOLD,21);
        question = new JTextArea(6,20);
        question.setLineWrap(true);
        question.setWrapStyleWord(true);
        question.setFont(greatFont);

        //Question area
        JScrollPane qJScrollPane = new JScrollPane(question);
        qJScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        qJScrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        //Answer area
        answer = new JTextArea(6,20);
        answer.setLineWrap(true);
        answer.setWrapStyleWord(true);
        answer.setFont(greatFont);


        //JScrollPane
        JScrollPane aJScrollPane = new JScrollPane(answer);
        aJScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        aJScrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        JButton nextButton = new JButton("Next Card");


        // Create a few labels
        JLabel qJLabel = new JLabel("Question");
        JLabel aJLabel = new JLabel("Answer");


        //Add components to mainPanel
        mainPanel.add(qJLabel);
        mainPanel.add(qJScrollPane);
        mainPanel.add(aJLabel);
        mainPanel.add(aJScrollPane);
        mainPanel.add(nextButton);
        nextButton.addActionListener(new NextCardListener());


        //Menubar
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenuItem newMenuItem = new JMenuItem("New");

        JMenuItem saveMenuItem = new JMenuItem("Save");

        // Add eventListeners
        newMenuItem.addActionListener(new NewMenuItemListener());
        saveMenuItem.addActionListener(new SaveMenuItemListener());




        // Add to the frame
        frame.getContentPane().add(BorderLayout.CENTER,mainPanel);
        frame.setSize(500,600);
        frame.setVisible(true);


    }
    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FlashCardBuilder();
            }
        });

    }

    class NextCardListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            System.out.println("Button Clicked");
        }
    }

    class NewMenuItemListener implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            System.out.println("New file created");
        }
    }

    class SaveMenuItemListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            System.out.println("Item saved");
        }
    }


}
