package ru.mirea.lab24.task_3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class Editor extends JFrame {
    private IDocument document;
    private ICreateDocument documentFactory;

    Editor() {
        setTitle("Editor");

        JComboBox<String> comboBox = new JComboBox<>();

        comboBox.addItem("Text");
        comboBox.addItem("Music");
        comboBox.addItem("Image");

        comboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JComboBox<String> source = (JComboBox<String>) e.getSource();
                String selectedValue = (String) source.getSelectedItem();

                if (Objects.equals(selectedValue, "Text")) {
                    documentFactory = new CreateTextDocument();
                }
                else {
                    showError("You must enter a text file");
                }
            }
        });

        add(comboBox);

        JMenuBar menu = new JMenuBar();

        JMenu file = new JMenu("File");

        JMenuItem Save = new JMenuItem("Save");
        JMenuItem Open = new JMenuItem("Open");
        JMenuItem Exit = new JMenuItem("Exit");
        JMenuItem New = new JMenuItem("New");

        file.add(New);
        file.add(Open);
        file.add(Save);
        file.add(Exit);

        menu.add(file);

        setJMenuBar(menu);

        Save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (document == null) {
                    showError("Document is not created");
                }

                saveDocument();
            }
        });

        Open.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openDocument();
            }
        });

        New.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                createNewDocument();
            }
        });

        Exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    public void createNewDocument() {
        document = documentFactory.createNew();
        showInfo("Document was created");
    }

    public void openDocument() {
        document = documentFactory.createOpen();
        showInfo("Document was opened");
    }

    public void saveDocument() {
        showInfo(document.save());
    }

    public void showError(String message) {
        JOptionPane.showMessageDialog(this, message, "Error", JOptionPane.INFORMATION_MESSAGE);
    }

    public void showInfo(String message) {
        JOptionPane.showMessageDialog(this, message, "Info", JOptionPane.INFORMATION_MESSAGE);
    }
}