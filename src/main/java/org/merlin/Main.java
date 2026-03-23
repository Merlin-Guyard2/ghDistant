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

        int width = Integer.parseInt(properties.getProperty("WIDTH"));

        Color background = Color.decode(properties.getProperty("BACKGROUND_COLOR"));
        Color foreground = Color.decode(properties.getProperty("FOREGROUND_COLOR"));

        JFrame window = new JFrame(properties.getProperty("HELLO_WORLD"));
        window.getContentPane().setBackground(background);
        window.setSize(Integer.parseInt(properties.getProperty("WIDTH")), Integer.parseInt(properties.getProperty("HEIGHT")));
        window.setDefaultCloseOperation((JFrame.EXIT_ON_CLOSE));

        JLabel label = new JLabel(properties.getProperty("HELLO_WORLD"), SwingConstants.CENTER);
        label.setForeground(foreground);

        window.add(label);
        window.setVisible(true);
    }
}