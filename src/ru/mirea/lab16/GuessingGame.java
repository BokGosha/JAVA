package ru.mirea.lab16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuessingGame extends JFrame {
    private int numberToGuess;
    private int attemptsLeft;
    private JLabel resultLabel;
    private JTextField guessField;

    public GuessingGame() {
        setTitle("Guessing Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setResizable(false);

        JLabel titleLabel = new JLabel("Guess a number between 0 and 20");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);

        guessField = new JTextField();
        guessField.setPreferredSize(new Dimension(200, 30));

        JButton guessButton = new JButton("Guess");
        guessButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkGuess();
            }
        });

        resultLabel = new JLabel();
        resultLabel.setFont(new Font("Arial", Font.BOLD, 18));
        resultLabel.setHorizontalAlignment(SwingConstants.CENTER);

        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.Y_AXIS));
        centerPanel.add(titleLabel);
        centerPanel.add(Box.createRigidArea(new Dimension(0, 20)));
        centerPanel.add(guessField);
        centerPanel.add(Box.createRigidArea(new Dimension(0, 20)));
        centerPanel.add(guessButton);
        centerPanel.add(Box.createRigidArea(new Dimension(0, 20)));
        centerPanel.add(resultLabel);

        add(centerPanel, BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);

        numberToGuess = (int) (Math.random() * 21);
        System.out.println(numberToGuess);
        attemptsLeft = 3;
    }

    private void checkGuess() {
        int guess = Integer.parseInt(guessField.getText());

        if (guess == numberToGuess) {
            numberToGuess = (int) (Math.random() * 21);
            showResult("Congratulations! You guessed the number!");
            attemptsLeft = 3;
            guessField.setText("");
            return;
        }
        else if (guess < numberToGuess) {
            showResult("Wrong guess! The number is greater than " + guess + ".");
        }
        else if (guess > numberToGuess) {
            showResult("Wrong guess! The number is less than " + guess + ".");
        }

        guessField.setText("");
        attemptsLeft--;

        if (attemptsLeft == 0) {
            showResult("Game Over! You ran out of attempts. The number was " + numberToGuess + ".");
            numberToGuess = (int) (Math.random() * 21);
            attemptsLeft = 3;
        }
    }

    private void showResult(String message) {
        JOptionPane.showMessageDialog(this, message, "Guessing Game", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GuessingGame().setVisible(true);
            }
        });
    }
}