package ru.mirea.lab17.GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BookController {
    private Book model;
    private BookView view;

    public BookController(Book model, BookView view) {
        this.model = model;
        this.view = view;
        this.view.addUpdateListener(new UpdateListener());
    }

    public String getModelName() {
        return model.getName();
    }

    public void setModelName(String name) {
        model.setName(name);
    }

    public String getModelAuthor() {
        return model.getAuthor();
    }

    public void setModelAuthor(String author) {
        model.setAuthor(author);
    }

    public void updateView() {
        view.printBookDetails(model.getName(), model.getAuthor());
    }

    private class UpdateListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String name = view.getNameInput();
            String author = view.getAuthorInput();

            model.setName(name);
            model.setAuthor(author);

            updateView();
        }
    }
}