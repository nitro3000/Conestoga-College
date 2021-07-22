package Lesson5;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class GUIDialog implements ActionListener {

    private JFrame frame;
    private JButton button;

    public static void main (String[] args)
    {
        GUIDialog guiButton = new GUIDialog();
        guiButton.start();
    }
    public void start()
    {
        frame = new JFrame("GUI Dialog");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = frame.getContentPane();

        button = new JButton("Click Me");
        button.addActionListener(this);
        contentPane.add(button);

        frame.setSize (200, 200);;
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String textToShow;
        textToShow = JOptionPane.showInputDialog(
                frame,
                "Enter the text you want to display:",
                "Input Dialog",
                JOptionPane.WARNING_MESSAGE);
        if (textToShow != null)
        {
            button.setForeground(Color.red);
            button.setText(textToShow);
        }

    }
}
