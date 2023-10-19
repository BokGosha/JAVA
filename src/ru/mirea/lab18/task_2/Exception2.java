package ru.mirea.lab18.task_2;

import java.util.*;

public class Exception2 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner(System.in);
        System.out.print( "Enter an integer: ");
        String intString = myScanner.next();
        int i;
        try {
            i = Integer.parseInt(intString);
            System.out.println(2 / i);
        }
        catch (NumberFormatException e) {
            System.out.println("NumberFormatException");
        }
        catch (ArithmeticException e) {
            System.out.println("Attempted division by zero");
        }
    }
}