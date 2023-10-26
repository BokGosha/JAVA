package ru.mirea.lab24.task_2;

public class Tester {
    public static void main(String[] args) {
        AbstractChairFactory chairFactory = new ChairFactory();

        Client client = new Client();

        VictorianChair victorianChair = chairFactory.createVictorianChair();
        MagicChair magicChair = chairFactory.createMagicChair();
        FunctionalChair functionalChair = chairFactory.createFunctionalChair();

        client.setChair(magicChair);
        client.sit();

        client.setChair(functionalChair);
        client.sit();

        client.setChair(victorianChair);
        client.sit();

        System.out.println("VictorianChair age: " + victorianChair.getAge());
        magicChair.doMagic();
        System.out.println("FunctionalChair sum: " + functionalChair.sum(10, 20));
    }
}
