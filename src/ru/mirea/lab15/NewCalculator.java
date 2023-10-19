package ru.mirea.lab15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewCalculator extends JFrame {
    private JTextField textField;
    private JButton button0, button1, button2, button3, button4, button5, button6, button7, button8, button9;
    private JButton buttonDot, buttonEqual, buttonPlus, buttonMinus, buttonMultiply, buttonDivide;

    private double firstNumber;
    private String operator;

    public NewCalculator() {
        setTitle("Simple Calculator");

        setLayout(new GridLayout(2, 1));

        textField = new JTextField();
        textField.setEditable(false);

        button0 = new JButton("0");
        button1 = new JButton("1");
        button2 = new JButton("2");
        button3 = new JButton("3");
        button4 = new JButton("4");
        button5 = new JButton("5");
        button6 = new JButton("6");
        button7 = new JButton("7");
        button8 = new JButton("8");
        button9 = new JButton("9");
        buttonDot = new JButton(".");
        buttonEqual = new JButton("=");
        buttonPlus = new JButton("+");
        buttonMinus = new JButton("-");
        buttonMultiply = new JButton("*");
        buttonDivide = new JButton("/");

        button0.addActionListener(new NumberButtonListener());
        button1.addActionListener(new NumberButtonListener());
        button2.addActionListener(new NumberButtonListener());
        button3.addActionListener(new NumberButtonListener());
        button4.addActionListener(new NumberButtonListener());
        button5.addActionListener(new NumberButtonListener());
        button6.addActionListener(new NumberButtonListener());
        button7.addActionListener(new NumberButtonListener());
        button8.addActionListener(new NumberButtonListener());
        button9.addActionListener(new NumberButtonListener());
        buttonDot.addActionListener(new NumberButtonListener());

        buttonEqual.addActionListener(new OperatorButtonListener());
        buttonPlus.addActionListener(new OperatorButtonListener());
        buttonMinus.addActionListener(new OperatorButtonListener());
        buttonMultiply.addActionListener(new OperatorButtonListener());
        buttonDivide.addActionListener(new OperatorButtonListener());

        add(textField);

        JPanel buttonPanel = new JPanel();

        GridLayout gridLayout = new GridLayout(4, 4); // 2 строки, 1 столбец
        gridLayout.setHgap(5); // Промежуток между столбцами
        gridLayout.setVgap(5); // Промежуток между строками
        buttonPanel.setLayout(gridLayout);

        buttonPanel.setBackground(Color.gray);

        buttonPanel.add(button7);
        buttonPanel.add(button8);
        buttonPanel.add(button9);
        buttonPanel.add(buttonDivide);

        buttonPanel.add(button4);
        buttonPanel.add(button5);
        buttonPanel.add(button6);
        buttonPanel.add(buttonMultiply);

        buttonPanel.add(button1);
        buttonPanel.add(button2);
        buttonPanel.add(button3);
        buttonPanel.add(buttonMinus);

        buttonPanel.add(button0);
        buttonPanel.add(buttonDot);
        buttonPanel.add(buttonEqual);
        buttonPanel.add(buttonPlus);

        add(buttonPanel);
    }

    private class NumberButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String currentText = textField.getText();
            String buttonValue = ((JButton) e.getSource()).getText();
            textField.setText(currentText + buttonValue);
        }
    }

    private class OperatorButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String buttonValue = ((JButton) e.getSource()).getText();
            String currentText = textField.getText();

            if (buttonValue.equals("=")) {
                double secondNumber = Double.parseDouble(currentText);
                double result = calculate(firstNumber, secondNumber, operator);
                textField.setText(String.valueOf(result));
            } else {
                firstNumber = Double.parseDouble(currentText);
                operator = buttonValue;
                textField.setText("");
            }
        }

        private double calculate(double firstNumber, double secondNumber, String operator) {
            double result = 0;

            switch (operator) {
                case "+":
                    result = firstNumber + secondNumber;
                    break;
                case "-":
                    result = firstNumber - secondNumber;
                    break;
                case "*":
                    result = firstNumber * secondNumber;
                    break;
                case "/":
                    result = firstNumber / secondNumber;
                    break;
            }

            return result;
        }
    }

    public static void main(String[] args) {
        NewCalculator frame = new NewCalculator();
        frame.setSize(300, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}