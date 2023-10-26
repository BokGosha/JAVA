package ru.mirea.lab24.task_3;

import javax.swing.*;

public class TextDocumentDemo {
    public static void main(String[] args) {
        Editor editor = new Editor();

        editor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        editor.setSize(200, 100);

        editor.setVisible(true);
    }
}
