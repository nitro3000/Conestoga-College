package Lesson7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import static java.awt.SystemColor.menu;

public class GUIMenu2 {
    private JFrame frame;

    public static void main(String[] args) {
        GUIMenu2 gui = new GUIMenu2 ( );
        gui.start ( );
    }

    public void start() {

        frame = new JFrame ("GUI Menus");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        Container contentPane = frame.getContentPane ( );

        makeMenus ( );
        frame.setSize (300, 300);
        frame.setVisible (true);
    }

    private void makeMenus() {

        JMenuBar menuBar;
        JMenu menu;
        JMenuItem menuItem;
        menuBar = new JMenuBar ( );
        frame.setJMenuBar (menuBar);

// set up the File menu
        menu = new JMenu ("File");
        menu.setMnemonic(KeyEvent.VK_F);// ALT + F
        menuBar.add (menu);

// add File menu items
        menuItem = new JMenuItem ("New");
        menuItem.setMnemonic(KeyEvent.VK_N); // ALT + N
        menuItem.addActionListener (new newListener ( ));
        menuItem.setAccelerator(
                KeyStroke.getKeyStroke(KeyEvent.VK_N,
                        InputEvent.CTRL_MASK)); // CTRL + N

        menu.add (menuItem);
        menuItem = new JMenuItem ("Open...");
        menuItem.setMnemonic(KeyEvent.VK_O);
        menuItem.setAccelerator(
                KeyStroke.getKeyStroke(KeyEvent.VK_O,
                        Event.CTRL_MASK));
        menuItem.addActionListener (new openListener ( ));

        menu.add (menuItem);
        menuItem = new JMenuItem ("Save");
        menuItem.addActionListener (new saveListener ( ));
        menu.add (menuItem);
        menuItem = new JMenuItem ("Save As...");
        menuItem.addActionListener (new saveAsListener ( ));
        menu.add (menuItem);
        menu.addSeparator ( );
        menuItem = new JMenuItem ("Exit");
        menuItem.addActionListener (new exitListener ( ));
        menu.add (menuItem);

    }

    private class newListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog (frame,
                    "The  File > New  menu option was clicked",
                    "Menu Item Click",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private class openListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog (frame,
                    "The  File > Open...  menu option was clicked",
                    "Menu Item Click",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private class saveListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog (frame,
                    "The  File > Save  menu option was clicked",
                    "Menu Item Click",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private class saveAsListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog (frame,
                    "The  File > Save As...  menu option was clicked",
                    "Menu Item Click",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private class exitListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.exit (0);
        }
    }


//    public void actionPerformed(ActionEvent e) {
//        if (e.getActionCommand().equals("New"))
//            newMethod();
//        else if (e.getActionCommand().equals("Open..."))
//            openMethod();
//        else if (e.getActionCommand().equals("Save"))
//            saveMethod();
//        else if (e.getActionCommand().equals("Save As..."))
//            saveAsMethod();
//        else if (e.getActionCommand().equals("Exit"))
//            exitMethod();
//
//    }
//    private void newMethod()
//    {
//        JOptionPane.showMessageDialog (frame, "The  File > New  menu option was clicked", "Menu Item Click", JOptionPane.INFORMATION_MESSAGE);
//    }
//    private void openMethod()
//    {
//        JOptionPane.showMessageDialog (frame, "The  File > Open  menu option was clicked", "Menu Item Click", JOptionPane.INFORMATION_MESSAGE);
//    }
//    private void saveMethod()
//    {
//        JOptionPane.showMessageDialog (frame, "The  File > Save  menu option was clicked", "Menu Item Click", JOptionPane.INFORMATION_MESSAGE);
//    }
//    private void saveAsMethod()
//    {
//        JOptionPane.showMessageDialog (frame, "The  File > Save As  menu option was clicked", "Menu Item Click", JOptionPane.INFORMATION_MESSAGE);
//    }
//    private void exitMethod()
//    {
//        JOptionPane.showMessageDialog (frame, "The  File > Exit  menu option was clicked", "Menu Item Click", JOptionPane.WARNING_MESSAGE);
//        System.exit(0);
//    }
}
