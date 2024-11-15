import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        // Jlabel is a GUI display area for a string of text, an image, or both.

        JLabel label = new JLabel();// create a label
        label.setText("Bro, do you even code?");// set text of the label
        Border border = BorderFactory.createLineBorder(Color.GREEN, 3);// create a border

        ImageIcon image = new ImageIcon("spike.jpg");// create an image icon
        label.setIcon(image);// set the image icon to the label
        label.setHorizontalTextPosition(JLabel.CENTER);// set text position
        label.setVerticalTextPosition(JLabel.TOP);// set text position


        // Font
        label.setForeground(new java.awt.Color(0, 255, 255));// set text color
        label.setFont(new java.awt.Font("MV Boli", java.awt.Font.BOLD, 20));// set font
        label.setIconTextGap(100);// set gap between text and image
        label.setBackground(Color.BLACK);// set background color
        label.setOpaque(true);// display background color
        label.setBorder(border);// set border
        label.setVerticalAlignment(JLabel.CENTER);// set vertical position
        label.setHorizontalAlignment(JLabel.CENTER);// set horizontal position
//        label.setBounds(0, 0, 1000, 1000);// set x, y, width, height

        JFrame frame = new JFrame("Hello World");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 1000);
        // If you set the size smaller than the image, the image won't be displayed
        // unless you resize the window or make it fullscreen
        frame.setVisible(true);
//        frame.setLayout(null);
        frame.add(label);
        frame.pack();
        // add all components to the frame, then pack it.

    }
}