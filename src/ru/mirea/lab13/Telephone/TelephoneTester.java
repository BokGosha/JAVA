package ru.mirea.lab13.Telephone;

public class TelephoneTester {
    public static void main(String[] args) {
        Telephone telephone = new Telephone("+79567456732");

        System.out.println(telephone.changeTelephone());
    }
}