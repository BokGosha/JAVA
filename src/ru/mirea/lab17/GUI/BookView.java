package ru.mirea.lab17.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class BookView extends JFrame {
    private JTextField nameField;
    private JTextField authorField;
    private JButton button;

    public BookView() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Book");
        setSize(250, 100);

        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new BorderLayout());

        JPanel labelsPanel = new JPanel();
        labelsPanel.setLayout(new BoxLayout(labelsPanel, BoxLayout.Y_AXIS));

        JLabel nameLabel = new JLabel("Название: ");
        labelsPanel.add(nameLabel);

        JLabel authorLabel = new JLabel("Автор: ");
        labelsPanel.add(authorLabel);

        JPanel fieldsPanel = new JPanel();
        fieldsPanel.setLayout(new BoxLayout(fieldsPanel, BoxLayout.Y_AXIS));

        nameField = new JTextField();
        nameField.setPreferredSize(new Dimension(150, 13));
        fieldsPanel.add(nameField);

        authorField = new JTextField();
        authorField.setPreferredSize(new Dimension(150, 13));
        fieldsPanel.add(authorField);

        button = new JButton("Обновить");

        contentPanel.add(labelsPanel, BorderLayout.WEST);
        contentPanel.add(fieldsPanel, BorderLayout.EAST);
        contentPanel.add(button, BorderLayout.SOUTH);

        add(contentPanel);

        setVisible(true);
    }

    public String getNameInput() {
        return nameField.getText();
    }

    public String getAuthorInput() {
        return authorField.getText();
    }

    public void printBookDetails(String name, String author) {
        JOptionPane.showMessageDialog(this, "Название: " + name + "\nАвтор: " + author);
    }

    public void addUpdateListener(ActionListener listener) {
        button.addActionListener(listener);
    }
}
