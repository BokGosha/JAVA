package ru.mirea.lab24.task_2;

public class Client {
    private Chair chair;

    public void sit() {
        System.out.println("Client is sitting on " + chair);
    }

    public void setChair(Chair chair) {
        this.chair = chair;
    }
}
