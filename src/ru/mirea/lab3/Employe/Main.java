package ru.mirea.lab3.Employe;

public class Main {
    public static void main(String[] args) {
        Employe[] employe = {new Employe("Иван Сидоров", 12348.234),
                             new Employe("Иванов Даниил", 42482.434),
                             new Employe("Красников Александр", 10000.999)};

        Report.generateReport(employe);
    }
}