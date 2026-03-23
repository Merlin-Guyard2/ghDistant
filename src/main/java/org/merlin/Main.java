package org.merlin;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;


public class Main {
    public static void main(String[] args) {

        JFrame window = new JFrame("Hello world");
        window.setSize(200, 200);
        window.setDefaultCloseOperation((JFrame.EXIT_ON_CLOSE));

        JLabel label = new JLabel("Hellow world", SwingConstants.CENTER);
        Color yellow = Color.yellow;
        label.setForeground(Color.yellow);

        window.add(label);
        window.setVisible(true);
    }
}