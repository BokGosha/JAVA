package ru.mirea.lab24.task_2;

public class MagicChair implements Chair {
    public void doMagic() {
        System.out.println("Magic is done");
    }

    @Override
    public String toString() {
        return "magic chair";
    }
}
