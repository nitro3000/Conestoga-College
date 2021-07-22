package Lesson6;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LayoutBorder {
    private JFrame frame;

    public static void main(String[] args) {
        LayoutBorder guiLayout = new LayoutBorder ( );
        guiLayout.start ();
    }

    //    The first thing we need to do is tell Java that we want to use a layout manager for our window and which manager we want to use.
//    Every GUI Container object contains a setLayout() method to assign a layout manager to the container.
//    Its single argument is the layout manager to assign.
//    We will use contentPane's setLayout() method with a BorderLayout object like this:
    public void start() {
        frame = new JFrame ("Border Layout");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        Container contentPane = frame.getContentPane ( );
        contentPane.setLayout (new BorderLayout ( )); //This line has to follow the declaration of contentPane, so we'll add it as the fourth line of our start method.

//        contentPane.add(new JButton("North Button"),
//                BorderLayout.NORTH);
        contentPane.add (new JButton ("South Button"),
                BorderLayout.SOUTH);
        contentPane.add (new JButton ("East Button"),
                BorderLayout.EAST);
        contentPane.add (new JButton ("West Button"),
                BorderLayout.WEST);
        contentPane.add (new JButton ("Center Button"),
                BorderLayout.CENTER);

        frame.pack ( );
        frame.setVisible (true);
    }
}