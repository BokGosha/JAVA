package ru.mirea.lab16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame {
    private JTextArea text;

    public Menu() {
        setTitle("Menu");
        setPreferredSize(new Dimension(200, 200));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JMenuBar menu = new JMenuBar();
        JMenu format = new JMenu("Format");

        JMenuItem colorMenu = new JMenu("Color");
        JMenuItem blueMenuItem = new JMenuItem("Blue");
        JMenuItem redMenuItem = new JMenuItem("Red");
        JMenuItem blackMenuItem = new JMenuItem("Black");

        JMenuItem fontMenu = new JMenu("Font");
        JMenuItem timesNewRomanMenuItem = new JMenuItem("Times New Roman");
        JMenuItem msSansSerifMenuItem = new JMenuItem("MS Sans Serif");
        JMenuItem courierNewMenuItem = new JMenuItem("Courier New");

        JTextArea text = new JTextArea();
        text.setFont(new Font("Arial", Font.PLAIN, 12));

        blueMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setForeground(Color.blue);
            }
        });

        redMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setForeground(Color.red);
            }
        });

        blackMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setForeground(Color.black);
            }
        });

        timesNewRomanMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setFont(new Font("Times New Roman", Font.PLAIN, 12));
            }
        });

        msSansSerifMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setFont(new Font("MS Sans Serif", Font.PLAIN, 12));
            }
        });

        courierNewMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setFont(new Font("Courier New", Font.PLAIN, 12));
            }
        });

        menu.add(colorMenu);
        colorMenu.add(redMenuItem);
        colorMenu.add(blueMenuItem);
        colorMenu.add(blackMenuItem);

        menu.add(fontMenu);
        fontMenu.add(msSansSerifMenuItem);
        fontMenu.add(timesNewRomanMenuItem);
        fontMenu.add(courierNewMenuItem);

        format.add(colorMenu);
        format.add(fontMenu);

        menu.add(format);
        setJMenuBar(menu);

        add(new JScrollPane(text), BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }
}
