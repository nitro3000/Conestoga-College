package Lesson5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUIButton1 implements ActionListener {

    private JFrame frame;
    private JButton button;

    public static void main(String[] args) {
        GUIButton1 guiButton = new GUIButton1 ( );
        guiButton.start ( );
    }

    public void start() {
        frame = new JFrame ("A GUI Button");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        Container contentPane = frame.getContentPane ( );

        button = new JButton ("Click Me");
        button.addActionListener (this);
        contentPane.add (button);

        //frame.setSize (200, 200);
        frame.pack ( );
        frame.setVisible (true);

    }

    public void actionPerformed(ActionEvent e) {
        button.setForeground (Color.red);
        button.setText ("I've been clicked!");
    }
}
