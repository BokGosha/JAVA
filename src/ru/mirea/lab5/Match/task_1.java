package ru.mirea.lab5.Match;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class task_1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Match");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 150);

        JPanel panel = new JPanel();
        panel.setBackground(Color.CYAN);
        panel.setPreferredSize(new Dimension(200, 300));
        panel.setLayout(new GridLayout(4, 1));

        final int[] count_RM = {0};
        final int[] count_ACM = {0};

        JLabel label = new JLabel("Result: 0 X 0", JLabel.LEFT);
        JLabel label1 = new JLabel("Last Scorer: N/A", JLabel.LEFT);
        JLabel label2 = new JLabel("Winner: DRAW", JLabel.LEFT);

        JButton button1 = new JButton("Real Madrid");
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count_RM[0]++;
                label.setText("Result: " + count_RM[0] + " X " + count_ACM[0]);
                label1.setText("Last Scorer: Real Madrid");

                if (count_RM[0] > count_ACM[0]) {
                    label2.setText("Winner: Real Madrid");
                }
                else if (count_RM[0] == count_ACM[0]) {
                    label2.setText("Winner: DRAW");
                }
            }
        });

        JButton button2 = new JButton("AC Milan");
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count_ACM[0]++;
                label.setText("Result: " + count_RM[0] + " X " + count_ACM[0]);
                label1.setText("Last Scorer: AC Milan");

                if (count_RM[0] < count_ACM[0]) {
                    label2.setText("Winner: AC Milan");
                }
                else if (count_RM[0] == count_ACM[0]) {
                    label2.setText("Winner: DRAW");
                }
            }
        });

        panel.add(button1);
        panel.add(button2);
        panel.add(label);
        panel.add(label1);
        panel.add(label2);

        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
