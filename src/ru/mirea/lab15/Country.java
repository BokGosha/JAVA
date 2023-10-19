package ru.mirea.lab15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Objects;

class Country extends JFrame {
    Country() {
        super("Countries");

        setLayout(new FlowLayout());
        setSize(250, 150);

        JComboBox<String> comboBox = new JComboBox<>();

        comboBox.addItem("Australia");
        comboBox.addItem("China");
        comboBox.addItem("England");
        comboBox.addItem("Russia");

        comboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JComboBox<String> source = (JComboBox<String>) e.getSource();
                String selectedValue = (String) source.getSelectedItem();

                if (Objects.equals(selectedValue, "Russia")) {
                    JOptionPane.showMessageDialog(null, "This country is very cold", "Alert", JOptionPane.INFORMATION_MESSAGE);
                } else if (Objects.equals(selectedValue, "Australia")) {
                    JOptionPane.showMessageDialog(null, "This country is very hot", "Alert", JOptionPane.INFORMATION_MESSAGE);
                } else if (Objects.equals(selectedValue, "England")) {
                    JOptionPane.showMessageDialog(null, "In this country people like tea", "Alert", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "This country is beautiful", "Alert", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        add(comboBox);
    }

    public static void main(String[] args) {
        new Country().setVisible(true);
    }
}