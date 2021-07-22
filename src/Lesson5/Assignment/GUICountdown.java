package Lesson5.Assignment;
//Your assignment for this lesson is to write a GUI program that will use a button to count down from five to zero. When it reaches zero, it should display a label indicating the end of the count. Each click should decrease the number by one. For example, when the program starts the button will say "Five" or "5." After the first click, it will say "Four" or "4," and so on. When it gets to zero, the button should be replaced by a label with a message in it. The text in the label can say anything you like.
//
//        There are two things you will need to use that we did not discuss in the lesson. You will need to be able to find out what text was on the button when it was clicked. You can do that with the button's getText() method.
//
//        You will also need to know how to make a button disappear so you can see the label. A button has a setVisible() method just like a frame does. To make the button disappear, call its setVisible() method with an argument of false.
//
//        If you would like to see my solution, here it is:
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUICountdown implements ActionListener
{
    private JFrame frame;
    private JButton button;
    private Container contentPane;
    private JLabel label;

    public static void main (String[] args)
    {
        GUICountdown guiCount = new GUICountdown();
        guiCount.start();
    }

    public void start()
    {
        frame = new JFrame("GUI Countdown");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        contentPane = frame.getContentPane();

        button = new JButton("Countdown Button");
        button.addActionListener(this);
        contentPane.add(button);

        frame.setSize(300,300);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        button.setForeground(Color.red);

        switch (button.getText())
        {
            case "Countdown Button":
                button.setText("Five");
                break;
            case "Five":
                button.setText("Four");
                break;
            case "Four":
                button.setText("Three");
                break;
            case "Three":
                button.setText("Two");
                break;
            case "Two":
                button.setText("One");
                break;
            case "One":
                button.setVisible(false);
                label = new JLabel("Congratulations!!! You've reached ZERO!");
                contentPane.add(label);
                break;
        }
    }
}
