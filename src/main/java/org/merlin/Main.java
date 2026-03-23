package org.merlin;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


public class Main {
    public static void main(String[] args) {
        System.out.println(System.getProperty("user.dir"));
        Properties properties = new Properties();

        try (InputStream input = Main.class
                .getClassLoader()
                .getResourceAsStream("config.properties")) {
            properties.load(input);
        } catch (IOException e) {
            e.printStackTrace();
        }

            JFrame window = new JFrame(properties.getProperty("HELLO_WORLD"));
        window.setSize(200, 200);
        window.setDefaultCloseOperation((JFrame.EXIT_ON_CLOSE));

        JLabel label = new JLabel(properties.getProperty("HELLO_WORLD"), SwingConstants.CENTER);
        Color yellow = Color.yellow;
        label.setForeground(Color.yellow);

        window.add(label);
        window.setVisible(true);
    }
}