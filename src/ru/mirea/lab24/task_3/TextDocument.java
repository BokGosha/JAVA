package ru.mirea.lab24.task_3;

public class TextDocument implements IDocument {
    @Override
    public String save() {
        return "Document was saved";
    }
}