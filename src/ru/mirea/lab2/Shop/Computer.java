package ru.mirea.lab2.Shop;

public class Computer {
    private String processor;
    private String graphicsCard;
    private int memory;
    private int ram;

    public Computer(String processor, String graphicsCard, int memory, int ram) {
        this.processor = processor;
        this.graphicsCard = graphicsCard;
        this.memory = memory;
        this.ram = ram;
    }

    public Computer() {
    }

    public String getProc() {
        return processor;
    }

    public void setProc(String processor) {
        this.processor = processor;
    }

    public String getGraphCard() {
        return graphicsCard;
    }

    public void setGraphCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor = " + processor +
                ", graphicsCard = " + graphicsCard +
                ", memory = " + memory +
                ", ram = " + ram +
                "}";
    }
}