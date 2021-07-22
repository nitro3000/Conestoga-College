package Lesson6;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LayoutBox {
    private JFrame frame;

    public static void main(String[] args) {
        LayoutBox guiLayout = new LayoutBox ( );
        guiLayout.start ( );
    }

    //    The first thing we need to do is tell Java that we want to use a layout manager for our window and which manager we want to use.
//    Every GUI Container object contains a setLayout() method to assign a layout manager to the container.
//    Its single argument is the layout manager to assign.
//    We will use contentPane's setLayout() method with a BorderLayout object like this:
    public void start() {
        frame = new JFrame ("Box Layout");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        Container contentPane = frame.getContentPane ( );
        contentPane.setLayout(new BoxLayout(contentPane,BoxLayout.Y_AXIS)); //This line has to follow the declaration of contentPane, so we'll add it as the fourth line of our start method.

        contentPane.add(new JButton("First Button"));
        contentPane.add(new JButton("Second Button - a long one"));
        contentPane.add(new JButton("Third Button"));
        contentPane.add(new JButton("Fourth Button"));

        frame.pack ( );
        frame.setVisible (true);
    }
}
