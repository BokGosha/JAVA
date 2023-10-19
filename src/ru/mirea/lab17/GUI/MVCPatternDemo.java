package ru.mirea.lab17.GUI;

import java.util.Objects;

public class MVCPatternDemo {
    public static void main(String[] args) {
        Book model = new Book();

        BookView view = new BookView();

        BookController controller = new BookController(model, view);

        if (!Objects.equals(controller.getModelAuthor(), null) && !Objects.equals(controller.getModelAuthor(), null)) {
            controller.updateView();
        }
    }
}