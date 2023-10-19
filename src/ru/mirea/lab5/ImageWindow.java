package ru.mirea.lab5;

import javax.swing.*;
import java.awt.*;

public class ImageWindow extends JFrame {
    public ImageWindow(String imagePath) {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700, 700);
        setLocationRelativeTo(null);

        JLabel imageLabel = new JLabel();
        ImageIcon imageIcon = new ImageIcon(imagePath);
        Image image = imageIcon.getImage();
        Image scaledImage = image.getScaledInstance(700, 400, Image.SCALE_SMOOTH);
        imageLabel.setIcon(new ImageIcon(scaledImage));

        getContentPane().add(imageLabel);
    }

    public static void main(String[] args) {
        ImageWindow window = new ImageWindow(args[0]);
        window.setVisible(true);
    }
}