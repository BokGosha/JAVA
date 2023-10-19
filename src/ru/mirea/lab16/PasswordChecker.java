package ru.mirea.lab16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class PasswordChecker extends JFrame {
    private JTextField passwordField;
    private JTextField service;
    private JTextField user;

    public PasswordChecker() {
        setTitle("Password Checker");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new BorderLayout());

        JPanel labelsPanel = new JPanel();
        labelsPanel.setLayout(new BoxLayout(labelsPanel, BoxLayout.Y_AXIS));

        JLabel Service = new JLabel("Sevice: ");
        Service.setFont(new Font("Arial", Font.BOLD, 15));
        labelsPanel.add(Service);

        JLabel User = new JLabel("User: ");
        User.setFont(new Font("Arial", Font.BOLD, 15));
        labelsPanel.add(User);

        JLabel Password = new JLabel("Enter your password: ");
        Password.setFont(new Font("Arial", Font.BOLD, 15));
        labelsPanel.add(Password);

        JPanel fieldsPanel = new JPanel();
        fieldsPanel.setLayout(new BoxLayout(fieldsPanel, BoxLayout.Y_AXIS));

        service = new JTextField();
        service.setPreferredSize(new Dimension(150, 13));
        fieldsPanel.add(service);

        user = new JTextField();
        user.setPreferredSize(new Dimension(150, 13));
        fieldsPanel.add(user);

        passwordField = new JPasswordField();
        passwordField.setPreferredSize(new Dimension(150, 13));

        passwordField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    String password = passwordField.getText();
                    if (isValidPassword(password)) {
                        showResult("Password is valid");
                    }
                    else {
                        showResult("Password is invalid");
                    }
                    passwordField.setText("");
                }
            }
        });
        fieldsPanel.add(passwordField);

        contentPanel.add(labelsPanel, BorderLayout.WEST);
        contentPanel.add(fieldsPanel, BorderLayout.EAST);

        add(contentPanel);

        pack();
        setLocationRelativeTo(null);
    }

    private boolean isValidPassword(String password) {
        return password.length() >= 8 && password.matches(".*\\d.*");
    }

    private void showResult(String message) {
        JOptionPane.showMessageDialog(this, message, "PasswordChecker", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PasswordChecker().setVisible(true);
            }
        });
    }
}