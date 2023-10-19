package ru.mirea.lab18.task_4;

import java.util.Scanner;

public class Exception4 {
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
        finally {
            System.out.println("Good!");
        }
    }
}